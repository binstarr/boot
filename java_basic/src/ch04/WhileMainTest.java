package ch04;

public class WhileMainTest {

	// 코드의 시작점 (메인 쓰래드)
	public static void main(String[] args) {
		
		// 1 ~ 10 까지 연산
		// 조건식
		// 무한 반복을 조심하자!!
		int num = 1;
		int sum = 0;
//		while(num <= 10) {
//			System.out.println("현재값 : " + num);
//			sum += num;
//			num++;
//			try {
//				Thread.sleep(1000);				
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//		}
		
//		while(num <= 50) {
//			System.out.println("--" );
//			try {
//				// 메인 쓰래드 (0.01초 잠들고 일어나서 다시 수행하기)
//				Thread.sleep(100);				
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			num++;
//		}
//		System.out.println("연산에 대한 결과값은 : " + sum + "입니다.");

		System.out.println("---------------------------");
		
				int num1 = 1;
				int sum1 = 0;

				while (num1 <= 10) {
					sum1 += num1;
					num1++;
				}

				System.out.println("합계 " + sum1);
				System.out.println("num : " + num1);



	} // end of main

} // end of class
