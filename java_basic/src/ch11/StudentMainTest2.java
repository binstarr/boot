package ch11;

public class StudentMainTest2 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setStudentName("강성빈");
		System.out.println(student1.getStudentName());
		System.out.println(student1.getSerialNum());
		
		Student student2 = new Student();
		student2.setStudentName("김성빈");
		System.out.println(student2.getStudentName());
		System.out.println(student2.getSerialNum());
		
		Student student3 = new Student();
		student3.setStudentName("최성빈");
		System.out.println(student3.getStudentName());
		System.out.println(student3.getStudentCode());
		
		// 김성빈의 학생 번호는?
		System.out.println(
				student2.getStudentName() + " : " +
				student2.getStudentCode());
		student2.showInfo();
		
		

	}

}
