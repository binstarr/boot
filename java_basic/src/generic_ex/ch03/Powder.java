package generic_ex.ch03;

public class Powder extends Material {

	@Override
	public String toString() {
		return "재료는 Powder 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("프린팅 합니다.");
		
	}
	
} // end of class
