package ch05;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventListenerEx2 extends JFrame {

	JLabel label;
	final int LABEL_WIDTH = 100;
	final int LABEL_HEIGHT = 100;
	int xPosition = 100;
	int yPosition = 100;

	public MouseEventListenerEx2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Hello Java");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);

		// 배치 관리자가 없어서 사이즈, 좌표 위치 필요함
		// 사이즈, 좌표값 위치
//		label.setSize(100, 100);
//		label.setLocation(100, 100);
		label.setBounds(xPosition, yPosition, LABEL_WIDTH, LABEL_HEIGHT);
		System.out.println("bounds : " + label.getBounds());
		add(label);

	}

	private void addEventListener() {
		// 익명 구현 클래스로 코딩
		this.addMouseListener(new MouseListener() {
			
			// 마우스 버튼이 눌러졌다가 떨어졌을 때 실행 되는 메서드
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("1111111111111111111111111111");
				
			}
			// 마우스가 눌러졌을 때 실행 되는 메서드
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("222222222222222");
				
			}
			// 마우스가 감지하고 있는 객체에서 나갔을 때 실행되는 메서드
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("333333333333333");				
			}
			// 마우스가 감지하고 있는 객체에서 들어왔을 때 실행되는 메서드
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("444444444444444");
			}
			// 마우스 클릭
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("55555555555555555555");
				label.setLocation(e.getX(), e.getY() - (label.getBounds().height));
			}
		});
	}

	public static void main(String[] args) {
		new MouseEventListenerEx2();
	}
}
