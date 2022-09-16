package ch03_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


// 외부클래스
class MyFrame2 extends JFrame {

	MyDrawPanel drawPanel;

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("paint 연습");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
		drawPanel.setBackground(Color.gray);
	}

	private void setInitLayout() {
		setVisible(true);
		add(drawPanel);
	}
	// 인스턴스 내부 클래스
	// 내부 클래스
	// 접근 제어 지시자를 설정할 수 있다. 
	// 밑에 public을 private로 설정하면 메인에서 접근 불가능.
	
	// static을 추가하게 되면 정적 내부 클래스라고 한다.
	public static class MyDrawPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);

			g.drawString("ᵔᴥᵔ", 265, 280);
			g.drawString("⁂    ⁂", 170, 170);
			g.drawString("⁂    ⁂", 150, 195);
			g.drawString("⁂    ⁂", 170, 220);
			g.drawString("⁂    ⁂", 150, 245);
			g.drawString("⁂    ⁂", 170, 270);
			g.drawString("⁂    ⁂", 150, 295);
			g.drawString("⁂    ⁂", 170, 320);

			g.drawString("⁂    ⁂", 370, 170);
			g.drawString("⁂    ⁂", 350, 195);
			g.drawString("⁂    ⁂", 370, 220);
			g.drawString("⁂    ⁂", 350, 245);
			g.drawString("⁂    ⁂", 370, 270);
			g.drawString("⁂    ⁂", 350, 295);
			g.drawString("⁂    ⁂", 370, 320);

			g.drawString("☁ミ✲", 200, 70);
			g.drawString("☁ミ✲", 260, 70);
			g.drawString("☁ミ✲", 320, 70);

			g.drawLine(200, 200, 275, 100); // 선을 긋다. x축, y축
			g.drawLine(350, 200, 275, 100); // 선을 긋다. x축, y축
			g.drawRect(200, 200, 150, 150); // 집 틀
			g.drawRect(250, 250, 50, 50); // 창문
			g.drawRect(325, 300, 25, 50); // 문
			g.drawRoundRect(261, 262, 25, 25, 50, 50); // 얼굴형
			g.drawRoundRect(330, 330, 5, 5, 50, 50);
		}

	}// end of MyDrawPanel class
} // end of MyFrame2 class

//public class
public class PaintMainTest {

	public static void main(String[] args) {
		MyFrame2 frame2 = new MyFrame2();
		// --- 인스턴스 내부 클래스를 사용하는 방법
		// 1. 데이터 타입을 선언
		//  외부 클래스 이름으로 접근하고 .연산자 후에 MyDrawPanel(내부 클래스 데이터 타입)을 선언하고 변수명을 지정
		
		// 2. 초기화 하는 방법
		// 외부 클래스가 생성되어 있고 참조 변수로 접근해서 new 내부 클래스(); <-- 생성자로 메모리에 올릴 수 있다.
//		MyFrame2.MyDrawPanel myPanel = frame2.new MyDrawPanel();
		
		// 정적 내부 클래스를 사용하는 방법
		MyFrame2.MyDrawPanel staticMyPanel = new MyFrame2.MyDrawPanel();
	}

}
