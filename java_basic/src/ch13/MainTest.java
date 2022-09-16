package ch13;

public class MainTest {

	public static void main(String[] args) {
		
		C c = new C("안녕", 100);
//		c.num1 = 1;
		c.num2 = 2;
		c.num3 = 3;
		c.num4 = 4;
		c.num5 = 5;
		
		System.out.println(c.num1);
		System.out.println(c.num2);
		System.out.println(c.num3);
		System.out.println(c.num4);
		System.out.println(c.num5);

	}
}	

// 선임 개발자가 만든 클래스
class ANumber{
	
	String name;
	int num1;
	int num2;
	int num3;
	//100
	public ANumber(String name, int num1) {
		this.name = name;
		this.num1 = num1;
		System.out.println(" ANumber 클래스가 메모리에 올라 갔습니다.");
	}
	
}

class B{
	
	public int num1;
	public int num2;
	public int num3;
	//100... (100)
	public int num4;
	public int num5;	
}

// 상속이라는 개념을 배웠을 때 (extends)
class C extends ANumber{
	
	//num1
	//num2
	//num3
	// 상속을 받아서 위에 ANumber 클래스 변수들을 가지고 있음
	int num4;
	int num5;
	
	public C(String pName, int pNum1) {
		// 부모  super(); - 부모 생성자를 호출하는 키워드이다.
		// this();
		super(pName, pNum1); // super 키워드는 맨 위로 올라 오고 다음에  구현 코드가 와야 한다
		System.out.println(" C 클래스가 메모리에 올라 갔습니다.");
	}
}




