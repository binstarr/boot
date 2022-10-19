package db_connect.ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBClient {
	//String url = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	// workbench의 계정 아이디, 비밀번호를 멤버변수로 선언
	private static final String DB_HOST = "localhost"; // 127.0.0.1 = localhost
	private static final int  DB_PORT = 3306; // 포트 번호
	private static final String DB_DATABASE_NAME = "shopdb"; // DB명
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "asd1234";
	
	private static Connection conn = null; // 자바 개발자들이 만들어주는
	private static DBClient dbClient; // 사용자 정의 클래스
	
	// 외부에서 바로 생성을 막게 설계한다.
	private DBClient() {
		
	}
	
	// synchronized
	public static DBClient getInstance() { // 누구나 접근할 수 있는 메서드를 만들어서 
		// 동기화 필요하다면
		if(dbClient == null) {
			dbClient = new DBClient();
		}
		return dbClient;
	}
	
	private static void unBindingDBClient() {
		dbClient = null;
	}
	// ------------------ 위에 기본 셋팅 
	
	// 연결
	public Connection getConnection() {
		// 방어적 코드
		if(conn == null) {
			//연결          ,                   localhost = %s, 3306 = %d, shopdb = %s UTF-8 = %s
			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			
			// MySQL.JDBC 드라이버를 클래스로 로딩해서 DriverManager 클래스를 사용한다. 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println(">>> Connection Success <<<");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println(">>> Connection Fail1 <<<");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(">>> Connection Fail2 <<<");
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
				System.out.println(">>> Connection Fail3 <<<");
				e.printStackTrace();
			}
			conn = null;
		}
	}
	
}
