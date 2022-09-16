package ch18;

public class MainTest1 {

	public static void main(String[] args) {
		
//		Student student = new Student();
		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "흐르는 강물처럼", "파울로코엘료");
		Book book3 = new Book(3, "사피엔스", "유발하라리");
		Book book4 = new Book(4, "흐르는 강물처럼", "파울로코엘료");

		
		System.out.println(book1);
		System.out.println(book2);
//		System.out.println(student.toString());
//		System.out.println(book1.toString());
		//Object - equals
		if(book1.equals(book4)) {
			System.out.println("같은 책입니다.");
		}else {
			System.out.println("다른 책입니다.");
		}
		
	}
}
