package games;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	BufferedImage background;
	BufferedImage player;
	BufferedImage player3;

	ImagePanel imagePanel;

	int playerX = 200;
	int playerY = 200;

	int player3X = 100;
	int player3Y = 400;
	boolean flag = true;

	public MainFrame() {
		initData();
		setInitLayout();
		addEventListener();

		Thread thread = new Thread(imagePanel);
		thread.start();
	}

	private void initData() {
		setTitle("쓰레드를 활용한 미니게임");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			background = ImageIO.read(new File("images/bc.jpg"));
			player = ImageIO.read(new File("images/player2.png"));
			player3 = ImageIO.read(new File("images/player3.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(imagePanel);
	}

	private void addEventListener() {
		// 키보드 이벤트
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if (code == KeyEvent.VK_UP) {
					playerY -= 10;
				} else if (code == KeyEvent.VK_DOWN) {
					playerY += 10;
				} else if (code == KeyEvent.VK_LEFT) {
					playerX -= 10;
				} else if (code == KeyEvent.VK_RIGHT) {
					playerX += 10;
				} else if (code == KeyEvent.VK_SPACE) {
					flag = !flag;
//					if (flag == false) {
//					} else {
//						new Thread(imagePanel).start();
//					}
				}
				if (playerX == player3X && playerY == player3Y) {
					player = null;
				}
//				repaint();
			}
		});
	}

	// 내부 클래스 생성
	private class ImagePanel extends JPanel implements Runnable {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(player, playerX, playerY, 100, 100, null);
			g.drawImage(player3, player3X, player3Y, 100, 100, null);
		}

		@Override
		public void run() {
			// true : 오른쪽으로 가고 있는 상황
			// false : 왼쪽으로 가고 있는 상황
			boolean direction = true;

			while (true) {
				System.out.println("진행중!");
				if (flag) {
					if (direction == true) {
						player3X += 10;
					} else {
						player3X -= 10;
					}
					// 만약 x 좌표가 500 보다 크다면 direction false 변경한다.
					// 그리고 x 좌표가 100보다 작다면 direction true 변경한다.
					if (player3X == 500) {
						direction = false;
					}

					if (player3X == 100) {
						direction = true;
					}

					try {
						// +10 이동 후 그리기를 계속 반복
						Thread.sleep(30);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					repaint();
				}
				// 만약 direction이 true면 x 좌표를 증가
				// 아니라면 즉 false 면 x좌표를 감소

			} // end of while

		}
	} // end of inner class

	public static void main(String[] args) {
		new MainFrame();
	}

}
