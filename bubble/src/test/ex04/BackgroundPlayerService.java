package test.ex04;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 메인스래드 바쁨 - (이벤트 리스너 처리중)
// 백그라운드에 계속 Player에 움직임 관찰

public class BackgroundPlayerService implements Runnable {
	
	private BufferedImage image;
	// 의존성 포함관계, 의존성 컴포지션
	private Player player;
	
	public BackgroundPlayerService(Player player) { // player가 없으면 BackgroundPlayerService 가 생성이 안된다.
		this.player = player;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일명 및 파일 경로를 확인 바랍니다.");
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while(true) {
			// 색상 확인 
			Color leftColor = new Color( image.getRGB(player.getX(), player.getY() + 25));
			Color rightColor = new Color( image.getRGB(player.getX() + 50 + 10, player.getY() + 25));
			// 플레이어 좌표 값에 따라서 빨간색, 파란색, 하얀색을 구분할 수 있다.
//			System.out.println(leftColor);
//			System.out.println(rightColor);
			
			// 왼쪽벽에 충돌함
			// 255 0 0 = Red
			if(leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				// 빨간색 : 왼쪽벽에 충돌함
				System.out.println("왼쪽벽에 충돌함");
				player.setLeftWallCrash(true);
				player.setLeft(false);
				
			}else if(rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				System.out.println("오른쪽벽에 충돌함");
				player.setRightWallCrash(true);
				player.setRight(false);
				
			}else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}
			
			// 위 두 조건이 아니면 하얀색 마음대로 움직임 가능
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
