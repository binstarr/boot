package game.service;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.component.Enemy;

public class BackgroundEnemyService implements Runnable {
	
	private BufferedImage image;
	private Enemy enemy;
	
	public BackgroundEnemyService(Enemy enemy) { // enemy가 없으면 BackgroundPlayerService 가 생성이 안된다.
		this.enemy = enemy;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일명 및 파일 경로를 확인 바랍니다.");
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while(enemy.getState() == 0) {
			Color leftColor = new Color( image.getRGB(enemy.getX(), enemy.getY() + 25));
			Color rightColor = new Color( image.getRGB(enemy.getX() + 50 + 10, enemy.getY() + 25));
			
			int bottomColorLeft = image.getRGB(enemy.getX() + 20, enemy.getY() + 50 + 5);
			int bottomColorRight = image.getRGB(enemy.getX() + 50 - 10, enemy.getY() + 50 + 5);
			
			
			if((bottomColorLeft + bottomColorRight) != -2) {
				enemy.setDown(false);
			}else {
				if(!enemy.isUp() && !enemy.isDown()) {
					enemy.down();					
				}
			}
			
			// 외벽 충돌 확인
			if(leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				enemy.setLeft(false);
				if(!enemy.isRight()) {// 쓰레드로 만들어서 반복적인 쓰레드 방지코드		
					enemy.right(); 			
				}
			}else if(rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				enemy.setRight(false);
				if(!enemy.isLeft()) {
					enemy.left();
				}
			}

			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
