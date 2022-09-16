package Starcraft;

public class MainTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");
		
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		marine1.showInfo();
		// 객체와 객체간에 상호 작용하게 한다 <<핵심
		
		zealot1.attackZergling(zergling2);
		zealot1.attackZergling(zergling2);
		zealot1.attackZergling(zergling2);
		zealot1.attackZergling(zergling2);
		zealot1.attackZergling(zergling2);
		zergling1.showInfo();
		zergling2.showInfo();
		
		marine1.attackZealot(zealot1);
		zealot1.showInfo();
		
		zergling1.attackMarine(marine1);
		marine1.showInfo();

	}

}
