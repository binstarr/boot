package ch11;

public class NumberPrinter {

	private int id;
	private static int waitNumber;
	
	public NumberPrinter(int id) {
		this.id = id;
		this.waitNumber = 1;
	}
	
	// 번호표를 출력 합니다.
	public void printWaitNumber() {
		System.out.println(id + "기기의 대기 순번 " + waitNumber);
		waitNumber++;
	}
	
	public static void main(String[] args) {
		NumberPrinter numberPrinter1;
		
		// static 변수, 클래스 변수, 정적 변수
		// 클래스 이름으로 직접 
		
//		numberPrinter1.printWaitNumber;
		
	}
	
}
