package ch06;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiniGame extends JFrame implements KeyListener {

	final int FRAME_WIDTH = 500;
	final int FRAME_HEIGHT = 500;
	int playerX = 200;
	int playerY = 200;
	boolean flag = true;

	BufferedImage backgroundLeft;
	BufferedImage backgroundRight;
	BufferedImage currentBackground;
	BufferedImage playerImage;
	MyDrawPanel myDrawPanel; // 클래스이기 때문에 사용하려면 멤버 변수로 선언을 하고 초기화도 해줘야한다. (add에 넣기 위해서)
	
	public MiniGame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void addEventListener() {
		this.addKeyListener(this);
	}

	private void setInitLayout() {
		setVisible(true);
		this.add(myDrawPanel);
		
	}

	private void initData() {
		setTitle("미니게임");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundLeft = ImageIO.read(new File("images/bc.jpg"));
			playerImage = ImageIO.read(new File("images/player2.png"));
			backgroundRight = ImageIO.read(new File("images/background1.jpg"));
		} catch (IOException e) {
			System.out.println("파일명 및 경로 확장자 확인하기");
			System.exit(0); // 프로그램 자동 종료
		}
		myDrawPanel = new MyDrawPanel();
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println("paintComponent 호출!!");
		if (keyCode == KeyEvent.VK_LEFT) {
			playerX = (playerX < -10) ? 0 : playerX -10;
			playerX -= 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			playerX += 10;
		} else if (keyCode == KeyEvent.VK_UP) {
			playerY -= 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			playerY += 10;
		} else if(keyCode == KeyEvent.VK_SPACE) {
			flag = !flag;
			if(flag == true) {
				currentBackground = backgroundLeft;
			}else {
				currentBackground = backgroundRight;
			}

				
		}
		// 원래 그림을 다시 그려주다 (초기화)
		repaint(); // 안하면 그림이 안움직임
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	// 내부 클래스
	private class MyDrawPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(currentBackground, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
			g.drawImage(playerImage, playerX, playerY, 100, 100, null);
		}
	
	} // end of inner class

}
