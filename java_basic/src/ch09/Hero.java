package ch09;

public class Hero {
	
	private String name;
	private int hp;
	private int power;
	private double defense;
	private int level;
	
	// getter, setter 메서드를 만들어주세요
	// 단 setter 메서드에 방어적 코드를 넣어주세요
	// setName 메서드 만들 때 2 글자 이상 입력하게 만드시오
	// setLevel 방어적 코드 0 보다 작은 수 입력을 막아주세요 
	// .length()
	
	//getter
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public double getDefense() {
		return this.defense;
	}
	public int getLevel() {
		return this.level;
	}
	
	// setter
	public void setName(String name) {
		if(name.length() <= 2) {
			System.out.println("3글자 이상 입력해주세요.");
		}else {
			this.name = name;
			System.out.println("이름 : " + name);
		}
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void setDefense(double defense) {
		this.defense = defense;
	}
	public void setLevel(int level) {
		if(level <= 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.level = level;
			System.out.println("레벨 : " + level);
		}
	}



}
