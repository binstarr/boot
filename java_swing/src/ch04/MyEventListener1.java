package ch04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventListener1 {
	
	class MyFrame1 extends JFrame implements ActionListener{
		
		JButton button1;
		JButton button2;
		
		public MyFrame1() {
			initData();
			setInitLayout();
			addEventListener();
		}
		
		private void initData() {
			setSize(500, 500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			button1 = new JButton("button1");
			button2 = new JButton("button2");
		}
		
		private void setInitLayout() {
			setVisible(true);
			setLayout(new FlowLayout());
			add(button1);
			add(button2);
		}
		
		private void addEventListener() {
			// 등록을 해주어야한다.
			button1.addActionListener(this);
			button2.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("콜백 메서드");
			System.out.println("클릭");
			System.out.println(e.toString());
			
		}
		
		
	}

}
