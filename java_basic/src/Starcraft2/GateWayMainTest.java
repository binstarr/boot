package Starcraft2;

import java.util.Scanner;

public class GateWayMainTest {

	public static void main(String[] args) {
		
		final int ZEALOT = 1;
		final int DRAGOON = 2;
		final int DARKTEMPLER = 3;

		GateWay gateWay1 = new GateWay();
		GateWay gateWay2 = new GateWay();
		
//		Zealot zealot1 = gateWay1.createZealot();
//		Zealot zealot2 = gateWay1.createZealot();
//		Zealot zealot3 = gateWay2.createZealot();
//		Zealot zealot4 = gateWay2.createZealot();
//		Zealot zealot5 = gateWay1.createZealot();
//		System.out.println(GateWay.zealotTotalCount);
//		
//		 // 질럿이 총 몇마리 생성 되었는가를 데이터로 저장해서 관리하고 싶다면
//		zealot1.attack(zealot2);
//		System.out.println("==============");
		
//		Dragoon dragoon1 = gateWay1.createDragoon();
//		Dragoon dragoon2 = gateWay2.createDragoon();
//		Dragoon dragoon3= gateWay1.createDragoon();
//		DarkTempler darkTempler1 = gateWay1.createDarkTempler();
//		DarkTempler darkTempler2 = gateWay2.createDarkTempler();
//		DarkTempler darkTempler3 = gateWay1.createDarkTempler();
//		System.out.println(
//				"드라군 : "+GateWay.dragoonTotalCount +
//				"\t다크 : " + GateWay.darkTemplerTotalCount);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 유닛을 누르세요");
		System.out.println("1.질럿\t2.드라군\t3.다크템플러");
		int choice = sc.nextInt();
		int count;
		if(choice == ZEALOT) {
			System.out.println("몇마리 생산할까요?");
			count = sc.nextInt();
			for(int i = 1; i <= count; i++) {
				System.out.println(i + "마리 생산했습니다.");
			}
		}else if(choice == DRAGOON) {
			
		}else if(choice == DARKTEMPLER) {
			
		}else {
			System.out.println("잘못 눌렀습니다.");
		}
		
	}

}
