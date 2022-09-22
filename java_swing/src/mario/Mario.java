package mario;

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

public class Mario extends JFrame {

	final int FRAME_WIDTH = 1200;
	final int FRAME_HEIGHT = 520;
	final int PLAYER_WIDTH = 70;
	final int PLAYER_HEIGHT = 85;
	int playerX = 0;
	int playerY = 375;
	BufferedImage backgroundImage;
	BufferedImage playerImage;
	BufferedImage playerImage2;
	BufferedImage currentMario;

	MarioImages marioImages;

	public Mario() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("마리오게임");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("images/map2.png"));
			playerImage = ImageIO.read(new File("images/mairo_right.png"));
			currentMario = ImageIO.read(new File("images/mairo_right.png"));
			playerImage2 = ImageIO.read(new File("images/mairo_left.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		marioImages = new MarioImages();

	}

	private void setInitLayout() {
		setVisible(true);
		this.add(marioImages);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				boolean direction = true;
				int keyCode = e.getKeyCode();

				if (keyCode == KeyEvent.VK_LEFT) {
					if (currentMario == playerImage) {
						currentMario = playerImage2;
					}
					playerX = (playerX < -10) ? 0 : playerX - 10;
					playerX -= 10;
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					if (currentMario == playerImage2) {
					}
					currentMario = playerImage;
					playerX += 10;
				} else if (keyCode == KeyEvent.VK_UP) {
					playerY -= 10;
				} else if (keyCode == KeyEvent.VK_DOWN) {
					playerY = (playerY > 370) ? 380 : playerY + 10;
				} else if (keyCode == KeyEvent.VK_SPACE) {
					
				}
				repaint();
			}
		});

	}

	// 내부클래스
	private class MarioImages extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
			g.drawImage(currentMario, playerX, playerY, PLAYER_WIDTH, PLAYER_HEIGHT, null);

		}
	} // end of inner class

}
