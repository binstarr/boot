package ch01;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx01 extends JFrame{
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	public NoLayoutEx01() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("좌표값으로 버튼 배치하기");
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
	}
	
	private void setInitLayout() {
		setVisible(true);
		// 배치 관리자 (좌표값으로 배치 하기 위해서는 반드시 null을 입력해야 한다)
		this.setLayout(null);
		// get, set
		// 버튼들의 사이즈를 지정
		button1.setSize(100, 100);
		button2.setSize(100, 100);
		button3.setSize(100, 100);
		
		// 버튼들의 좌표값을 지정
		button1.setLocation(0, 0);
		button2.setLocation(100, 100);
		button3.setLocation(200, 200);
		
		add(button1);
		add(button2);
		add(button3);
	}
	
	// 버튼의 크기를 지정하는 기능
	private void setMyButtonSize(JButton button, int width, int height) {
		button.setSize(width, height);
		// button1 - wh 50
		// button2 - wh 100
		// button3 - wh 150
//		return button;

		// 으로 만드는 메서드를 구현해보세요
	}
	
	private void setMyButtonPosition() {
		// 겹치지 않게 코드를 완성해보세요
	}

	public static void main(String[] args) {
		new NoLayoutEx01();

	}// end of main

}
