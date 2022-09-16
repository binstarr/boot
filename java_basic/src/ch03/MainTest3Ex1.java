package ch03;

public class MainTest3Ex1 {

	// 메인 작업자 (메인 쓰래드)
	// 코드의 시작점
	public static void main(String[] args) {
		
		// 복합 대입 연산자
		// 다른 연산자와 대입 연산자를 함께 사용하는 것
		
		/*
		int num1 = 1;
		num1 = num1 + 10;
		int num2 = 1;
		num2 = num2 + 10;
		int num3 = 1;
		num3 = num3 + 10;
		*/
		
		// 복합 대입 연산자
		int num1 = 1;
			num1 += 10; // num1 = num1 + 10;
		
		int num2 = 10;
		num2 -= 100;
		// 위 코드를 복합 대입 연산자를 사용하지 말고 풀어서 코드를 작성해 주세요.
		num2 = num2 - 100;
		
		// 문제 복합 연산자로 변경해 주세요
		num1 = num1 * 2;
		num1 *= 2;
		
		num1 = num1 / 2;
		num1 /= 2;
		
		num1 = num1 % 2;
		num1 %= 2;
		
		
		
		
		
	} // end of main

} // end of class
