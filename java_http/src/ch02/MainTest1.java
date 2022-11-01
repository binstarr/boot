package ch02;

import com.google.gson.JsonObject;

public class MainTest1 {

	public static void main(String[] args) {
		
		// Gson --> 자바 코드를 변환 방법
		
		// JSONObject
		JsonObject jsonObject1 = new JsonObject();
		jsonObject1.addProperty("name", "홍길동");
		jsonObject1.addProperty("age", 24);
		jsonObject1.addProperty("job", "개발자");
		
		System.out.println(jsonObject1);
		// 하나씩 꺼내보자
		System.out.println(jsonObject1.get("name")); // key : value --> map구조
		System.out.println(jsonObject1.get("age")); 
		System.out.println(jsonObject1.get("job")); 
		
		// 깊은 복사와 얕은 복사 개념 !!!
		JsonObject jsonObject2 = jsonObject1; // 얕은 복사
		System.out.println(jsonObject2);
		jsonObject1.addProperty("취미", "코딩");
		System.out.println("------------------");
		System.out.println(jsonObject2);
		
		// 깊은 복사 개념
		JsonObject jsonObject3 = jsonObject1.deepCopy();
		jsonObject3.addProperty("결혼여부", true);
		System.out.println("------------------");
		System.out.println(jsonObject1);
		System.out.println("------------------");
		System.out.println(jsonObject3);
		

	}

}
