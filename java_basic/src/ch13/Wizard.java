package ch13;

public class Wizard extends Hero{

	public Wizard(String name, int hp) {
		super(name, hp);
	}
	
	public void freezing() {
		System.out.println("얼음 공격");
	}

}
