package Starcraft2;

public class G {
	
	public G() {
		System.out.println("G 클래스를 메모리에 올려서 객체화 했습니다.");
	}
	
	public void showInfo() {
		System.out.println("g 클래스의 메서드 showInfo");
	}
	public static void main(String[] args) {
		A a = new A();
//		F f = new F();
		System.out.println("====================");
		System.out.println(a);
		System.out.println(a.b);
		System.out.println(a.b.c);
		System.out.println(a.b.c.d);
		System.out.println(a.b.c.d.f);
		System.out.println(a.b.c.d.f.g);
		
//		System.out.println(f);
//		System.out.println(f.g);
		
	}
}
