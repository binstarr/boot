package dataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainTest2 {

	public static void main(String[] args) {
		
		Map map;
		
		// key와 value 구조로 데이터를 저장한다.
		
		HashMap<String, String> map1 = new HashMap<>();
		// [] ---> list
		// {} ---> map
		
		// 값을 추가하는 방법
		map1.put("A01", "김포공항정문");
		map1.put("A02", "김포공항후문");
		map1.put("A03", "김포공항로비");
		map1.put("A04", "null");
		map1.put("A04", "중복값"); // key 값이 중복되면 덮어쓰기 된다. 즉 중복이 안된다.
		System.out.println(map1);
		
		// 값을 꺼내는 방법
		System.out.println(map1.get("A01"));
		System.out.println(map1.get("C01"));
		
		// null 값을 저장하지 않는 map 계열
//		Hashtable<String, String> hashtable = new Hashtable<>();
//		hashtable.put("h1", "안녕");
//		hashtable.put("h2", null); // 단점. 컴파일 시점에 확인되지 않는다!!!
//		System.out.println(hashtable);
//		
		// 값을 수정
		map1.put("A01", "값수정");
		System.out.println(map1);

		// 삭제 방법
		map1.remove("A01");
		map1.remove("A01", new ArrayList<Integer>()); // 참고로 배열 안에 배열을 넣을 수 있다.
//		map1.clear();
		System.out.println(map1);
		
		for(int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get(i)); // 인덱스가 없어서 사용할 수 없다.
		}
		
		// map 계열을 반복문을 사용할 때 foreach
		// map1 -- key, value
		for (String key : map1.keySet()) {
			System.out.println("key : " + key);
			// 값을 꺼내고 싶으면 어떻게 코딩해야 할까요???
			
			System.out.println("value : " + map1.get(key));
		}
		
		for(Entry<String, String> entry : map1.entrySet()) {
			System.out.println("[key] : " + entry.getKey() + " , " + "[value] : " + entry.getValue() );
			
		}

	}

}
