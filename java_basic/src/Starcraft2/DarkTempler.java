package Starcraft2;

public class DarkTempler {
	
	private String name;
	private int power;
	private int hp;
	
	public DarkTempler(String name) {
		this.name = name;
		this.power = 30;
		this.hp = 250;
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
