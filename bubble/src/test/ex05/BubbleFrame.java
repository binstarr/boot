package test.ex05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	// 포함관계 (컴포지션 관계)
	private JLabel backgroundMap;
	private Player player;

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

					// L L L L L
					// 5개의 쓰래드가 생성되서 속도가 더 빨라짐
					// 이것을 막기 위한 if문 조건 !player.isLeft()
					// 1. 플레이어가 왼쪽으로 가고 있지 않을때 player.left 실행해야 한다.
					// 2. 왼쪽벽에 맞닿아 있으면 left() 메서드를 실행시키면 안된다.
					if (!player.isLeft() && !player.isLeftWallCrash()) {
						// boolean의 게터 셋터는 is가 들어감
						player.left();
					}
					break;

				case KeyEvent.VK_RIGHT:
					if (!player.isRight() && !player.isRightWallCrash()) {
						player.right();
					}
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽으로 가는거 멈춰야해
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					// 오른쪽으로 가는거 멈춰야해
					player.setRight(false);
					break;

				default:
					break;
				}
			}
		});
	} // end of addEventListener

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
