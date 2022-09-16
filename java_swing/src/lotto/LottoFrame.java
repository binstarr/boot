package lotto;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LottoFrame extends JFrame{

	// 버튼
	// JLabel
	JPanel topBackground = new JPanel();

	
	JLabel jLabel1 = new JLabel(new ImageIcon("Images/bc.jpg"));
	JLabel jLabel2 = new JLabel("추첨하기");
	JLabel jLabel3 = new JLabel("종료하기");
	LottoNumber lottoNumber = new LottoNumber(); // 로또 번호 뽑는 기능만 추출해서 넣기
	
	public void setupLottoNumber() {
		int[] numbers = lottoNumber.createLottonNumbers();
		jLabel1.setText(numbers[0] + "");
	}
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("로또 게임");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jLabel1 = new JLabel(new ImageIcon("Images/bc.jpg"));
		
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new BorderLayout());
		add(topBackground, BorderLayout.CENTER);
		topBackground.setLayout(null);
		
		topBackground.add(jLabel1);
		jLabel1.setSize(500, 500);
		jLabel1.setLocation(0, 0);
		
		add(jLabel2);
		add(jLabel3);
	}
	
	private void addEventListener() {
		
	}
	
}
