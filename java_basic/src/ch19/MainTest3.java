package ch19;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {
		
		// 스캐너를 생성해서 책 정보를 저장
		// ArrayList 에 담고, C R U D 기능을 사용하는 코드를 만들어 주세요
		Scanner scanner = new Scanner(System.in);
		
		Book book1 = new Book("1", "흐르는강물처럼", "파울로코엘료");
        Book book2 = new Book("2", "플러터UI실전", "김근호");
        Book book3 = new Book("3", "무궁화꽃이피었습니다", "김진명");
        Book book4 = new Book("4", "리딩으로리드하라", "이지성");
        Book book5 = new Book("5", "사피엔스", "유발하라리");
        
		ArrayList<Book> bookArray = new ArrayList<>(); 
		
		bookArray.add(book1); 
		bookArray.add(book2); 
		bookArray.add(book3); 
		bookArray.add(book4); 
		bookArray.add(book5); 
		
		System.out.println(bookArray.get(2));
		
		
		// 함수를 호출해서 기능을 동작시킨다.
//		Scanner sc = new Scanner(System.in);
//		boolean flag = false;
//		System.out.println("1.추가\t2.삭제\t3.업데이트\t4.조회\t5.종료");
//		String choice = sc.nextLine();
//		while(flag = true) {
//			
//			if(choice.equals("1")) {
//				// 정보 추가
//				Book bookTemp = insert();
//				bookArray.add(bookTemp);
//				System.out.println(bookArray);
//				
//			}else if(choice.equals("2")) {
//				// 정보 삭제
//				delete(bookArray, 1);
//				System.out.println(bookArray);
//				
//			}else if(choice.equals("3")) {
//				// 정보 업데이트
//				update(bookArray,2, book5);
//				System.out.println(bookArray);
//				
//			}else if(choice.equals("4")) {
//				// 정보 조회
//				read(bookArray); 
//				
//			}else if(choice.equals("5")) {
//				break;
//				
//			}else {
//				System.out.println("잘못 눌렀습니다.");
//			}
//			flag = false;
//		}

	}// end of main
	
	// 함수로 만들어 주세요
	public static Book insert() { // 추가
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("북 아이디 입력하세요");
		String id = scanner.nextLine();
		System.out.println("제목 입력하세요");
		String title = scanner.nextLine();
		System.out.println("저자 입력하세요");
		String author = scanner.nextLine();
		
		Book book = new Book(id, title, author);
//		list.add(book);
		return book;
		
	}
	
	public static ArrayList<Book> delete(ArrayList<Book> list, int index) { // 삭제
		ArrayList<Book> localList = list;
		localList.remove(localList.get(index));
		return localList;
	}
	
	public static ArrayList<Book> update(ArrayList<Book> list, int index, Book book) { // 수정
		ArrayList<Book> localList = list;
		localList.set(index, book);
		return localList;
	}
	
	public static void read(ArrayList<Book> list) { // 선택 조회
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> localList = list;
			System.out.println("조회할 책 번호를 입력하세요.");
			int index = scanner.nextInt();
			System.out.println("index : " + index);
			((Book)localList.get(index)).showInfo();
			System.out.println();
		
	}

}// end of class
