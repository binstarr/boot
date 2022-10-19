package frame;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainFrame extends JFrame {

	private JLabel background;
	private JLabel player;
	private MyMouseAdapter myAdapter;
	

	public MainFrame() {
		initData();
		setInitLayout();
		addEventListenr();
	}

	private void initData() {
		setTitle("Angry Bird");
		setSize(1500, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		background = new JLabel(new ImageIcon("background.jpg"));
		setContentPane(background);

		player = new JLabel(new ImageIcon("shoot.png"));
		myAdapter = new MyMouseAdapter();

	}
	

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(player);
		player.setLocation(180, 430);
		player.setSize(500, 70);
	}

	private void addEventListenr() {
		addMouseListener(myAdapter);
		addMouseMotionListener(myAdapter);
	}

	class MyMouseAdapter extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("마우스 누름");
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("마우스 드래그");
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(123);
					try {
						Thread.sleep(700);
//						player.setLocation(e.getX() - 80 / 2, e.getY() - 65);
						player.setLocation(e.getX(), e.getY() -65 );

					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
			}).start();;

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("마우스 끝");
		}

	}

	public static void main(String[] args) {
		new MainFrame();
	}

}