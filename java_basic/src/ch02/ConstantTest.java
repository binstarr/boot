package ch02;

public class ConstantTest {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 변수 != 상수 (상수는 변하지 않는 수)
		
		// 예약어 (미리 선점해 놓은 단어) - final 키워드를 사용해서 상수로 지정한다.
		final int MAX_NUM = 12;
		// 상수란 : 한번 초기화 된 값은 변경할 수 없다.
		// MAX_NUM = 200;
		final int MIN_NUM;
		MIN_NUM = -1;
		
		// MIN_NUM = -100;
		
		System.out.println(MAX_NUM - MIN_NUM);
		
	} // end of main

} // end of class
