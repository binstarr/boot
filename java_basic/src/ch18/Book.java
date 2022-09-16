package ch18;

public class Book {

	private int bookId;
	private String title;
	private String author;
	
	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return this.title;
	}
	@Override
	public boolean equals(Object obj) {
		// equals를 사용하지 마세요
		// 도전과제 !!!
		// 현재 객체의 title과 obj안에 들어오는 녀석의 title 글자가 같다면 true를 리턴하고 아니면 false를 리턴 
		//3. 추가적인 데이터가 필요하다면 코드를 추가 하면 된다.
		// 책 이름과 저자가 같다면 같은 책으로 판별하겠어!!
		if(obj instanceof Book) {
			Book tempBook = (Book)obj;
			if(this.title == tempBook.title && this.author ==tempBook.author) {
				return true;
			}
		}
		return false;	
		
		// 2. Object 타입은 모든 클래스의 최상위 이기 때문에 아무것이든 들어올 수 있다. : 문제 해결
//		if(obj instanceof Book) {
//			if(this.title == ((Book)obj).title) {
//				return true;
//			}
//		}
//		return false;	
		
		// 1. 단계 this.title 과 object녀석 title 값이 같다면 같은 책이라고 앞으로 판별하겠어!!
//		if(this.title == ((Book)obj).title) {
//			return true;
//		}else {
//			return false;
//		}
		
	}
	
	
	
}
