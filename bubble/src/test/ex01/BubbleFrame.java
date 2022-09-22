package test.ex01;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	// 포함관계 (컴포지션 관계)
	private JLabel backgroundMap; // JLabel은 사이즈를 정할 수 없어서 정해진 이미지로 작업하기 편하고 
	private Player player;						//버퍼드 이미지는 세팅이 좀 더 귀찮지만 사이즈를 내가 정할 수 있다.

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setSize(1000, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap); // 기본적으로 패널이 붙어 있어서 내가 만든 프레임 틀 안에 이미지 붙이기

		player = new Player();
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null); // absolute 레이아웃
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치하기
		add(player);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				}

			}
		});
	} // end of addEventListener

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
