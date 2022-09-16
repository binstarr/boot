package ch03;

public class MainTest8Ex1 {

	// 메인 쓰래드
	// 코드 시작점
	public static void main(String[] args) {
		
		// 관계 연산자
		// 관찰에 결과가 참, 거짓인지 판별할 때 사용한다.
		// 연산에 결과는 오직 true, false 로 반환 된다.
		
		int number1 = 5;
		int number2 = 3;
		
		boolean result1 = 5 > 3;
		System.out.println(result1);
		boolean result2 = 5 < 3;
		System.out.println(result2);
		boolean result3 = ( result1 == result2 );
		System.out.println(result3);
		boolean result4 = ( result1 != result2 );
		System.out.println(result4);
		

	} // end of main

} // end of class
