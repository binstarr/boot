package ch04;

public class ForMainTest2 {

	// 코드의 시작점 (메인함수, 메인쓰래드)
	public static void main(String[] args) {
		
		for(int num =2; num <= 9; num++) {
			System.out.println("num : " + num);
			// 문제 이중 for문을 활용해서 구구단을 완성해주세요
			// 2~ 9 단까지
		}
			for(int i = 2;  i < 10; i++) {
				for(int j = 1; j < 10; j++) {
					System.out.println(i + "* " + j + " = " + (i * j));
				}
				// 5단과 6단 사이에 ======= 값을 출력 마시오
				if(i % 5 ==0 && i % 6 ==0) {
					continue;
				}
				// 단 예약어
				if(i != 9) {
					System.out.println("==================");
				}
			}
		

	}// end of main

} // end of class
