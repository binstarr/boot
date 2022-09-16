package ch03;

public class MainTest2 {

	// 메인 작업자 (메인 쓰래드)
	// 코드의 시작점
	public static void main(String[] args) {
		
		// 산술 연산자
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		double number4 = 5 / 3.0;
		int number5 = 5 % 3;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		
		System.out.println("------------------------");
		// 문제
		// 1. (12 + 3) / 3 값을 출력하고 값이 맞는지 검증해 보세요
		System.out.println((12 + 3) / 3);
		// 2. (25 % 2) 값을 화면에 출력해 보세요
		System.out.println(25%2);

	} // end of main

} // end of class
