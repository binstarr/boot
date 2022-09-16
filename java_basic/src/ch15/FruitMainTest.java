package ch15;

import java.util.Scanner;

public class FruitMainTest {

	public static void main(String[] args) {
		
		// 다양한 형태로 클래스를(타입을 ) 바라볼 수 있다. --> 다형성
		Fruit fruit1 = new Banana(); // 업캐스팅 상태
		Fruit fruit2 = new Peach(); // 업캐스팅 상태
		fruit2.name = "복숭아";
//		fruit2.orgin = "한국";
		
		
//		fruit1.showInfo();
//		fruit2.showInfo();

		// 스캐너에 넘겨 받은 값이 1이면 복숭아 2이면 바나나
		Fruit fruit;
		
		int userInput = 1;
		fruit = new Banana();
		// instanceof 키워드는 객체의 타입을 확인한다.
		if(fruit instanceof Banana ) {
			System.out.println("바나나 타입 맞습니다.");
			System.out.println(((Banana)fruit).orgin);
			
			// 화면에 원산지를 출력해주세요
		}else if(fruit instanceof Peach) {
			System.out.println("복숭아 타입 맞습니다.");
		}
		
	}

}
