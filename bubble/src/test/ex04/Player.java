 package test.ex04;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player extends JLabel implements Moveable {

	// player 위치 상태
	private int x;
	private int y;
	
	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	
	//플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	private ImageIcon playerR, playerL;

	public Player() {
		initData();
		setInitLayout();
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		x = 400;
		y = 540;
		left = false;
		right = false;
		up = false;
		down = false;
	}

	private void setInitLayout() {
		
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);
	}

	@Override
	public void left() {
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
						Thread.sleep(10);//0.01초
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
				for(int i = 0; i < 130 / JUMPSPEED; i++) {
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
				for(int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
				down = false; // for문이 끝나고 down(); 종료
				// 상태값을 다룰때는 상황이 변하면 확실하게 초기화 처리를 하자!!
			}
		}).start();
	}

}
