package test.ex07;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bubble extends JLabel implements Moveable {

	BackgroundBubbleService backgroundBubbleService;
	// 의존성 컴포지션 관계
	Player player;

	// 버블의 위치 상태
	private int x;
	private int y;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;

	// 적군을 맞춘 상태
	private int state; // 0(일반 물방울) , 1(적을 가둔 물방울)

	private ImageIcon bubble; // 물방울
	private ImageIcon bubbled; // 적을 가둔 물방울
	private ImageIcon bomb; // 물방울이 터진 상태

	private boolean leftWallCrush;
	private boolean rightWallCrush;

	public Bubble(Player player) {
		this.player = player;
		initDate();
		setInitLayout();
		initThread();
		new Thread(new BackgroundBubbleService(this)).start();
	}

	private void initDate() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;
	}

	private void setInitLayout() {
		// 플레이어가 있는 위치에서 태어나야 한다.
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	private void initThread() {
		// 버블은 쓰래드가 하나면 된다.

		new Thread(new Runnable() {
			@Override
			public void run() {
				if (player.getPWay() == PlayerWay.LEFT) {
					left();
				} else {
					right();
				}

			}
		}).start();
//		람다 표현식 - 컴파일러가 추론을 하여 위의 식과 같지만 줄여서 표현한다.
//		new Thread(() -> {}).start();
	}

	@Override
	public void left() {
		left = true;
		for (int i = 0; i < 400; i++) {
				x--;
				setLocation(x, y);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		up();
	}

	@Override
	public void right() {
		right = true;
		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void up() {
		while (true) {
			y--;
			setLocation(x, y);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub

	}

}
