package games;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonGame extends JFrame {

	BufferedImage player;
	JButton startButton;
	JButton stopButton;
	JPanel jPanel;
	int playerX = 50;
	int playerY = 250;
	boolean flag = true;

	DrawPanel drawPanel;

	public ButtonGame() {
		initData();
		setInitLayout();
		addEventListener();

		Thread thread = new Thread(drawPanel);
		thread.start();
	}

	private void initData() {
		setTitle("버튼게임");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			player = ImageIO.read(new File("images/player3.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		drawPanel = new DrawPanel();
		jPanel = new JPanel();
		startButton = new JButton("START");
		stopButton = new JButton("STOP");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new BorderLayout());
		add(drawPanel);
		this.add(jPanel, BorderLayout.SOUTH);
		jPanel.setBackground(Color.red);
		jPanel.add(startButton);
		jPanel.add(stopButton);

	}

	private void addEventListener() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}

		});

	}

	private class DrawPanel extends JPanel implements Runnable {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(player, playerX, playerY, 100, 100, null);
		}

		@Override
		public void run() {
			boolean direction = true;
			
			while (true) {
				if(flag) {
					if (direction == true) {
						playerX += 10;
					} else {
						playerX -= 10;
					}
					if (playerX == 400) {
						direction = false;
					}
					if (playerX == 100) {
						direction = true;
					}
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					repaint();
				}
				
			} // end of while
		}
	}// end of inner class

	public static void main(String[] args) {
		new ButtonGame();
	}// end of main
}
