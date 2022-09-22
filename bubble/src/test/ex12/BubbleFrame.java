package test.ex12;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import lombok.Getter;

@Getter
public class BubbleFrame extends JFrame {

	private BubbleFrame mContext = this;
	// 포함관계 (컴포지션 관계)
	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;

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
		
		enemy = new Enemy(mContext);
		player = new Player(mContext);

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null); // absolute 레이아웃
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치하기
		add(player);
		add(enemy);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
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
					if (!player.isUp() && !player.isDown()) {
						player.up();
					}
					break;
				case KeyEvent.VK_SPACE:
					player.attack(); // 객체지향패러다임으로 아래의 행위를 player한테 넣어줌
//					Bubble bubble = new Bubble(mContext);  // 스페이스바를 눌렀을 때 생성되어야 하기 떄문에 여기서 메모리에 올려줌 ★★★
//					add(bubble); // JLabel 올리는 방식 add						
					break;
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
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

	// 메인함수가 있는 코드는 모든 객체들에서 주소값을 알 수 있다.
	public static void main(String[] args) {
		new BubbleFrame();
	}

}
