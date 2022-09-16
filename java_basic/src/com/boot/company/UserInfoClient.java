package com.boot.company;

// UserInfoClient 코드를 개발하는 개발자는
// 인터페이스만 보고 코드를 구현할 수 있다.
public class UserInfoClient {

	// DBTYPE
	public static final String DB_TYPE  = "MSSQL";
	
	public static void main(String[] args) {

		// 사용자한테 User 정보를 담습니다.
		UserInfo userInfo = new UserInfo("1", "1234", "이순신");
		
		// 인터페이스를 활용하는 방법
		IUserInfoDao dao;
		// 1. db type이 Mysql 이라면, 또는 Oracle 이라면 또는 MsSql 이라면
		if(DB_TYPE.equals("MYSQL")) {
			dao = new UserInfoMySqlDao();
		}else if (DB_TYPE.equals("ORACLE")) {
			dao = new UserInfoOracleDao();
		}else {
			dao = new UserInfoMsSqlDao();
		}
		
		// 1. 사용자 정보를 저장해주세요
		dao.insertUserInfo(userInfo);
		System.out.println("-------------");
		
		// 2. 사용자 정보를 수정해주세요
		dao.updateUserInfo(userInfo);
		System.out.println("-------------");
		
		// 3. 사용자 정보를 삭제해주세요
		dao.deleteUserInfo(userInfo);
		System.out.println("-------------");

		// 4. 사용자 정보 조회
		dao.selectUserInfo("abc");

		
	} // end of main
	
}
