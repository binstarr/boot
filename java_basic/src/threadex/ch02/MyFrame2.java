package threadex.ch02;

import javax.swing.JFrame;

public class MyFrame2 extends JFrame {

	int grade = 1;
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread());
				System.out.println("-");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	};

	public MyFrame2() {

	}

}
