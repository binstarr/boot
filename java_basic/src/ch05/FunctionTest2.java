package ch05;

public class FunctionTest2 {

	public static void main(String[] args) {
		double total = 0.0;
		total = minus(100, 10);
		System.out.println("결과값 : " + total);
		double total2 = minus(100, 10);
		
		// 참조 변수 : 
		Student s1 = new Student();
	}
	
	public static double minus(double n1, double n2){
		// 지역변수 : 스택메모리에 올라간 녀석을 지역 변수라고 한다.
		double result = n1 - n2;
		Student student = new Student();
		// student.height = 멤버 변수
		student.height = 100;
		n1 = student.height;
		return result;
	}

}
