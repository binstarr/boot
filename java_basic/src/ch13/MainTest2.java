package ch13;

public class MainTest2 {

	public static void main(String[] args) {
		
		Cal2 cal2 = new Cal2();
		int result1 = cal2.sum(10, 100);
		System.out.println(result1);
		System.out.println(cal2.multiply(10, 10));
		System.out.println(cal2.minus(100, 10));
		
		System.out.println("====================");
		int result2 = cal2.multiply(2, 0);
		System.out.println(result2);
	}
}
