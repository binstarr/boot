package ch12;

import java.util.Scanner;

public class BookMainPage2 {

	public static void main(String[] args) {

		Book book1 = new Book(100, "플러터UI실전", "(김근호)");
		Book book2 = new Book(200, "무궁화꽃이피었습니다", "(김진명)");
		Book book3 = new Book(150, "흐르는강물처럼", "(파울로코엘료)");
		Book book4 = new Book(350, "리딩으로리드하라", "(이지성)");
		Book book5 = new Book(150, "사피엔스", "유발하라리");

//		2번 문제
//		북 데이터를 입력하고
//		북 데이터 조회 하는 기능을 만들어주세요
//		스캐너활용 배열 활용
//		1. 누르면 북 정보를 저장하는 기능을 만들어 주면
//		2. 전체 북에 대한 정보를 출력하는 기능을 만들어 주면 됩니다.
//		3. 예를 들어 북이 3개 있다면 2번 누르면 2에 대한 북에 정보만 출력
		Book[] shoppingCart = { book1, book2, book3, book4, book5 };
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 기능을 눌러주세요.");
		System.out.println("1.책 조회\t2.책 저장\t3.전체조회");
		int select = sc.nextInt();
		if (select == 1) {
			// 1.조회 기능
			System.out.println("조회할 책을 눌러주세요(1~5)");
			int i = sc.nextInt() - 1;
			shoppingCart[i].showInfo();
			
		} else if (select == 2) {
			// 2. 저장 기능
			System.out.println("몇가지의 책을 저장하겠습니까?");
			int count = sc.nextInt();
			Book[] saveBook = new Book[count ];
			
			for(int i = 0; i <= count; i++) {
//				System.out.println("저장하고 싶은 책의 총 페이지를 입력 해주세요.");
//				int total = sc.nextInt();
//				saveBook[i-1].setTotalPage(total);
				System.out.println("저장하고 싶은 책의 제목을 입력 해주세요.");
				String title = sc.nextLine();
				saveBook[i].setTitle(title);
//				System.out.println("저장하고 싶은 책의 저자를 입력 해주세요.");
//				String author = sc.next();
//				saveBook[i].setAuthor(author);
				System.out.println(i + "번째 책이 저장되었습니다.");
			}
			saveBook[count].showInfo();
			
			
			
			
		} else if (select == 3) {
			// 2. 전체 조회.
			for (int i = 0; i < shoppingCart.length; i++) {
				shoppingCart[i].showInfo();
			}
		} else {
			System.out.println("잘못눌렀습니다.");
		}
	}
}
