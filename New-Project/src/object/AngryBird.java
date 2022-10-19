package object;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class AngryBird {
	public class Player extends JLabel {

		// 위치상태
		private int x;
		private int y;

		// 움직임 상태
		private boolean left;
		private boolean right;
		private boolean down;

		// 속도 상태
		private final int SPEED = 4;

		// 이미지
		private ImageIcon player;

		//생성
		public Player() {
			initData();
			setInitLayout();

		}

		//초기
		private void initData() {
			player = new ImageIcon("player.png");

			x = 300;
			y = 535;
			left = false;
			right = false;
			down = false;

		}
		
		private void setInitLayout() {
			setIcon(player); 
			setLocation(x, y);
			setSize(50, 50);
		}

//		public void right() {
//			right = true;
//			new Thread(new Runnable() {
//
//				@Override
//				public void run() {
//					while (right) {
//						setIcon(player);
//						x += SPEED;
//						setLocation(x, y);
//						try {
//							Thread.sleep(10);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//					right = false;
//				}
//			}).start();
//		}
	}
}
