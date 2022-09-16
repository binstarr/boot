package ch07.constructor;

public class MainTest3 {

	// 코드의 시작점( 메인 쓰래드)
	public static void main(String[] args) {
		
		Person person1 = new Person(180, 78, "남성", "Thomas", 37);
		Person person2 = new Person(180, 78, "남성", "Thomas", 37);
		
		person1.showPersonProfile();
		person2.showPersonProfile();

	}

}
