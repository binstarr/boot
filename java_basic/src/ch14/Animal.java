package ch14;

// 추상 클래스.. 강제성
public abstract class Animal {
	
	String name;
	// 추상 클래스란? (abstract class)
	// 하나 이상의 추상 메서드를 포함하거나 abstract 키워드를 가진 클래스를 추상 클래스 라고 한다.

	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	// 추상 메서드 : 메서드에 선언부만 존재 하는 녀석 + abstract
	public abstract void hunt();


 }
 
