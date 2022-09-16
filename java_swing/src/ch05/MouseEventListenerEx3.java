package ch05;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventListenerEx3 extends JFrame {

	JLabel label;
	final int LABEL_WIDTH = 100;
	final int LABEL_HEIGHT = 100;
	int xPosition = 100;
	int yPosition = 100;
	MouseListener mouseListener = new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			label.setLocation(e.getX(), e.getY() - (label.getBounds().height));
			
		}
	};

	public MouseEventListenerEx3() {
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
		this.addMouseListener(mouseListener);
	}

}
