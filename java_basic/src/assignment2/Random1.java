package assignment2;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
	
	public int lottoNumber(int[] lotto) {
		Random random = new Random();
		
		int num = 0;
		
		int count = 0;
		
		while(num == 0 || count > 0) {	
			num = random.nextInt(46);
			
			count = 0;
			
			for(int i = 0; i < lotto.length; i++) {
				if(lotto[i] == num) {
					count++;
					break;
				}
			}
	
		}
		
		return num;
	}
		

	public static void main(String[] args) {
		Random1 random = new Random1();
		Scanner scanner = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int[] lottoInput = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.lottoNumber(lotto);
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		System.out.println("로또번호 입력");
		for(int i =0; i < lottoInput.length; i++) {
			lottoInput[i] = scanner.nextInt();
		}

		int count = 0;
		
		for(int i = 0; i < lottoInput.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if(lottoInput[i] == lotto[j]) {
					count++;
				}
			}
		}
		
		if(count == 6) {
			System.out.println("1등");
		}else if(count == 5) {
			System.out.println("2등");
		}else if(count== 4) {
			System.out.println("3등");
		}else if(count== 3) {
			System.out.println("4등");
		}else if(count== 2) {
			System.out.println("5등");
		}else {
			System.out.println("낙첨");
		}
		
		//로또번호 당첨확인 로직
//		for(int i = 0; i < rotto.length; i++) {
//			boolean flag = true;
//			for(int j = 0; j < rottoInput.length; j++) {
//				if(rotto[i] == rottoInput[j]) {
////					System.out.print("O");
////					System.out.print(" ");
//					count++;
//					if(i == 6) {
//						bonus = true;
//					}
//				}
//				
//			}
////			if(flag) {
////				System.out.print("X");
////				System.out.print(" ");
////			}
//		}
//		
//		if(count == 6 && !bonus) {
//			System.out.println("1등");
//		}else if(count == 6) {
//			System.out.println("2등");
//		}else if(count == 5 && !bonus) {
//			System.out.println("3등");
//		}else if(count == 4 && !bonus) {
//			System.out.println("4등");
//		}else if(count == 3 && !bonus) {
//			System.out.println("5등");
//		}else {
//			System.out.println("낙첨");
//		}
//		
//
//		
		
		// 1. 배열에 7개의 로또번호를 생성한다.
		
		// 2. 로또번호 6자리를 입력받는다.
		
		// 3. 로또 등수 확인
		
		/*
		 * 1등 6개 전부 맞아야한다.
		 * 2등 0 ~ 5인덱스 중에 5개와 마지막 번호 6인덱스의 값이랑 일치하면
		 * 3등 전체 중에 4개가 일치하면
		 * 4등 전체 중에 3개가 일치하면
		 * 5등 전체 중에 2개가 일치하면
		 * 꽝
		 */
		

	}

}
