package ch04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame2 extends JFrame implements ActionListener {
	JButton button1;
	JButton button2;
	JPanel jPanel;

	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		jPanel = new JPanel();
	}

	private void setInitLayout() {
		setVisible(true);
//		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(jPanel);
		jPanel.add(button1);
		jPanel.add(button2);
	}

	private void addEventListener() {
		// 등록을 해주어야 한다.
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	// 재정의 됨!!
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 만약 e라는 녀석에 주체가 넘어 온다면 현재 객체와 같은지 확인을 한다.
		// 다운 캐스팅
		JButton targetButton = (JButton)e.getSource();
		
		System.out.println(targetButton.getText());
		if(targetButton.getText().equals(button1.getText())) {
			System.out.println("button1 이 눌러 졌습니다.");
			jPanel.setBackground(Color.black);
		}else {
			System.out.println("button2 이 눌러 졌습니다.");
			jPanel.setBackground(Color.blue);

		}
//		System.out.println("콜백 메서드"); 0x68 0x6f 0x6d 0x65
//		System.out.println("버튼이 눌러 졌습니다.!!");
//		System.out.println(e.toString());

	}

}

public class EventListenerEx2 {
	public static void main(String[] args) {
		new MyFrame2();

	}

}
