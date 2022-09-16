package ch07.constructor;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 사용자 정의 생성자
//		Student student1 = new Student(10, "이순신", 3); 
		
		//기본 생성자 활용해서 메모리 할당
		Student student1 = new Student(); 
		
		// 사용자 정의 생성자 활용해서 메모리에 할당
		Student student2 = new Student(100, "홍길동", 1);
		
		System.out.println(student1.showInfo());
		System.out.println(student2.showInfo());

	}

}
