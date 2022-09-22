package threadex.ch02;

// 2: 익명 구현클래스 활용 방법
public class MainTest2 {

	public static void main(String[] args) {
		MyFrame2 myFrame2 = new MyFrame2();
		// 쓰래드를 동작 시켜 보세요
		Thread thread = new Thread(myFrame2.runnable);
		thread.start();
		
//		myFrame2.runnable.run();
		
	}

}
