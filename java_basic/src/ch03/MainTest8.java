package ch03;

import java.util.Scanner;

public class MainTest8 {

	// 코드의 시작점 ( 메인 쓰래드 )
	public static void main(String[] args) {
		
		// 클론 코딩 (소수점을 비교해서 큰 수를 화면에 출력하시오 !! )
		// 조건1 Scanner를 사용해 주세요
		// 조건2 삼항 연산자를 사용해서 판별해 주세요
		
		Scanner sc = new  Scanner(System.in);
		double big = 0;
		
		System.out.println("값 1 입력 : ");
		double a = sc.nextDouble();
		System.out.println("값 2 입력 : ");
		double b = sc.nextDouble();
		
		big = (a > b) ? a : b;
		
		System.out.println("더 큰 수는 " + big + "입니다.");
		
	} // end of main

} // end of class
