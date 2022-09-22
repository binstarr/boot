package threadex.ch02;

import javax.swing.JFrame;

// 작업자를 만드는 두번째 방법 (인터페이스 활용)
public class MyFrame1 extends JFrame implements Runnable {

	@Override
	public void run() {
		// 병렬처리 코드를 넣어주면 된다.
		for (int i = 0; i < 10; i++) {
			System.out.print("i : " + i + " \t ");
		}
	}

//	public static void main(String[] args) {
//
//		MyFrame1 myFrame1 = new MyFrame1();
//		// 쓰래드를 구현한 상태! 그러면 동작은 어떻게 시켜야 할까??
////			myFrame1.run();
//
//		// Thread
//		Thread t1 = new Thread(myFrame1);
//		t1.start();
//
//	}

}
