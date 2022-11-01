package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainTest {
	
	public static void main(String[] args) {
		// 1. 자바로 Http 통신 코드 작성 https://jsonplaceholder.typicode.com/comments
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/comments");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
		
			int statusCode = connection.getResponseCode();
			System.out.println("statusCode : " + statusCode); // 에러가 뜨면 404뜸!
			// 이제 읽어줘야함
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer stringBuffer = new StringBuffer();
			String line = null;
			if(statusCode == 200) {
				while((line = bufferedReader.readLine()) != null) {
					stringBuffer.append(line + "\n");
//					System.out.println(stringBuffer.toString());
				}
			}
			String str = stringBuffer.toString();
			System.out.println(str);
			
			// 2. DTO 설계
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	// 3. GSON 사용해서 JSON 파싱 처리

	// 2. 자바로 Http 통신 코드 작성 https://jsonplaceholder.typicode.com/users
	// 2. DTO 설계
	// 3. GSON 사용해서 JSON 파싱 처리
}
