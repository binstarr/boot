package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame3 extends JFrame implements ActionListener{
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	private JPanel panel1;
	private JPanel panel2;
	
	public  MyFrame3() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
		
		panel1 = new JPanel();
		panel2 = new JPanel();
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new BorderLayout());
		add(panel1, BorderLayout.CENTER);	
		add(panel2, BorderLayout.SOUTH);	
//		panel1.setBackground(Color.black);
//		panel2.setBackground(Color.black);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
	}
	
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetButton = (JButton)e.getSource();
		
		if(targetButton.equals(button1)) {
			panel1.setBackground(Color.black);
		}else if(targetButton.equals(button2)){
			panel1.setBackground(Color.blue);
		}else {
			panel1.setBackground(Color.red);
		}
		
	}
}

public class Test {

	public static void main(String[] args) {
		new MyFrame3();
	}
	
}
