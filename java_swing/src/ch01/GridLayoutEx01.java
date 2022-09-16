package ch01;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx01 extends JFrame{
	
	// ArrayList 사용방법 숙지!!
	private ArrayList<JButton> arrayList = new ArrayList<>();
	private String[] strArr = {"가", "나", "다", "라"};
	
	private GridLayout gridLayout;

	public GridLayoutEx01() {
		
		initData();
		setInitLayout();
		
	} // end of GridLayoutEx01
	
	private void initData() {
		
		setTitle("그리드 레이아웃 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i < strArr.length; i++) {
			arrayList.add(new JButton(strArr[i]));
		}
		
	} // end of initData()
	
	private void setInitLayout() {
		setVisible(true);
		// setLayout :  JFrame의 배치 관리자를 지정한다.
		setLayout(new GridLayout(4,1));
		
		for(int i = 0; i < arrayList.size(); i++) {
			add(arrayList.get(i));
		}
		
	} // end of setInitLayout()
	
	public static void main(String[] args) {
		new GridLayoutEx01();
	} // end of main
	
}
