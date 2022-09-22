package test.ex06;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bubble extends JLabel {

	// 의존성 컴포지션 관계
	Player player;
	
	// 버블의 위치 상태
	private int x;
	private int y;
	
	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	
	// 적군을 맞춘 상태
	private int state; // 0(일반 물방울) , 1(적을 가둔 물방울)
	
	private ImageIcon bubble;		// 물방울
	private ImageIcon bubbled;	// 적을 가둔 물방울
	private ImageIcon bomb;		// 물방울이 터진 상태
	
	public Bubble(Player player) {
		this.player = player;
		initDate();
		setInitLayout();
	}
	
	private void initDate() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;
	}
	
	private  void setInitLayout() {
		// 플레이어가 있는 위치에서 태어나야 한다.
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}
	

	
}
