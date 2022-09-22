package generic_ex.ch03;

public class Plastic extends Material {

	@Override
	public String toString() {
		return "재료는 Plastic 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("프린팅 합니다.");
		
	}
	
} // end of class
