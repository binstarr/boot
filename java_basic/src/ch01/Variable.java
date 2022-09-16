package ch01;

public class Variable {

	// 코드의 시작점
	public static void main(String[] args) {
		// 변수를 사용하는 방법
		// 변수는 변하는 수 입니다.
		
		int age; //변수를 선언
		int count;
		
		age = 1; //초기화 한다. (값을 넣다.)
		count = 100;
		
		System.out.println(age);
		System.out.println("==========");
		System.out.println(count);
		
		// 변수는 변하는 수 입니다.
		age = 1000;
		System.out.println(age);
		
		// TIP
		// 변수에는 2가지 종류가 있다.
		
		// 1. 기본 데이터 타입(값) - int, double, float, char ....
		// 2. 참조 타입(주소값) - 해시값
		
		// 변수 선언과 동시에 초기화 하기
		
		int level = 2;
		level = 3;
		
		
		
			} // end of main

} //end of class
