package ch12;

public class BookMainPage {

	public static void main(String[] args) {
		
		Book book1 = new Book(100, "플러터UI실전", "(김근호)");
		Book book2 = new Book(200, "무궁화꽃이피었습니다", "(김진명)");
		Book book3 = new Book(150, "흐르는강물처럼", "(파울로코엘료)");
		Book book4 = new Book(350, "리딩으로리드하라", "(이지성)");
		Book book5 = new Book(150, "사피엔스", "유발하라리");
		
		// 문제
		// 배열을 이용해서 shoppingCart 변수에 담아 봅시다.
	
		// 1. 배열을 크기를 10개로 선언 -> 인덱스 9
		Book[] shoppingCart	= new Book[10];	
		// 2. 사고싶은 책을 장바구니에 담아 봅시다. 3개만 - 인덱스 연산
		shoppingCart[0] = book1; 
		shoppingCart[1] = book2; 
		shoppingCart[2] = book4; 
		System.out.println(shoppingCart[0]);
		System.out.println(shoppingCart[1]);
		System.out.println(shoppingCart[2]);
		// 3. 장바구니에 담은 책을 화면에 출력해주세요 - for문 활용 출력
		// 책 타이틀, 책 작가
		for(int i = 0; i < 3; i++) {
			System.out.print(shoppingCart[i].getTitle());
			System.out.println(shoppingCart[i].getAuthor());
		}
		System.out.println("================");
		// 4. 0번째 인덱스 있는 녀석과 2번째 있는 녀석을 스왑해주세요
		for(int i = 0; i < 3; i++) {
			if(i == 0) {
				System.out.print(shoppingCart[2].getTitle());
				System.out.println(shoppingCart[2].getAuthor());
			}else if(i ==2){
				System.out.print(shoppingCart[0].getTitle());
				System.out.println(shoppingCart[0].getAuthor());
			}else {
				System.out.print(shoppingCart[i].getTitle());
				System.out.println(shoppingCart[i].getAuthor());
			}
	
		}
		// 5. 3번째 인덱스에 있는 녀석을 삭제해 보세요
		
	}

	
	
}
