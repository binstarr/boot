package ch06;

import java.util.Scanner;

// 회원 가입
public class UserInfo {
	
	Scanner sc = new Scanner(System.in);
	
	// 속성 4개 이상
	public int userCode;
	public String userName;
	public String userPassword;
	public String captcha = "abc";
	public String address;
	
	// 기능 2개 이상
	public void showUserInfo() {
		System.out.println("- 회원 정보 -");
		System.out.println("회원의 코드 : " + userCode);
		System.out.println("회원의 이름 : " + userName);
		System.out.println("회원의 비밀번호 : " + userPassword);
		System.out.println("회원의 주소 : " + address);
		System.out.println("자동 방지 코드를 입력해 주세요: " + sc.next());
	}
	
	public void capchaCheck() {
		if(sc.next().equals(captcha)) {
			System.out.println("인증되었습니다.");
			showUserInfo();
		}else {
			System.out.println("회원가입을 다시  시도해주세요.");
			
		}
	}
	
	// 회원가입한 정보를 보는 기능을 반드시 만들어 주세요.
}
