package Starcraft4;

public class Zergling extends Unit implements Zerg {

	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 50;
	}

	@Override
	public void attack(Unit unit) {
		// instanceof
		System.out.println(this.name + " 이 " + unit.getName() + "을 공격합니다.");
		// 질럿의 공격력 this.power
		unit.beAttacked(this.power);
	}

}
