package ch04;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 1. 문제
		// a = 10, b 변수에 20 담아 둔다.
		// a 변수와 b변수에 값을 서로 바꿔서 출력해 보세요.
		int a = 10;
		int b = 20;
		
		a = 20;
		b = 10;
		System.out.println(a);
		System.out.println(b);
		
		// 2.문제
		// 시작값, 종료값을 받아서 (사용자입력) 연산에 합을 출력해 보세요
		Scanner sc = new Scanner(System.in);

		int result = 0;
		System.out.println("시작값: ");
		int p = sc.nextInt();
		System.out.println("종료값: ");
		int k = sc.nextInt();
		for(int i = p; i <= k; i++ ) {
			result += i;
		}
		
		System.out.println( p +"부터" + k + "까지 합은: " + result + "입니다.");
		
		// 3. 문제
		// 2번 문제를 변수하나를 상수로 변경해서 코드를 수정해 보세요!!
		
		int result1 = 0;
		System.out.println("시작값: ");
		int start = sc.nextInt();
		System.out.println("종료값: ");
		final int END = sc.nextInt();
		for(int i = start; i <= END; i++ ) {
			result1 += i;
		}
		System.out.println( start +"부터" + END + "까지 합은: " + result1 + "입니다.");
	}
}
