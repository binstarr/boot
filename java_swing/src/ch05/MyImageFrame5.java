package ch05;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyImageFrame5 extends JFrame {

	// 재료 선정
	// 1. JLabel 사용해서 이미지 그리기
	// 2. 이벤트 리스너 등록 및 구현
	JLabel playerLabel;
	JLabel backgroundLabel;

	BufferedImage bufferedImage;
	MyImagePanel myImagePanel;
	boolean isDragged;

	int clickX;
	int clickY;

	public MyImageFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		playerLabel = new JLabel(new ImageIcon("Images/player2.png")); // 1.객체 생성 , 초기화 단계
		backgroundLabel = new JLabel(new ImageIcon("Images/bc.jpg"));

		try {
			bufferedImage = ImageIO.read(new File("Images/bc.jpg"));
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

	// 내부 클래스
	class MyImagePanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(bufferedImage, 0, 0, 500, 500, null);
		}

	}

	MouseListener mouseListener = new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				isDragged = false;

			}

			@Override
			public void mousePressed(MouseEvent e) {
				if(playerLabel.contains(e.getX(), e.getY())) {
					isDragged = true;					
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent move) {
				

			}
		};

	private void addEventListener() {
		myImagePanel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				if(isDragged) {
//				 playerLabel. = e.getX() - offX;
				}

			}
		});

	}

	public static void main(String[] args) {
		new MyImageFrame5();
	}
}
