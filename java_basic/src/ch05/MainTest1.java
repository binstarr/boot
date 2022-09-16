package ch05;

public class MainTest1 {

	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		System.out.println("프로그램을 시작합니다.");
		
		int num1; // 변수에 선언
		int num2 = 10; // 변수에 선언과 초기화
		
		Student s1 = new Student(); // 변수에 선언
		Student s2 = new Student(); // 변수에 선언과 초기화
		
		System.out.println(s1);
		
		System.out.println(num2);
		System.out.println(s2);
		
		/*
		 변수에 종류
		 1. 기본 데이터 타입
		 2. 주소값 (참조 타입)
		 
		 컴파일 시점(문법 검사) (컴퓨터의 언어로 변환)
		 System.out.priln(s2);
		 런타임 시점 (실행 버튼을 눌렀을 때)
		*/
		System.out.println("======================");
		System.out.println(s2.name);
		System.out.println(s2.height);
		System.out.println(s2.weight);
		
		s2.name = "홍길동";
		s2.height = 170;
		s2.weight = 80.0;
		
		System.out.println("======================");
		System.out.println(s2.name);
		System.out.println(s2.height);
		System.out.println(s2.weight);
		
		// 참조 타입에 값을 할당하는 방법
		s1.name = "이순신";
		s1.height = 190;
		s1.weight = 100.5;
		
		// 참조 타입 s1에 값을 화면에 출력 하는 방법
		System.out.println("======================");
		System.out.println(s1.name);
		System.out.println(s1.height);
		System.out.println(s1.weight);

	} // end of main

} // end of class
