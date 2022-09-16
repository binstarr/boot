package ch13;

public class Warrior extends Hero{

	// name, hp
	public Warrior(String name, int hp) {
		super(name, hp);
	}
	
	// attack()
	public void comboAttack() {
		System.out.println("콤보 어택");
	}
	
}
