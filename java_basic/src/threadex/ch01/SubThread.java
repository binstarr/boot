package threadex.ch01;

public class SubThread extends Thread {

	// 변수를 선언 : 데이터를 저장 (가지고 쓰거나 저장)
	
	// run 메서드 안에 작업을 할당해주어야 한다.
	@Override
	public void run() {
		int i = 0;
		while (i < 20) {
			i++;
			System.out.println(i + " : " + Thread.currentThread());
		}
	}
}
