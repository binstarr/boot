package ch04;

import java.util.Scanner;

public class WhileMainTest2 {

	// 코드의 시작점 (메인 쓰래드)
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userInput;
		
		do {
			
			System.out.println("**=================**");
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("0번 프로그램 종료");
			System.out.println("1번 메인화면 출력");
			userInput = scanner.nextInt();
			
		}while(userInput != 0);
		
		System.out.println("프로그램을 종료 하였습니다.");
		
		
			
		
	
		
		
	} // end of main

}
