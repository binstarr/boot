package ch11;

public class Student {
	
	public static int serialNum;
	private int studentCode;
	private String studentName;
	private int studentGrade;
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public Student() {
		serialNum++;
		studentCode = serialNum;
	}
	
	public int getStudentCode() {
		return studentCode;
	}
	
	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getStudentGrade() {
		return studentGrade;
	}
	
	public void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}
	
	public void showInfo() {
		System.out.println(studentName + "의 학번은 : " + studentCode);
	}
	
}
