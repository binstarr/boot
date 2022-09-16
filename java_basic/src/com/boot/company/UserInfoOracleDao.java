package com.boot.company;

public class UserInfoOracleDao implements IUserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("ORACLE : 저장하기 - 이름 : " + userInfo.getName());
		System.out.println("ORACLE : 저장하기 - 아이디 : " + userInfo.getId());
		System.out.println("ORACLE : 저장하기 - 비밀번호 : " + userInfo.getPw());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("ORACLE : 수정하기 - 이름 : " + userInfo.getName());
		System.out.println("ORACLE : 수정하기 - 아이디 : " + userInfo.getId());
		System.out.println("ORACLE : 수정하기 - 비밀번호 : " + userInfo.getPw());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("ORACLE : 삭제하기 - 이름 : " + userInfo.getName());
		System.out.println("ORACLE : 삭제하기 - 아이디 : " + userInfo.getId());
		System.out.println("ORACLE : 삭제하기 - 비밀번호 : " + userInfo.getPw());
	}

	@Override
	public void selectUserInfo(String id) {
		System.out.println("ORACLE : 사용자 정보 조회 - " + id);
		
	}
}
