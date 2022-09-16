package ch02;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFramePanelEx1 extends JFrame{
	
	private JButton button1;
	private JButton button2;
	
	// 컴포넌트들을 그룹화 시킬 수 있다. 즉 각각에 배치관리자를 추가로 설정할 수 있다.
	private JPanel panel1;
	private JPanel panel2;
	
	public MyFramePanelEx1() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("패널 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton(" button 1");
		button2 = new JButton(" button 2");
		
		panel1 = new JPanel();
		panel2 = new JPanel();
	}
	
	private void setInitLayout() {
	
		setLayout(new GridLayout(2, 1));
		add(panel1);
		panel1.setBackground(Color.red);
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel1.add(button1);
		
		add(panel2);
		panel2.setBackground(Color.blue);
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel2.add(button2);
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new MyFramePanelEx1();

	} // end of main

}
