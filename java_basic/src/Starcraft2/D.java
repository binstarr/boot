package Starcraft2;

public class D {

	F f;

	private int numberId = 100;

	public int getNumberId() {
		return numberId;
	}

	public D() {
		System.out.println("D 클래스를 메모리에 올려서 객체화 했습니다.");
		f = new F();
	}

	public void showInfo() {
		System.out.println("여기는 d 클래스의 메서드 showInfo 입니다.");
	}

	public static void main(String[] args) {
		A a = new A();
		D d = new D();

//		System.out.println(a.b);
//		System.out.println(a.b.c.d);
		a.b.c.d.showInfo();
		System.out.println("====================");
		// 메인 함수안에 지역변수를 선언(변수명은 temp)해서
		// D 클래스(객체)안에 있는 멤버 변수 numberId를 저장하고
		// 화면에 temp를 출력해서 확인하세요.
		int temp = d.getNumberId();

		System.out.println(temp);

	}
}
