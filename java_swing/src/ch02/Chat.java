package ch02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Chat extends JFrame {

	private JTextField textField;
	private JTextField textField1;

	private JPanel panel1;
	private JPanel panel2;

	private JPanel panel3;
	private JPanel panel4;

	private JButton friendsButton;
	private JButton chatButton;
	private JButton extraButton;
	private JButton button1;

	public void inputScannerData(String text) {
		this.textField.setText(text);
	}

	public Chat() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("chatMessenger");
		setSize(490, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel1 = new JPanel();
		panel2 = new JPanel();

		panel3 = new JPanel();
		panel4 = new JPanel();

		friendsButton = new JButton("fr");
		chatButton = new JButton("ch");
		extraButton = new JButton("ooo");
		button1 = new JButton("전송");
	}

	public void panel1() {
		add(friendsButton);
		add(chatButton);
		add(extraButton);
		add(panel1);
		friendsButton.setSize(70, 30);
		friendsButton.setLocation(5, 30);

		chatButton.setSize(70, 30);
		chatButton.setLocation(5, 70);

		extraButton.setSize(70, 30);
		extraButton.setLocation(5, 110);

		panel1.setSize(80, 600);
		panel1.setLocation(0, 0);

	}

	public void panel2() {
		add(panel2);
		add(button1);

		textField = new JTextField("채팅 검색", 20);
		textField1 = new JTextField("채팅 입력", 20);
		add(textField);
		add(textField1);
		makeBox();

		panel2.setLayout(new BorderLayout(0, 10));
		panel2.setSize(420, 600);
		panel2.setLocation(80, 0);

		panel2.add(panel3);
		panel2.add(panel4);

		panel3.setSize(350, 300);
		panel3.setLocation(20, 70);
		;

		textField1.setSize(300, 70);
		textField1.setLocation(100, 410);
		button1.setSize(60, 70);
		button1.setLocation(410, 410);
		panel4.setBackground(Color.gray);

	}

	private void makeBox() {
		textField.setSize(350, 20);
		textField.setLocation(100, 30);
	}

	private void setInitLayout() {
		setLayout(null);
		panel1();
		panel2();
		setVisible(true);
	}

}
