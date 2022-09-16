package ch13;

public class Cal {
	
	public int  sum (int n1, int n2) {
		return n1 + n2;
	}
	
	public int  multiply (int n1, int n2) {
		System.out.println("cal2 메서드 호출");
		System.out.println("cal2 메서드 호출");
		System.out.println("cal2 메서드 호출");
		return n1 * n2;
	}
}
class Cal2 extends Cal{
	
	public int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	// 오버라이드란 != 오버로딩
	// : 재정의 한다, 부모에 메서드를(이름, 매개변수) 재정의 한다.
	
	// 주석 + 힌트
	@Override  // 어노테이션
	public int multiply(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0을 대입할 수 없습니다.");
		}
		return super.multiply(n1, n2); // super. 이 있으면 부모 클래스를 호출을 하기 때문에 자식클래스에서 다시 적을 필요가 없다
//		return n1 *  n2;
	}
	
	public int multiply(int n1 , int n2 ,int n3) {
		return n1* n2 * n3;
	}
	
//	public int  multiply (int n1, int n2) {
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("0을 대입할 수 없습니다.");
//		}
//		return n1 * n2;
//	}
	
}
