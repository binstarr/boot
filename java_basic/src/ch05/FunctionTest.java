package ch05;

public class FunctionTest {

	// 메인 함수
	public static void main(String[] args) {
		
		// 함수를 사용할 때는 함수를 호출한다.
		int myResult = addNum(10, 100);
		System.out.println(myResult);
		
		sayHello("안녕하세요");
		sayHello("반갑습니다");
		sayHello("만나 뵙게 되서 영광입니다.");
		System.out.println("==================");
		int myResult2 =calcSum();
		System.out.println(myResult2);
		
		int num1 = 10;
		
	} // end of main

	// 함수를 설계 (모양) 함수를 사용하는 모양()
	public static int addNum(int n1, int n2) {
		// 두개의 매개변수를 받아서 덧셈 하는 기능을 만들기 !!
		// 함수안에 사용하는 변수를 지역변수라고 부른다.
		int result;
		result = n1 + n2;
		return result;
	} // end of addNum
	
	// 리턴값이 없는 함수 설계
	public static void sayHello(String greeting) {
		System.out.println(greeting + "^^");
	} // end of sayHello
	
	// 매개변수가 없는 함수 설계
	public static int calcSum() {
		int sum = 0;
		int i;
		// 1 ~ 100까지의 합
		for(i = 0; i <= 100; i++) {
			// sum = sum + i
			sum += i;
		}
		return sum;
	} // end of calcSum
	
} // end of class
