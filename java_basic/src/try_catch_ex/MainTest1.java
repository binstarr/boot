package try_catch_ex;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		// 예외 발생할 수 있는 코드를 넣어보세요
		Scanner sc = new Scanner(System.in); 
		int x;
		int y;
		
		try {
			// 예외가 발생할 수 있는 문장
			System.out.println( "33 / x = ");
			System.out.println("원하는 x 값을 넣어주세요.");
			x = sc.nextInt();
			y = 33 / x;
			System.out.println(y);
		} catch (Exception e) {
			// 예외 발생시 실행할 문장
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
	}

}
