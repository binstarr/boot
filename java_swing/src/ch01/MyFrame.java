package ch01;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	// 인스턴스화 될때 가장 먼저 실행되는 코드 - 생성자!! 클래스에서 힙 메모리에 올라갔을때 = 인스턴스화
	public MyFrame() {
		super.setTitle("MyFrame1");
		super.setSize(1300, 800);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	
}
