package ch10;

public class Person {
	
	// this란
	// 1. 인스턴스(객체) 자신의 메모리를 가리킨다.
	// 2. 생성자에서 또 다른 생성자를 호출할 때 사용할 수 있다.
	// 3. 자신의 주소(참조값, 주소값)를 반환 시킬 수 있다.
	
	String name;
	int age;
	int phone;
	String gender;
	int weight;
	int height;
	
	public Person(String name, int age) {
		// 1. 자기 자신을 가리키는 this (매개변수와 변수명이 같기 때문에 this를 붙이지 않으면 매개변수로 알아듣는다.)
		this.name = name;
		this.age = age;
		System.out.println("사용자 정의 생성자 기능을 종료합니다.");
	}
	
	public Person() {
		// 2. 생성자에서 또 다른 생성자를 호출할 때 this를 사용할 수 있다.
		this("아무개", 1);
		System.out.println("기본 생성자 기능을 종료합니다.");
//		this.name = "아무개";
//		this.age = 1;
	}
	
	public Person (String name, int age, int phone) {
//		this.name = name;
//		this.age = age;
//		this.phone = phone;
//		this();
		this(name, age);
		this.phone = phone;
	}
	
	public Person (String name, int age, int phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
		System.out.println("11");
	}
	
	public Person (String name, int age, int phone, String gender, int weight) {
		this(name, age, phone, gender);
		this.weight = weight;
	}
	
	// 디자인 패턴 : 
	// this 빌더패턴 개념 이해할 수 있다.
 	public Person getPerson() {
		// 3. 자기 자신의 주소값 반환 시킬 수 있다.
		return this;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + "나이 : " + age);
	}
	
	// 잠시 자리를 빌려서 사용할 수 있다 함수는 왜? (자바 문법)
	public static void main(String[] args) {
		Person person1 = new Person();
	}

}
