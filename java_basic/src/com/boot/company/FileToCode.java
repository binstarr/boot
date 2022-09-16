package com.boot.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// UserInfoClient 코드를 개발하는 개발자는
// 인터페이스만 보고 코드를 구현할 수 있다.
public class FileToCode {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("db.properties");
			
			// 하나 하나 바이트 단위로 읽음 (한글자씩)
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
			
			System.out.println("파일을 잘 찾았습니다.");
			
			 //fis 상태는 파일과 연결된 상태이기 때문에 접근해서 글자를 읽을 수 있다.
			 //글자들을 읽는 방법은 여러가지 있다.
			Properties prop = new Properties();
			prop.load(fis);
			
			// DB_TYPE = MYSQL  <-- MYSQL 이 담긴다
			String dbType = prop.getProperty("DB_TYPE");
			IUserInfoDao dao;
			if(dbType.equals("MYSQL")) {
				dao = new UserInfoMySqlDao();
			}else if(dbType.equals("ORACLE")) {
				dao = new UserInfoOracleDao();
			}else {
				dao = new UserInfoMsSqlDao();
			}
			// 1. 저장하기
			// 스캐너를 통해서 데이터를 받고 
			UserInfo userInfo = new UserInfo("110", "abc", "홍길동");
			dao.insertUserInfo(userInfo);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("요청하신 파일 이름이 없네요 !!!");
		}
		
		

	} // end of main

}
