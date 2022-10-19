package frame;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test5 extends JFrame {

	JLabel la;

	public Test5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.setLayout(null);

		la = new JLabel("Hello");

		la.setLocation(30, 30);

		la.setSize(50, 20);

		c.add(la);

		MyMouseAdapter l = new MyMouseAdapter();

		// 이벤트 소스 : 이벤트를 발생시키는 대상.

		// (여기서는 컨텐트팬, =컨테이너, =JPanel)

		// 이벤트 리스너 : 이벤트를 처리하는 객체

		// 이벤트 소스에 이벤트 리스너를 연결!!

		// 이벤트 소스.addXXXListener(이벤트리스너); 메소드 호출을 통해 연결!

		c.addMouseListener(l);

		c.addMouseMotionListener(l);

		setSize(250, 250);

		setVisible(true);

	}

	class MyMouseAdapter extends MouseAdapter {

		@Override
		public void mouseDragged(MouseEvent e) {

			System.out.println("mouseDragged");

		}

	}

	public static void main(String[] args) {

		new Test5();

	}

}
