package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class HttpMainTest3 {

	public static void main(String[] args) {

		// http 통신을 하기 위해서
		// URL 객체를 만든다.
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/photos/1"); // URL 객체를 만들어서
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
			System.out.println("str : " + str);
			System.out.println("-----------------------");
			
			// Json parsign
			Gson gson = new Gson();
			
			Todo2 todo2 = gson.fromJson(str, Todo2.class);
			System.out.println(todo2);
			System.out.println(todo2.albumId);
			System.out.println(todo2.id);
			System.out.println(todo2.title);
			System.out.println(todo2.url);
			System.out.println(todo2.thumbnailUrl);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end of main

}// end of class
