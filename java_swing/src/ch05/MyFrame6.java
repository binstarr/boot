package ch05;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MyFrame6 extends JFrame {

	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("어댑터 클래스 이용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
	}
	
	private void addEventListener() {
		// 추상 메스닥 5개 (불필요한 코드가 많아서 가독성이 떨어진다.)
		this.addMouseListener(new MyMouseListener());	
		}
	
		// 내부 클래스 생성
		private class MyMouseListener extends MouseAdapter { // MouseAdapter 추상 클래스라서 내가 클래스 만들어서 위에 new로 사용 추상클래스는 new
																// 불가

			// 사용하고 싶은 기능만 재정의 가능하다.
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();

				System.out.println("x : " + x);
				System.out.println("y : " + y);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스 포커스가 프레임 안으로 들어 왔습니다.");
			}

		}// end of inner class
	
//	public abstract class Mouse 
	
}
