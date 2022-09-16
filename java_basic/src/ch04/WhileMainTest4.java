package ch04;

import java.util.Random;
import java.util.Scanner;

public class WhileMainTest4 {

	// 코드의 시작점 (메인 쓰래드)
	public static void main(String[] args) {
		// 스캐너를 활용해서 간단한 콘솔 게임 !!!
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomResult = random.nextInt(5) + 1; /// 0, 1, 2 --> 1, 2, 3
		int strike = 0;
		do {
			System.out.println("숫자를 입력해 주세요");
			int num1 = sc.nextInt();
			if(num1 == randomResult) {
				System.out.println("안타.");
				break;
			}else {
				System.out.println("스트라이크.");
				strike++;
			}
		}while(strike == 3 );
		System.out.println("삼진 아웃입니다.");
		
		
	
		
		
	
		
		// 야구 게임 ( 사용자한테 입력을 받아서 3번 안에 randomResult 값을 맞추는 게임 )
		// 조건 3번 안에 값을 맞추면 안타 입니다. 화면에 출력 3번다 틀렸으면 아웃입니다 출력
	
	} // end of main

}
