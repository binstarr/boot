package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame{
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	
	private FlowLayout flowLayout;
	
	public FlowLayoutEx2() {
		initData();
		setInitLayout();
	}
	
	
	// 초기화 과정 (값을 넣거나 클래스를 메모리에 올리는 과정)
	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("button 1");
		button2 = new JButton("button 2");
		button3 = new JButton("button 3");
		button4 = new JButton("button 4");
		button5 = new JButton("button 5");
		button6 = new JButton("button 6");
		button7 = new JButton("button 7");
		
		flowLayout = new FlowLayout(FlowLayout.RIGHT, 50, 100); // 메모리에 올리는 과정
	}
	
	// GUI 프로그래밍에서 레이아웃을 설정하는 코드
	private void setInitLayout() {
		setVisible(true);
		
		setLayout(flowLayout);
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
	} // end of main
	
	
}
