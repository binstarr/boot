package db_connect.ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBClient {
	
	// 연결할 workbench info
	private static final String DB_HOST = "localhost";
	private static final int DB_PORT = 3306;
	private static final String DB_DATABASE_NAME = "1stfloor";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "asd1234";
	
	private static Connection conn = null; // 자바 개발자들이 만들어준 연결고리
	private static DBClient dbClient;
	
	private DBClient() {}
	
	public static DBClient getInstance() {
		if(dbClient == null) {
			dbClient = new DBClient();
		}
		return dbClient;
	}
	
	// 연결 (권한)
	public Connection getConnection() {
		// 방어적 코드
		if(conn == null) {
			///연결
			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			
			// MYSQL.JDBC 드라이버를 클래스로 로딩해서 DriverManager 클래스를 사용한다.
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println("Connection Success");
			} catch (ClassNotFoundException e) {
				System.out.println("Connection Fail");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("Connection Fail");
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	// Connection 해제
	public static void connectClose() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Connection Fail");
				e.printStackTrace();
			}
			conn = null;
		}
	}
	
	

}
