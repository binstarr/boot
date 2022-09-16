package ch01;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx01 extends JFrame {

	private ArrayList<JButton> arrayList = new ArrayList<>();

	private String[] strArr = { "동", "서", "남", "북", "센터" };
	private String[] directions = { BorderLayout.EAST, BorderLayout.WEST, BorderLayout.SOUTH, BorderLayout.NORTH,
			BorderLayout.CENTER };

	private BorderLayout borderLayout;

	public BorderLayoutEx01() {
		initData();
		setInitLayout();
	}

	private void initData() {

		setTitle("보더 레이아웃 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JButton 초기화 완료 됨.. (멤버 변수로 처리)
		borderLayout = new BorderLayout();

		for (int i = 0; i < strArr.length; i++) {
			arrayList.add(new JButton(strArr[i]));
		}

	}

	private void setInitLayout() {

		setVisible(true);
		setLayout(borderLayout);

		for (int i = 0; i < arrayList.size(); i++) {
			add(directions[i], arrayList.get(i));
		}
//		add(borderLayout.EAST, button1);
//		add(borderLayout.WEST, button2);
//		add(borderLayout.SOUTH, button3);
//		add(borderLayout.NORTH, button4);
//		add(borderLayout.CENTER, button5);

		// 프레임에 add 하는 동작만 시켜 주면 됩니다.

	}

	public static void main(String[] args) {
		new BorderLayoutEx01();
	} // end of main

} // end of class
