package ch06;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame07 extends JFrame {

	private JTextArea area;
	
	public MyFrame07() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("키보드 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}
	
	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(area);
	}
	
	private  void addEventListener() {
		// 문제 1. 익명 클래스로 변경해서 구현 : 주석
		// 문제 2. Adapter 클래스가 있을까?
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				displayKeyInfo(e);
			}
		});
	}
	
	private void displayKeyInfo(KeyEvent e) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String info = "c: " + c + "\t" + "keyCode : " + keyCode;
		area.append(info + "\n");
	}
	

	
	
}
