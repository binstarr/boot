package ch06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int[] machineNumber = new int[6]; // 기계에서 뽑히는 숫자
		int[] myNumber = new int[6]; // 내가 적는 숫자
		
		System.out.println("원하는 로또 번호를 적어주세요");
		for(int i = 0; i < myNumber.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력해주세요." );
			myNumber[i] = sc.nextInt();
			for(int j = 0; j < i; j++) {
				if(myNumber[j] == myNumber[i]) {
					System.out.println("잘못 입력했습니다.");
					i--;
				}else if(myNumber[i] == 0 || myNumber[i] >45) {
					System.out.println("1~45 사이의 숫자를 입력해주세요");
					i--;
				}else if(myNumber[i] < myNumber[j]) {
					int temp = myNumber[i];
					myNumber[i] = myNumber[j];
					myNumber[j] = temp;
				}
				
			}
		}
		System.out.println("입력하신 번호 : ");
		for(int i = 0; i < myNumber.length; i++) {
//			Arrays.sort(myNumber);
			System.out.print(myNumber[i] + "\t");			
		}
// -------------------------------------------------- 번호 입력
		System.out.println();
		System.out.println("이번주 로또 번호는 ~~");
		for(int i = 0; i < 10; i++) {
			try {
				System.out.print("두근두근");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.print("당첨 번호 : ");
		for(int i = 0; i < machineNumber.length; i++) {
			machineNumber[i] = ran.nextInt(46);
		}
		for(int i = 0; i < machineNumber.length; i++) {
			if(machineNumber[i] < machineNumber[i]) {
				machineNumber[i] = machineNumber[i];
			}
			System.out.print(machineNumber[i] + "\t");
		}
		System.out.println("입니다.");
// -------------------------------------------------- 당첨 번호
		
		
	} // end of main

} // end of class
