package ch08;

public class Wizard {

	// 이름
	// 체력
	// 마나
	// 기본공격력
	// 스킬공격력

	String name;
	int hp;
	int mp;
	int damage;
	int strikingPower;
	int skillPower;

	// 생성자
	public Wizard(String name) {
		this.name = name;
		hp = 100;
		mp = 100;
		strikingPower = 10;
		skillPower = 100;
	}

	// showInfo
	public void showInfo() {
		System.out.println("===상태창===");
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " + mp);
		System.out.println("기본공격력 : " + strikingPower);
		System.out.println("마법공격력 : " + skillPower);
	}

	public void iceSkill() {
		if (mp == 0 || mp < 10) {
			System.out.println("스킬을 사용할 수 없습니다.");
			System.out.println("마나가 부족합니다.");
		} else {
			System.out.println("얼음 스킬을 사용했습니다.");
			mp -= 10;
		}
	}

	public void fireSkill() {
		if (mp == 0 || mp < 20) {
			System.out.println("스킬을 사용할 수 없습니다.");
			System.out.println("마나가 부족합니다.");
		} else {
			System.out.println("얼음 스킬을 사용했습니다.");
			mp -= 20;
		}
	}

	public void attacked(int damage) {
		System.out.println();
		System.out.println("공격 당합니다.");
		hp -= damage;
		if (hp == 0 || hp < 0) {
			System.out.println("죽었습니다.");
		} else {

		}

	}

}
