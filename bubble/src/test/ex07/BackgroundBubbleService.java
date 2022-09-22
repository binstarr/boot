package test.ex07;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BackgroundBubbleService implements Runnable{

	BufferedImage backgroundMapService;
	Bubble bubble;
	
	public BackgroundBubbleService(Bubble bubble) {
		this.bubble = bubble;
		try {
			backgroundMapService = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일명 및 파일 경로를 확인 바랍니다.");
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		while(true) {
			Color leftColor = new Color(backgroundMapService.getRGB(bubble.getX(), bubble.getY()));
			Color rightColor = new Color(backgroundMapService.getRGB(bubble.getX(), bubble.getY()));
			Color upColor = new Color(backgroundMapService.getRGB(bubble.getX(), bubble.getY()));
			
			if(leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				System.out.println("왼쪽 감지");
				bubble.setLeftWallCrush(true);
				
			}else if(rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				System.out.println("오른쪽 감지");
				bubble.setLeftWallCrush(true);
				
			}
			if(upColor.getRed() == 255 && upColor.getGreen() == 0 && upColor.getBlue() == 0) {
				bubble.setUp(true);
			}
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}
