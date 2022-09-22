package test.ex10;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

// new 가능한 녀석들 : 게임에 존재할 수 있다 (추상 메서드를 가질 수 없다. = 추상메서드를 일반 메서드로 만들었다)
@Getter
@Setter
public class Player extends JLabel implements Moveable {

	BubbleFrame mContext;

	// player 위치 상태
	private int x;
	private int y;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 플레이어의 방향 상태
	PlayerWay pWay;

	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;

	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	private ImageIcon playerR, playerL;

	public Player(BubbleFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
		new Thread(new BackgroundPlayerService(this)).start();

	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		x = 400;
		y = 535;
		left = false;
		right = false;
		up = false;
		down = false;
	}

	private void setInitLayout() {

		setIcon(playerR);
		pWay = pWay.RIGHT;
		setSize(50, 50);
		setLocation(x, y);
	}

	@Override
	public void left() {
		this.pWay = PlayerWay.LEFT;
		left = true;
		// 누를수록 빨라지는 이유는 쓰레드가 계속 생성이 되면서 x 쓰래드 개수로 가속도가 붙는다
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (left) {
					setIcon(playerL); // 이미지 세팅 (setIcon 안에 삽입한 이미지가 나옴)
					x = x - SPEED;
					setLocation(x, y); // 움직임을 주기 위해 좌표 위치를 계속 줌
					try {
						Thread.sleep(10);// 0.01초
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}).start();

	}

	@Override
	public void right() {
		this.pWay = PlayerWay.RIGHT;
		right = true;

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (right) {
					setIcon(playerR);
					x = x + SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}).start();

	}

	@Override
	public void up() {
		System.out.println("점프");
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				// 반복 65
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					// 535 - 2 를 65번 반복
					y = y - JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				up = false;
				down();
			}
		}).start();

	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {

				while (down) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	public void attack() {

		new Thread(() -> {
			Bubble bubble = new Bubble(mContext);
			mContext.add(bubble);
			if (pWay == PlayerWay.LEFT) {
				bubble.left();
			} else {
				bubble.right();
			}
		}).start();

	}

}
