package ch05;

import java.awt.Graphics;
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

public class Test extends JFrame {
	
	private BufferedImage ball;
	
	private JPanel backGroundPanel;
	private JLabel ballLabel;
	
	public Test() {
		initData();
		setInitData();
		addEventListener();
	}
	
	private void initData() {
		setSize(1200, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ballLabel = new JLabel(new ImageIcon("player2.png"));
		
		try {
			ball = ImageIO.read(new File("player2.png"));
		} catch (IOException e) {
			System.out.println("사진이 없거나 경로가 잘못 되었습니다.");
			e.printStackTrace();
		}
	}
	
	private void setInitData() {
		setVisible(true);
		setLayout(null);
//		label.setBounds(xPosition, yPosition, LABEL_WIDTH, LABEL_HEIGHT);
		ballLabel.setBounds(50, 50, 180, 180);
//		ballLabel.setSize(180, 180);
//		ballLabel.setLocation(50, 50);
		add(ballLabel);
	}
	
	private void addEventListener() {
		this.addMouseListener(new MouseListener() {
			
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
				ballLabel.setLocation(e.getX()-80, e.getY()-120);
				
			}
		});
	}
	
	private class myImage extends JLabel{
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(ball, 270, 20, 50, 50, null);
		}
	}
	
	public static void main(String[] args) {
		new Test();
	}
	

}
