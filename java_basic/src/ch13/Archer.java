package ch13;

public class Archer extends Hero{

	public Archer(String name, int hp) {
		super(name, hp);
	}
	
	public void fireArrow() {
		System.out.println("화살 공격");
	}

}
