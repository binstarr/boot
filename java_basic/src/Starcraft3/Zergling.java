package Starcraft3;

public class Zergling extends Unit{
	
	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 50;
	}
	
	@Override
	public void attack(Zergling zergling) {
		if(this == zergling) {
			System.out.println("자기 자신을 공격할 수 없습니다.");
		}else {
			super.attack(zergling);
		}
	}
	
}
