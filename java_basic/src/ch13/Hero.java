package ch13;

public class Hero {

	int hp;
	String name;
	
	
	public int getHp() {
		return hp;
	}

	public String getName() {
		return name;
	}

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void attack() {
		System.out.println(this.name + "이 공격을 합니다.");
	}
	
	public void attack(Warrior warrior) {
		System.out.println(this.name + "이 " + warrior.getName() + " 을 공격합니다." );
	}
	
	public void attack(Archer archer) {
		System.out.println(this.name + "이 " + archer.getName() + " 을 공격합니다." );
	}
	
	public void attack(Wizard wizard) {
		System.out.println(this.name + "이 " + wizard.getName() + " 을 공격합니다." );
	}
	
}
