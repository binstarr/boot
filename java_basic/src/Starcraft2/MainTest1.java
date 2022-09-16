package Starcraft2;

import java.util.Random;

public class MainTest1 {

	public static void main(String[] args) {
		
		final int ZEALOT = 1;  // 가독성을 위한 상수 선언
		final int MARINE = 2;
		final int ZERGLING = 3;
		
		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
		Random random = new Random();
		int number = random.nextInt(3) + 1; // 3은 0,1,2가 나오기 때문에 뒤에 +1을 넣어준다.
		
		if(ZEALOT == number) {
			zealot1.attack(marine1);
			zealot1.attack(zergling1);
		}else if(MARINE == number) {
			marine1.attack(zealot1);
			marine1.attack(zergling1);
		}else {
			zergling1.attack(marine1);
			zergling1.attack(zealot1);
		}
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
		
		System.out.println("--------------------");
		// 강제 공격
		zealot1.attack(zealot1);
		
		// 자기 자신을 공격하는 명령을 했다면 동작 하지 않게 코드를 수정해 주세요.

	}

}
