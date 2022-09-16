package ch02;

import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents extends JFrame{
	
	private JButton button1;
	private JLabel label; // 글자를 넣어서 화면에 띄울 수 있다.
	private JTextField textField; // 사용자의 입력 값을 받을 수 있는 컴포넌트
	private JPasswordField passwordField; // 사용자에 비번을 받는 컴포넌트
	private JCheckBox checkBox;
	
	
	public void inputScannerData(String text) {
		this.textField.setText(text);
	}
	


	public MyComponents() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("컴포넌트 확인");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("Login");
		label = new JLabel("JLABEL");
		textField = new JTextField("아이디 입력", 20); // 20글자를 적을 수 있다.
		passwordField = new JPasswordField("비밀번호 입력", 20);
		checkBox = new JCheckBox("동의");
		
		makeBox();
		putBox();
	}
	
	private void setInitLayout() {
		setVisible(true);
		// 좌표값으로 알아서 배치를 해주세요 !!!
		setLayout(null);
		add(button1);
		add(label);
		add(textField);
		add(passwordField);
		add(checkBox);
	}
	
	private void makeBox() {
		button1.setSize(100, 70);
		label.setSize(100,100);
		textField.setSize(200, 30);
		passwordField.setSize(200, 30);
		checkBox.setSize(50, 50);
		
	}																	//setSize(1000, 1000);
	
	private void putBox() {
		button1.setLocation(570, 100);
		label.setLocation(500,10);
		textField.setLocation(350, 100);
		passwordField.setLocation(350, 140);
		checkBox.setLocation(620, 170);
	}
	

	

}
