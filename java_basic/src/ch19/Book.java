package ch19;

public class Book {

	private String bookId;
	private String title;
	private String author;
	
	public Book(String bookId, String title, String author) {
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
		if(obj instanceof Book) {
			Book tempBook = (Book)obj;
			if(this.title == tempBook.title && this.author ==tempBook.author) {
				return true;
			}
		}
		return false;	
		
	}
	public void showInfo() {
		System.out.println("==== 책 정보 ====");
		System.out.println("책 제목 : " + this.title);
	}
	
	
	
}
