package ch15;

import java.util.Scanner;

public class FruitMainTest2 {

	public static void main(String[] args) {

		// 문제
		// 배열 사용해서 복숭아, 바나나 담아서
		// 화면에 정보들을 출력
		// 바나나는 할인된 가격으로 정보를 출력해주세요

		Fruit[] fruits = new Fruit[5];
		fruits[0] = new Peach();
		fruits[1] = new Banana();
		fruits[2] = new Peach();
		fruits[3] = new Banana();
		fruits[4] = new Peach();

//		for (int i = 0; i < fruits.length; i++) {
//			// 바나나 할인된 가격, 
//			if (fruits[i] instanceof Banana) {
//				((Banana) fruits[i]).saleBanana();
//				fruits[i].showInfo();
//			}
//			
//			System.out.println("==================");
//
//		}
		for(int i = 0; i < fruits.length; i++) {
			if(fruits[i] != null) {
				if(fruits[i] instanceof Banana) {
					((Banana)fruits[i]).saleBanana();
				}
				fruits[i].showInfo();
			}
			System.out.println();
		}

	}

}
