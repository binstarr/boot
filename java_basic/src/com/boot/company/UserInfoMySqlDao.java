package com.boot.company;

// DB 쪽 연결 개발자는 UserInfoDao 인터페이스만 보고 기능을 구현할 수 있다.
public class UserInfoMySqlDao implements IUserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL : 저장하기 - 이름 : " + userInfo.getName());
		System.out.println("MYSQL : 저장하기 - 아이디 : " + userInfo.getId());
		System.out.println("MYSQL : 저장하기 - 비밀번호 : " + userInfo.getPw());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL : 수정하기 - 이름 : " + userInfo.getName());
		System.out.println("MYSQL : 수정하기 - 아이디 : " + userInfo.getId());
		System.out.println("MYSQL : 수정하기 - 비밀번호 : " + userInfo.getPw());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL : 삭제하기 - 이름 : " + userInfo.getName());
		System.out.println("MYSQL : 삭제하기 - 아이디 : " + userInfo.getId());
		System.out.println("MYSQL : 삭제하기 - 비밀번호 : " + userInfo.getPw());
	}

	@Override
	public void selectUserInfo(String id) {
		System.out.println("MYSQL : 사용자 정보 조회 - " + id);
		
	}

}
