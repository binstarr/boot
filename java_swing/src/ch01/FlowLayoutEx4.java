package ch01;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx4 extends JFrame{

	private final int BUTTON_SIZE = 5; 
	private ArrayList<JButton> arrayList = new ArrayList<>();
	
	private FlowLayout flowLayout;
	
	public FlowLayoutEx4() {
		initData();
		setInitLayout();
	}
	
	
	// 초기화 과정 (값을 넣거나 클래스를 메모리에 올리는 과정)
	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i < BUTTON_SIZE; i++) {
			arrayList.add(new JButton("button" + (i+1)));			
		}
		
		
		
//		for(int i = 0; i < buttonsArr.length; i ++) {
//			 buttonsArr[i] = new JButton("button" + (i + 1));
//		}
		
		flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 230); // 메모리에 올리는 과정 // 800 500
	}
	
	// GUI 프로그래밍에서 레이아웃을 설정하는 코드
	private void setInitLayout() {
		setVisible(true);
		setLayout(flowLayout);
		
		System.out.println("arrayList.size(): " +  arrayList.size());
		for(int i = 0; i < arrayList.size(); i++) {
			add(arrayList.get(i));
		}
//		for(int i = 0; i < buttonsArr.length; i ++) {
//			add(buttonsArr[i]);
//		}

	}
	
	public static void main(String[] args) {
		new FlowLayoutEx4();
	} // end of main
	
	
}
