package com.boot.company;

// 선임 개발자가 인터페이스를 설계해서
// 여러분한테 클라이언트 쪽 코딩을 맡김
// 동기한테 DB쪽 연결 코드를 맡김
// 인터페이스를 통해서 코딩해본다.
// Dao = Data Access Object
public interface IUserInfoDao {
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	// void ipdateUserInfo(String id, String pw, String name);
	void deleteUserInfo(UserInfo userInfo);
	void selectUserInfo(String id);
}
