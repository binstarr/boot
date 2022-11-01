package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpMainTest {

	public static void main(String[] args) {

		// http 통신을 하기 위해서
		// URL 객체를 만든다.
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/posts/15"); // URL 객체를 만들어서
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();  // connection 객체를 얻어냄
			
			connection.setRequestMethod("GET"); // 프로토콜 지정
			connection.connect(); // 연결 요청  
			
			int statusCode = connection.getResponseCode();
			System.out.println("statusCode : " + statusCode);
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(connection.getInputStream())); // BufferedReader 보조 스트림 (데이터를 읽어주는 역할)
			StringBuffer sb = new StringBuffer(); // 
			String line = null;
			
			if(statusCode == 200) {
				while((line = reader.readLine()) != null) { // 데이터를 다 읽으면 -1이나 null을 반환한다.
					sb.append(line + "\n");
				}
			}
			
			String str = sb.toString(); // StringBuffer 를  String으로 변환
			System.out.println(str);
			System.out.println("-----------------------");
			
			// JSON <---- 형식을 가지고 있는 문자열
			// GSON <---- 형식이 있기 때문에 어떠한 규칙으로 자바 언어에서 편하게 
									// 사용할 수 있는 코드를 미리 만들어준 라이브러리 
			System.out.println(str.substring(32,37)); // 5 시작점, 11 마지막점
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end of main

}// end of class
