package ch04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import ch01.Todo2;

public class HttpMainTest2 {

	public static void main(String[] args) {

		// http 통신을 하기 위해서
		// URL 객체를 만든다.
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos"); // URL 객체를 만들어서
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
			// JSON <---- 형식을 가지고 있는 문자열
			// GSON <---- 형식이 있기 때문에 어떠한 규칙으로 자바 언어에서 편하게 
									// 사용할 수 있는 코드를 미리 만들어준 라이브러리 
			System.out.println(str.substring(32,37)); // 5 시작점, 11 마지막점
			// Json parsing
			Gson gson = new Gson();
			// 파싱을 해보기!!!!
			
			// 1.
			// gson.fromJson(str, Todo.class);
			// [ {}, {} ]
			ActionListener actionListener = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			};
			// 위처럼 익명구현클래스다.
			Type type = new TypeToken<ArrayList<Todo>>(){}.getType();
			ArrayList<Todo> todos = gson.fromJson(str, type);
			for (Todo todo : todos) {
				System.out.println("변환");
				System.out.println(todo.toString());
			}
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end of main

}// end of class
