package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainTest1 {

	// HOW, WHY
	public static void main(String[] args) {

		// 인덱스있다.
		// 순서가 있고 중복이 가능하다. - data 들을 어떠한 알고리즘으로 저장할 것인가?
		List list0;
		
		List list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.add(0, 1000);
		list.add(null);
		System.out.println(list);
		list.add(0, 5000);
		System.out.println(list);
		// addNull 확인해보기
		
		//값 삭제 하는 방법
		list.remove(4); // 인덱스 번호로 요소 삭제하기
		System.out.println(list);
		list.remove(new Integer(5000));
		// 만약 한번에 전체로 삭제하고 싶다면
//		list.clear();
		System.out.println(list);
		// 인덱스 번호로 삭제 또는 Object 단위로 삭제할 수 있다.
		
		//사이즈 확인 방법
		System.out.println(list.size());
		
		// 값을 하나 하나 출력하고 싶다면 a[19]
		// get 이라는 메서드를 사용한다.
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		
		// 수정하기
		list.set(0, 2000);
		System.out.println(list);
		// C R U D
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("--------------------------------------");
			System.out.println(list.get(i));
		}
		
		
		// while
		// 요소 순회(반복자) 컬렉션 프레임워크에 저장된 요소들을 하나씩 참조해주는 녀석
		Iterator<Integer> iter = list.iterator(); // while문을 사용하기 위한 iterator
		while(iter.hasNext()) {
			System.out.println("요소 확인 : "  + iter.next()); 
		}
		
		// 추가적으로 유용한 기능들이 있어요
		System.out.println(list.contains(new Integer(2000)));
		System.out.println(list.contains(new Integer(2000)));
		// 2000 이라는 녀석이 몇 번째 인덱스에 존재하는지 알고 싶다면
		// indexOf를 사용하면 된다.
		System.out.println("인덱스 위치 확인 : " + list.indexOf(new Integer(2000)));
		// 만약 리스트안에 Object 존재 하지 않으면 -1 을 반환한다.
		System.out.println("인덱스 위치 확인 : " + list.indexOf(new Integer(2005)));
		
		// List, add, remove, set, clear, for, while, contains, indexOf
		
		List<String> list2 = new LinkedList<>();
		list2.add("가");
		list2.add("나");
		list2.add("다");
		list2.add("가");
		System.out.println(list2);
		// addAll 확인해보기
		

	}
	

}
