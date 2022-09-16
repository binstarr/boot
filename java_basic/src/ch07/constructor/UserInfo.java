package ch07.constructor;

public class UserInfo {
	
	String userId; // 멤버 변수
	String userPassword; // 멤버  변수
	String userName; // 멤버 변수
	int age;

	// 생성자 오버로딩 연습
	public UserInfo(String userId){
		// this 는 자기 자신을 의미한다.
		this.userId = userId;
	}
	
	public UserInfo(String userId, String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}
	
	public UserInfo(String userId, String userPassword, String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	
	public UserInfo(String userId, String userPassword, String userName, int age) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.age = age;
	}
	public String showUserInfo() {
		return userId + "입니다. " + userPassword + "입니다. " + userName + "입니다. " + age + "살 입니다. "; 
	}
	
	// 기본 생성자
	// public UserInfo(){}
	// 사용자 정의 생성자가 있으면 컴파일러는 기본 생성자를
	// 만들어 주지 않는다.
	
}
