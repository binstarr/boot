package ch06;

public class Student {

	// 상태(속성)
	public int studentId; 
	public String studentName; 
	public String address; 
	// 참조 타입( 대문자 데이터 타입) 초기화 하지 않으면 기본값은 null이다.
	
	// 행위(기능)
	// 메서드
	public void study() {
		System.out.println(studentName + "학생이 공부를 합니다.");
	}
	
	public void breakTime() {
		System.out.println(studentName + " 학생이 휴식을 합니다.");
	}
	
	public void cleanUp() {
		System.out.println(studentId + " 학생이 청소를 합니다.");
	}
	
	public void showStudentInfo() {
		System.out.println("학생에 번호 : " + studentId);
		System.out.println("학생의 이름 : " + studentName);
		System.out.println("학생의 주소 : " + address);
	}
	
	// 메서드는 객체의 멤버 변수를 활용해서 동작을 완성한다.
	
}
