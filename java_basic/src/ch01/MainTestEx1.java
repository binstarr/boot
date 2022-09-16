package ch01;

public class MainTestEx1 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		
		// 형 변환 (데이터 타입을 변환 한다)
		System.out.println((int)ch1);
		
		char ch2 = 'F';
		System.out.println((int)ch2);
		System.out.println("=======================");
		char ch3 = 66;
		System.out.println(ch3);
		
		// 문제
		// 안녕하세요를 정수형으로 변환하고 출력해보세요
		
		char c1 = '안';
		char c2 = '녕';
		char c3 = '하';
		char c4 = '세';
		char c5 = '요';
		
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);
		System.out.println((int)c5);
		
		
	}// end of main

}// end of class

// 블록에 유효 범위는 절대적이다.
