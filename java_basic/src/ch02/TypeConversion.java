package ch02;

public class TypeConversion {
	
	public static void main(String[] args) {
	
		// 형 변환 : 데이터 타입을 변환하는 것을 말한다.
		// 형 변환 - 1. 강제 형 변환, 자동 형 변환이 있다.
		
		int iNumber1 = 100;
		System.out.println(iNumber1);
		
		// 문제 : iNumber 변수를 dNumber 변수에 담아 보세요, 단, 데이터타입은 double
		
		double dNumber = iNumber1;
		System.out.println(dNumber);
		// 자동 형 변환
		
		System.out.println("-----------------------");
		double dNumber2 = 1.12345;
		int iNumber2 = (int)dNumber2; // 강제 형 변환
		System.out.println(iNumber2);
		// 강제 형 변환시 데이터에 손실이 발생할 수 있다.
		// 소수점을 그냥 버리고 정수값만 저장해 !!!
		
		// 연습 
		
		double a;
		int b;
		
		System.out.println("------------");
		// 1. a에 값을 0.5 담아 보세요(리터럴 사용)
		a = 0.5;
		// 2. b에 값을 10.5를 담아 보세요 (리터럴 사용)
		b = (int)10.5;
		// 3. 화면에 b를 출력해 보세요
		System.out.println(b);
		
	} // end of main
	
}// end of class
