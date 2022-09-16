package ch11;

public class MainTest2 {
	
	public static void main(String[] args) {
//		NumberPrinter2.id = 10; // 멤버 변수라 안된다.
		NumberPrinter2.waitNumber = 10; // 스태틱 변수라 가능하다.
		System.out.println(NumberPrinter2.waitNumber);
		
		NumberPrinter2.getWaitNumber();
		
		NumberPrinter2 printer2 = new NumberPrinter2(1);
		printer2.id = 1;
		System.out.println(printer2.id);
		
	}

}
