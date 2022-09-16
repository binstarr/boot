package ch04;

public class ForMainTest1 {

	// 코드의 시작점 (메인함수, 메인쓰래드)
	public static void main(String[] args) {
		
		// 화면에 구구단 2단을 출력해 보세요 !
		int num = 2;
//		System.out.println(num + " * 1 = " + (num * 1));
//		System.out.println(num + " * 2 = " + (num * 2));
//		System.out.println(num + " * 3 = " + (num * 3));
//		System.out.println(num + " * 4 = " + (num * 4));
//		System.out.println(num + " * 5 = " + (num * 5));
//		System.out.println(num + " * 6 = " + (num * 6));
//		System.out.println(num + " * 7 = " + (num * 7));
//		System.out.println(num + " * 8 = " + (num * 8));
//		System.out.println(num + " * 9 = " + (num * 9));
//		
//		System.out.println("------------------------");
//		// 화면에 구구단 3단을 출력해 보세요!
//		num = 3;
//		System.out.println(num + " * 1 = " + (num * 1));
//		System.out.println(num + " * 2 = " + (num * 2));
//		System.out.println(num + " * 3 = " + (num * 3));
//		System.out.println(num + " * 4 = " + (num * 4));
//		System.out.println(num + " * 5 = " + (num * 5));
//		System.out.println(num + " * 6 = " + (num * 6));
//		System.out.println(num + " * 7 = " + (num * 7));
//		System.out.println(num + " * 8 = " + (num * 8));
//		System.out.println(num + " * 9 = " + (num * 9));
//		
		// 문법 모양
		// for (조건식) {수행문}
		System.out.println("=====================");
		num =2 ;
		for(int i = 2;  i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "* " + j + " = " + (i * j));
			}
		}
		
		
		// for문 활용해서 3, 4, 5, 6, 7, 8, 9 까지 출력해주세요
		

	}// end of main

} // end of class
