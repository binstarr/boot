package Starcraft2;

public class Dragoon {

	private String name;
	private int power;
	private int hp;
	
	public Dragoon(String name) {
		this.name = name;
		this.power = 15;
		this.hp = 200;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPower() {
		return power;
	}
	
	public int getHp() {
		return hp;
	}
	
}
