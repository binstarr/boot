package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
	
	JButton button1;

	public FlowLayoutEx() {
		setTitle("버튼 배치해보기");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		button1 = new JButton("button 1"); // 선언만 한 버튼을 메모리에 올림
		add(button1);
	}
	
	// 코드의 시작점
	public static void main(String[] args) {
		new FlowLayoutEx();
	} // end of main
	
}
