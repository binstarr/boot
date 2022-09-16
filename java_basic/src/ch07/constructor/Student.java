package ch07.constructor;

public class Student {

	// 생성자 - constructor
	// 객체를 생성할 때 다음과 같은 모양으로 만들어라고 지시하는 것
	// 객체를 생성할 때 강제성을 부여 하는 것.
	
	// 객체가 생성이 될 때 반드시 생성자가 있어야 한다.
	// : 개발자가 생성자를 직접 정의하지 않으면 컴파일러가 알아서 자동으로
	//		생성자를 만들어 넣고 컴파일 시킨다.
	
	int number; 
	String name;
	int grade;
	
	// 사용자 정의 생성자
	// 생성자 정의하기 (개발자가 직접 정의)
	// 생성자 만드는 규칙 1. 반환값이 없다. 2. 클래스 이름과 반드시 동일 3. 대문자로 시작
	
	
	// 생성자 오버로딩
	
	public Student(int n, String a, int g) {
		// 수행문;
		number = n;
		name = a;
		grade = g;
	}
	
	// 기본 생성자
	public Student() {
		
	}
	
	public String showInfo() {
		return grade + "학년 " + name + " 학생에 번호는 : " + number + "입니다.";
	}
	
} // end of class
