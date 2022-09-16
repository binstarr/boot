package ch05;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyImageFrame extends JFrame{
	
	// 재료 선정
	//1. JLabel 사용해서 이미지 그리기
	JLabel playerLabel;
	
	public MyImageFrame() {
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
		
	}

}
