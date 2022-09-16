package ch06;

import java.util.Scanner;

public class MainTest3 {

	// 사용자 입장
	public static void main(String[] args) {
		
//		User user = new User();
//		user.id = "kgh";
//		user.password = "1234";
////		user.checkPassword = "1234";
//		user.name = "홍길동";
//		user.gender = "남";
//		
//		// 조건 : 회원 가입시에 반드시 비밀번호 체크가 true 가 되어야 한다.
//		user.checkedPassword("10000");
//		user.join();
		
		// 스캐너 활용해서  값을 담아 주세요!
		User user = new User();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("회원 아이디를 입력하세요 : ");
		user.id = scanner.nextLine();
		System.out.print("회원 비밀번호를 입력하세요 : ");
		user.password = scanner.nextLine();
		System.out.print("회원 이름을 입력하세요 : ");
		user.name = scanner.nextLine();
		System.out.print("회원 성별을 입력하세요 : ");
		user.gender = scanner.nextLine();
		System.out.print("회원 나이를 입력하세요 : ");
		user.age = scanner.nextInt();
		scanner.nextLine();
//		String temp = scanner.nextLine();
		// 스캐너를 활용해서 User 객체에 값을 담아 주세요!!
		
		user.showInfo();
		
	}

}
