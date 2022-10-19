package dataStructure;

import java.util.ArrayList;
import java.util.Collections;

public class MainTest5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList.size());
		
		for (int i = 1; i <= 45; i++) {
			arrayList.add(i);
		}
		System.out.println(arrayList);
		Collections.shuffle(arrayList);
		System.out.println(arrayList);
		
		// 오름차순
		arrayList.subList(0, 6).sort(null);
		System.out.println(arrayList.subList( 0, 6));
		
		
		
		

	}

}
