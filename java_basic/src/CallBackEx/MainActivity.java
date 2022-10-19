package CallBackEx;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 콜백 받는 객체 : OnCallBackButtonAction 구현해서 메서드를 정의한다.
public class MainActivity extends JFrame implements OnCallBackButtonAction {

	int count;
	JLabel label;
	SubActivity subActivity;
	
	public MainActivity() {
	
		count = 0;
		label = new JLabel(count + "");
		setLayout(new FlowLayout());
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		subActivity = new SubActivity(this);
		
	}	
	
	public void addCount() {
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickPlusButton() {
		System.out.println("누군지는 모르겠는데 콜백 되어져서 여기 메서드가 실행되었다.");
		count++;
		label.setText(count + "");
			
		
	}

	@Override
	public void clickMinusButton() {
		System.out.println("여기도 실행!");
		count--;
		label.setText(count + "");
	}
}
