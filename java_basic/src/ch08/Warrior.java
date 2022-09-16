package ch08;

public class Warrior {

	int warriorNumber;
	int level;
	int hp;
	int exp;

	public Warrior(int warriorNumber) {
		this.warriorNumber = warriorNumber;
		this.hp = 100;
		this.level = 1;
	}

	public void warriorStatus() {
		System.out.println("===상태창===");
		System.out.println("전사" + warriorNumber);
		System.out.println("레벨 : " + level);
		System.out.println("HP : " + hp);
		System.out.println("경험치 : " + exp);

	}

	// 레벨
	public void attack() {
		System.out.println();
		System.out.println("몬스터를 공격합니다.");
		System.out.println("몬스터를 죽였습니다.");
		exp += 50;
		if (exp == 100) {
			System.out.println("레벨업!");
			level++;
			exp = 0;
		} else {
			System.out.println("경험치를 획득합니다. (" + exp + ")");
		}
	}

	public void attaked() {
		System.out.println();
		System.out.println("공격 당했습니다. ( -50 )");
		hp -= 50;
		if (hp == 0 || hp < 0) {
			System.out.println();
			System.out.println("**********죽었습니다.***********");
		}
	}

}
