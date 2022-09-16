package ch06;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyImageFrame extends JFrame {

	// 재료 선정
	// 1. JLabel 사용해서 이미지 그리기
	// 2. 이벤트 리스너 등록 및 구현
	JLabel playerLabel;
	JLabel backgroundLabel;
	
	BufferedImage bufferedImage;
	MyImagePanel myImagePanel;
	
	// 내부 클래스
	class MyImagePanel extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(bufferedImage, 0, 0, 500, 500, null);
		}

	}

	MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX() - (playerLabel.getBounds().width) / 2;
			int y = e.getY() - (playerLabel.getBounds().height) / 2;
			playerLabel.setLocation(x, y);

		}
	};

	public MyImageFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		playerLabel = new JLabel(new ImageIcon("player2.png")); // 1.객체 생성 , 초기화 단계
		backgroundLabel = new JLabel(new ImageIcon("bc.jpg"));
		
		try {
			bufferedImage = ImageIO.read(new File("bc.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		myImagePanel = new MyImagePanel(); 
		
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(null);
		myImagePanel.setSize(500, 500);
		myImagePanel.setLocation(0, 0);
		add(myImagePanel);
		
		// 좌표 기반 배치 관리자
		// 사이즈 , 위치
		playerLabel.setSize(200, 200);
		playerLabel.setLocation(100, 100);
//		this.add(playerLabel);
		myImagePanel.add(playerLabel);

//		backgroundLabel.setSize(500, 500);
//		backgroundLabel.setLocation(0, 0);
//		this.add(backgroundLabel);

	}

	private void addEventListener() {
		this.addMouseListener(mouseListener);
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int x = playerLabel.getX();
				int y = playerLabel.getY();
				int MOVE_SPEED = 50; 
				final int LEFT = 37;
				final int TOP = 38;
				final int RIGHT = 39;
				final int BOTTOM = 40;
				if(e.getKeyCode() == LEFT) {
					if(x < 0) {
						MOVE_SPEED = 0;
					}else {
						playerLabel.setLocation(x - MOVE_SPEED, y);
					}
					
				}else if(e.getKeyCode() == TOP) {
					if(y < 5) {
						MOVE_SPEED = 0;
					}else {
						playerLabel.setLocation(x ,  y - MOVE_SPEED);
					}
					
				}else if(e.getKeyCode() == RIGHT) {
					if(x > 300) {
						MOVE_SPEED = 0;
					}else {
						playerLabel.setLocation((x + MOVE_SPEED), y);
					}
					
				}else if(e.getKeyCode() == BOTTOM) {
					if(y > 400) {
						MOVE_SPEED = 0;
					}else {
						playerLabel.setLocation(x, y + MOVE_SPEED);
					}
				}
			}
		});
	}
}
