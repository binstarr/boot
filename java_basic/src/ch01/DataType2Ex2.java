package ch01;

public class DataType2Ex2 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		char name; // 2바이트 공간에 문자 하나를 담을 수 있다.
		char a;
		char initial;
		char b;
		
		// 값을 초기화 하는 방법
		
		name = 'A';
		// name = "A"; 오류 발생(char type은 홑 따옴표를 사용해야 한다.)
		// name = 'AB'; 오류 발생 char type은 단 하나의 문자를 저장할 수 있다.
		
		// 문제
				// 1. name 변수를 화면에 출력하시오
				// 2. 문자 a를 화면에 출력하시오
				// 3. 문자 b를 화면에 출력하시오
				// 4. 문자 c를 화면에 출력하시오
		
		System.out.println(name);
		System.out.println('a');
		System.out.println('b');
		System.out.println('c');
		
	}// end of main

}// end of class

// 블록에 유효 범위는 절대적이다.
