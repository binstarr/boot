package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	public static void main(String[] args) {
		
		System.out.println("성적을 입력해 주세요");
		
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();
		char result = 'F';
		
		//1. 100 ~ 90 까지 A 학점입니다. 단 (논리곱 연산을 활용해 주세요)
		//2. 90 ~ 80 까지 B 학점입니다.
		//3. 80 ~ 70 까지 C 학점입니다.
		//4. F학점 입니다0.
		// 100점보다 작거나 같다면 !!
		if(point <= 100 && (point > 90)) {
			result = 'A';
		}else if (point <= 90 && (point > 80)) {
			result = 'B';
		}else if (point <= 80 && (point > 70 )) {
			result = 'C';
		}else {
			result = 'F';
		}
		
		// 방어적 코드
		if(result != 'Z') {
			System.out.println(result + "학점 입니다.");			
		}else {
			System.out.println("잘못된 값을 입력 하였습니다.");
		}
	}

}
