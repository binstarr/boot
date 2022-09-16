package ch06;

import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ch06.MyImageFrame.MyImagePanel;

public class ShootingGame extends JFrame {

	JLabel playerLabel;
	JLabel backgroundLabel;

	BufferedImage backImage;
	BufferedImage playerImage;
	// 내부 클래스
		class MyImagePanel extends JPanel{
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(backImage, 0, 0, 500, 500, null);
				g.drawImage(playerImage, 0, 0, 10, 10, null);
			}

		}

	public ShootingGame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		playerLabel = new JLabel(new ImageIcon("player2.png"));
		backgroundLabel = new JLabel(new ImageIcon("bc.jpg"));

//		bufferedImage =  ImageIO.read(new File("bc.jpg"));
		try {
			backImage = ImageIO.read(new File("bc.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			playerImage = ImageIO.read(new File("player2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
	}

	private void addEventListener() {

	}

}
