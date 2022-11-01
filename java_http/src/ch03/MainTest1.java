package ch03;

import com.google.gson.JsonObject;

public class MainTest1 {

	public static void main(String[] args) {
		// JSON
		JsonObject jsonObject1 = new JsonObject();
		jsonObject1.addProperty("책이름", "삼국지");
		jsonObject1.addProperty("저자", "나관중");
		jsonObject1.addProperty("출판사", "아이템북스");
		jsonObject1.addProperty("가격", 12420);
		// 화면에 출력
		System.out.println(jsonObject1);
		System.out.println(jsonObject1.get("책이름"));
		System.out.println(jsonObject1.get("저자"));
		System.out.println(jsonObject1.get("출판사"));
		System.out.println(jsonObject1.get("가격"));
		// 얕은복사 연습
		System.out.println("--------------------------");
		JsonObject jsonObject2 = jsonObject1;
		System.out.println(jsonObject2);
		System.out.println("--------------------------");
		jsonObject1.addProperty("판매처", "인터파크도서");
		System.out.println(jsonObject1);
		System.out.println(jsonObject2); // 두개 다 더해짐
		// 깊은복사 연습
		System.out.println("--------------------------");
		JsonObject jsonObject3 = jsonObject1.deepCopy();
		jsonObject3.addProperty("출간", "2022-10-31");
		System.out.println(jsonObject1);
		System.out.println(jsonObject3);
		
	}
	
}

// book 클래스를 만들어서 --> json --> 깊은 복사 얕은 복사 개념 테스트
