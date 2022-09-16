package ch06;

public class MainTest2 {

	public static void main(String[] args) {
		System.out.println("<회원 정보>");
		UserInfo userInfo = new UserInfo();
		userInfo.userCode = 1;
		userInfo.userName = " 강성빈 ";
		userInfo.userPassword = "bin";
		userInfo.address = "울산광역시";
		userInfo.capchaCheck();

	}

}
