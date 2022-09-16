package ch03;

public class MainTest4Ex1 {

	// 메인 쓰래드
	// 코드의 시작점
	public static void main(String[] args) {
		
		// 증감 연산자, 감소 연산자
		int num1 = 1;
		
		num1++;
		System.out.println(num1);
		
		int num2 = 1;
		
		num2--;
		System.out.println(num2);
		
		
		// 연습 : 증감 연산자를 num1 식을 풀어서 코딩해 보세요. 단, 이름은 num3으로 사용
		int num3 = 1;
		System.out.println(num3 + 1);
		// 연습 : 감소 연산자를 num2 식을 풀어서 코딩해 보세요. 단, 이름은 num3으로 사용
		num3 -= 1;
		System.out.println(num3);
		// 변수에 접근해서 오직 +1 또는 -1을 해주는 녀석이 증감, 감소 연산자이다.
		
		//
		int number3 = 10;
		
//		++number3; // 증감, 감소 연산자는 앞에 또는 뒤에 올 수 있다.
//		number3++;
//		System.out.println(number3);
		
//		int number4 = number3++; 
		int number4 = ++number3; 
		// statement 기준으로 동작을 앞에 있을 때와 뒤에 있을때 다르게 동작한다.
		// 세미콜론 기준으로 동작 !!
		System.out.println(number4);
		System.out.println(number3);
		
		
		

	} // end of main

} // end of class
