package Starcraft3;

public class Marine extends Unit{
	
	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	@Override
	public void attack(Marine marine) {
		if(this == marine) {
			System.out.println("자기 자신을 공격할 수 없습니다.");
		}else {
			super.attack(marine);
		}
	}
	
}
	
	
	
	
