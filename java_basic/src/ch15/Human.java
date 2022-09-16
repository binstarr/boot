package ch15;

// 추상 클래스를 상속 받을 수 있다.
// 하지만 추상 메서드가 (부모) 존재한다면
// 1. Human 추상 클래스로 만들어서 추상 클래스 선언하면 된다.
// 2. 추상 메서드를 일반 메서드로 재 구현 해 주면 된다.
public abstract class Human extends Animal {

//	2번째 해결 방법
//	@Override
//	public void hunt() {
//		System.out.println("사람이 도끼를 들고 사냥을 합니다.");
//	}
}
