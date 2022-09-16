package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame{
	
	// 배열로 만들어서 코드를 수정
	// 생성시 for문 활용
	// 정 가운데에다 배치를 해주세요 (수직) (500)

	// 배열, ArrayList (멤버 변수 선언과 동시에 초기화)
	private JButton[] buttonsArr = new JButton[5];
	
	private FlowLayout flowLayout;
	
	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}
	
	
	// 초기화 과정 (값을 넣거나 클래스를 메모리에 올리는 과정)
	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		buttonsArr[0] = new JButton("button1");
//		buttonsArr[1] = new JButton("button2");
//		buttonsArr[2] = new JButton("button3");
//		buttonsArr[3] = new JButton("button4");
//		buttonsArr[4] = new JButton("button5");
		
		for(int i = 0; i < buttonsArr.length; i ++) {
			 buttonsArr[i] = new JButton("button" + (i + 1));
		}
		
		flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 230); // 메모리에 올리는 과정 // 800 500
	}
	
	// GUI 프로그래밍에서 레이아웃을 설정하는 코드
	private void setInitLayout() {
		setVisible(true);
		setLayout(flowLayout);
		
		for(int i = 0; i < buttonsArr.length; i ++) {
			add(buttonsArr[i]);
		}

	}
	
	public static void main(String[] args) {
		new FlowLayoutEx3();
	} // end of main
	
	
}
