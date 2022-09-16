package Starcraft;

public class Zergling {
	
	private String name;
	private int power;
	private int hp;
	
	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 50;
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
	
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
		// 질럿을 공격
		zealot.beAttacked(this.power);
	}
	
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		marine.beAttacked(this.power);
	}
	
	public void beAttacked(int power) {
		this.hp -= power;
		if(hp <= 0) {
			System.out.println(name + "은 사망했습니다.");
			hp = 0;
		}else {
			System.out.println(this.name + "이 공격을 당합니다!");
		}
	}
	
	public void showInfo() {
		System.out.println("====상태창====");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("생명력 : " + hp);
	}

}
