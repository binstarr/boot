package dbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest1 {

	public static void main(String[] args) {
		// 리플렉션
        try {
            //동적 바인딩 
            // 컴파일 시점에 문자열로 저장해두고 
            // 런타임 시점에 클래스를 메모리에 올리는 과정
            Class.forName("com.mysql.cj.jdbc.Driver");
            // (소켓통신)
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
            String url = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
            Connection conn = DriverManager.getConnection(url, "root", "asd1234"); // 세션 열어주는 기능
            Statement stmt = conn.createStatement(); // 자바에서 쿼리를 만들어주는 오브젝트
            String sql = "SELECT * FROM membertbl";
            ResultSet rs = stmt.executeQuery(sql); // 쿼리를 통해서 결과 집합을 ResultSet set계열로 받아주는 녀석 (위부터 가장 기초적인 3개)
            while (rs.next()) {
                System.out.println(rs.getString("memberID"));
                System.out.println(rs.getString("memberName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



	}

}
