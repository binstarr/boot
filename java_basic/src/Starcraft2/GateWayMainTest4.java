package Starcraft2;

public class GateWayMainTest4 {

	public static void main(String[] args) {

		// 배열은 : 연관된 데이터 타입을 하나에 변수에 통으로 관리 하기위한 데이터 타입 입니다.
		// 배열은 보통 반복문과 함께 많이 사용 됩니다.
//		int[] intArr = new int[3];
//
//		Zealot[] zealots = new Zealot[30];
//		System.out.println(zealots.length);
//		for (int i = 0; i < zealots.length; i++) {
//			zealots[i] = new Zealot("질럿" + (i + 1 ));
//		}
//
////		zealots[0] = new Zealot("질럿1");
////		zealots[1] = new Zealot("질럿2");
////		zealots[2] = new Zealot("질럿3");
//		
//		for(int i = 0; i < zealots.length; i++) {
//			System.out.println(zealots[i].getName());
//			System.out.println(zealots[i].getHp());
//			System.out.println(zealots[i].getPower());
//			System.out.println("---------------");
//		}
//		
//		//질럿 17번째 이름을 화면에 출력해주세요
//		System.out.println(zealots[17].getName());
//		System.out.println(zealots[17].getHp());
//		System.out.println(zealots[17].getPower());
//		System.out.println("---------------");
//	}
		GateWay gateWay1 =  new GateWay();
		// 5번 질럿 생성하기
		Zealot[] zealotArr = new Zealot[5];
		
		// i = 1;
		// i = 2;
		// i = 3;
		// i = 4;
		for(int i = 0; i < zealotArr.length; i++) {
			zealotArr[i] = gateWay1.createZealot();
		}
		System.out.println(zealotArr[0].getName());
		
	}
}
