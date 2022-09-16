package ch07.constructor;

public class MainTest2 {

	// 코드의 시작점(메인 쓰래드)
	public static void main(String[] args) {
		
		// 사용자 정의 생성자가 있으면 컴파일러는 기본 생성자를
		// 만들어 주지 않는다.
		//UserInfo userInfo1 = new UserInfo();
		
		UserInfo userInfo1 = new UserInfo("aaa", "1234", "강성빈", 26);
		UserInfo userInfo2 = new UserInfo("bbb", "1234", "김성빈", 27);
		UserInfo userInfo3 = new UserInfo("ccc", "1234", "최성빈", 28);
		
		System.out.println(userInfo1.showUserInfo());
		System.out.println(userInfo2.showUserInfo());
		System.out.println(userInfo3.showUserInfo());
		
	} // end of main function

}
