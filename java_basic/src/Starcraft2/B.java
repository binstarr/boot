package Starcraft2;

public class B {
	
	C c; // 멤버 변수
	
	public B() {
		System.out.println("B 클래스를 메모리에 올려서 객체화 했습니다.");
		c = new C(); // 멤버 변수 c를 메모리에 올려서 객체화 했습니다.
	}
}
