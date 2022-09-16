package Starcraft4;

public abstract class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 메서드 오버로딩 (같은 이름을 선언 하지만 매개변수 개수나 타입에 따라서 구분해서 호출할 수 있다.)
	// 마린을 공격합니다.
//	public void attack(Marine marine) {
//		// 객체와 객체간에 상호 작용하게 한다 <<핵심
//		// private & getter로 값만 가져올 수 있다.
//		System.out.println(this.name + " 이 " + marine.getName() + "을 공격합니다.");
//		// 질럿의 공격력 this.power
//		marine.beAttacked(this.power);
//	}
//
//	// 저글링을 공격합니다. //데이터 타입 선언한 이유: 여러마리 선언할 수도 있어서
//	public void attack(Zergling zergling) {
//		System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
//		zergling.beAttacked(this.power);
//	}
//
//	public void attack(Zealot zealot) {
//		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
//		// 질럿을 공격
//		zealot.beAttacked(this.power);
//	}

	// 공격을 당합니다.
	public void beAttacked(int power) {
		this.hp -= power;
		if (hp <= 0) {
			System.out.println(this.name + "은 사망하였습니다.");
			hp = 0;
		} else {
			System.out.println(this.name + "이 공격을 당합니다.");
		}
	}

	public void showInfo() {
		System.out.println("====정보창====");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("생명력 : " + hp);
	}
}
