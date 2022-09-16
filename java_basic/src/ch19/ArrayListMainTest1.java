package ch19;

import java.util.ArrayList;

public class ArrayListMainTest1 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		Book book1 = new Book("1", "흐르는강물처럼", "파울로코엘료");
        Book book2 = new Book("2", "플러터UI실전", "김근호");
        Book book3 = new Book("3", "무궁화꽃이피었습니다", "김진명");
        Book book4 = new Book("4", "리딩으로리드하라", "이지성");
        Book book5 = new Book("5", "사피엔스", "유발하라리");
        
        // ArrayList 란
        // 배열을 보다 쉽게 사용할 수 있도록 설계된 클래스 입니다.
        
        // 데이터를 담을 공간 만들기
        // 제네릭 ...
        ArrayList<Book> cart = new ArrayList<>();
        
        // 1. 데이터를 추가하는 방법
        // cart[0] = " ";
        cart.add(book1);
        cart.add(book2);
        cart.add(book3);
        
        // 2. 값을 꺼내는 방법
        Book b1 = cart.get(0);
//        System.out.println(b1);
//        System.out.println(cart.get(1));
//        System.out.println(cart.get(2));
//        System.out.println(cart.get(3);
//        System.out.println("====================");
//        System.out.println(cart);
//        System.out.println("====================");
//
//        // cart.length, cart.size()   length는 변수고 size()는 괄호가 있어서 메서드이다.
//        System.out.println(cart.size());
//        System.out.println(arr.length);
//        System.out.println("====================");

//        for(int i = 0; i < cart.size(); i++) {
//        	// 2. 값을 꺼내는 방법
//        	// 배열 arr[0]
////        	System.out.println(cart.get(i));
//        	((Book)cart.get(i)).showInfo();
//    		System.out.println();
//        }
//        System.out.println("===============");
//        // 초기화 for문을 사용해서 showInfo 호출해주세요
//        // foreach문 : " : " 기준으로 오른쪽은 배열 ,, 
//        // cart의 길이만큼 반복을 돈다.
//        for(Book b : cart) {
//        	b.showInfo();
//        }
//        System.out.println("===============");

        // 3. 삭제하는 방법
        cart.remove(1);
        System.out.println();
        for(int i = 0; i < cart.size(); i++) {
        	System.out.println("i : " + i);
        	cart.get(i).showInfo();
        }
        System.out.println("--------------------");
        // 4. 수정하는 방법
        Book tempBook = cart.get(1);
        System.out.println(tempBook.toString());
        
        cart.set(1, book5); // 수정 완료 !!! 배열 1번에 book5를 넣는다.
        Book tempBook2 = cart.get(1);
        System.out.println("수정후 데이터 : " + tempBook2.toString());
        
	} // end of main
}// end of class
