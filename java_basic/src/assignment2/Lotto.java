package assignment2;

import java.util.Random;

public class Lotto {

	private int lottoNumber;
	private int myNumber;
	
	public int lottoNum(int[] lottoNumber) {
		Random random = new Random();
		
		int num = 0;
		int count = 0;
		
		while(num == 0 || count > 0) {	
			num = random.nextInt(46);
		
			count = 0;
			
			for(int i = 0; i < lottoNumber.length; i++) {
				if(lottoNumber[i] == num) {
					count++;
					break;
				}
			}
	
		}
		
		return num;
	}

	}
	
	

