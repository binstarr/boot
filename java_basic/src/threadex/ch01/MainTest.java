package threadex.ch01;

public class MainTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		SubThread subThread1 = new SubThread();
		SubThread subThread2 = new SubThread();
		SubThread subThread3 = new SubThread();
		
		subThread1.start();
		subThread2.start();
		subThread3.start();
		
		// Thread 란?
		// process : 프로그램이 실행이 되면 OS로 부터 메모리를 할당 받아 프로세스 상태가 됨.
		// thread : 하나의 프로세스에는 하나 이상의 thread 를 가지게 되고, 실제 작업을 수행하는 
		// 단위는 thread이다.
		
		// multi threading 이란
		// 여러 쓰래드가 동시에 수행되는 프로그래밍, 여러 작업이 동시에 실행되는 효과를 만들어 낼 수 있다.
		// thread는 각각 자신만에 변수, 메서드 즉 작업공간을 가진다. 
		// 즉 자기자신의 context 가진다.
		
		// 멀티 쓰래딩프로그램시 주의점
		// 각 thread 사이에서 공유하는 자원이 있을 수 있다.
		// 여러 쓰래드가 자원을 공유하여 작업이 수행되는 경우 서로 자원을 차지하려는
		// race condition이 발생할 수 있다.(의도하지 않은 결과를 만들어 낼 수 있다.)
		
		// 이렇게 여러 Thread가 공유하는 자원중 경쟁이 발생하는 부분을 critical section (임계 영역)이라고 한다.
		// critical section 문제가 발생할 수 있기 때문에 안정적인 프로그램을 처리하기 위해서는 
		// 동기화( 일종의 순차적 수행 ) 처리를 해야 한다. ( 하지 않으면 오류 발생 가능성이 높다)

	}

}
