package ch05;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyImageFrame2 extends JFrame implements MouseListener{
	
	// 재료 선정
	//1. JLabel 사용해서 이미지 그리기
	// 2. 이벤트 리스너 등록 및 구현
	JLabel playerLabel;
	
	public MyImageFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		playerLabel = new JLabel(new ImageIcon("player2.png")); // 1.객체 생성 , 초기화 단계
	}
	
	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(null);
		// 좌표 기반 배치 관리자
		// 사이즈 , 위치
		playerLabel.setSize(200, 200);
		playerLabel.setLocation(100, 100);
		this.add(playerLabel);
	}
	
	private void addEventListener() {
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x =  e.getX() - (playerLabel.getBounds().width)/2;
		int y =  e.getY() - (playerLabel.getBounds().height)/2;
		playerLabel.setLocation(x, y);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
