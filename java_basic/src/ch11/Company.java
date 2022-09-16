package ch11;

// 디자인 패턴
// 싱글톤 패턴 : 단 하나의 객체만 사용
// 1. 생성자를 private으로 만든다
// 2. static 변수를 활용해서 내부에서 객체를 생성한다.
// 3. 외부에서 유일하게 참조변수(인스턴스변수)에 접근 가능한 public 메서드를 제공한다.
public class Company {

	public int cId;
	// 1.
	private Company() {
		
	}
	
	// 2.
//	private int number = 10; 같은 맥락
	private static Company instance = new Company();
	
//	public static int getCid() {
//		return cId;
//	}
	
	// 3.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
