package Starcraft;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;

		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");

		Scanner scanner = new Scanner(System.in);

		// 1. 유닛 선택.
		System.out.println("유닛을 선택하세요.");
		System.out.println("1. 질럿\t2.마린\t3.저글링");

		int unitChoice = scanner.nextInt();
		if (unitChoice == ZEALOT) {
			// 질럿 선택됨
			zealot1.showInfo();
			System.out.println("어떤 유닛을 공격 하시겠습니까?");
			System.out.println("2.마린\t3.저글링");
			int attackChoice = scanner.nextInt();

			if (attackChoice == MARINE) {
				zealot1.attackMarine(marine1);

				for (int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				marine1.showInfo();

			} else if (attackChoice == ZERGLING) {
				zealot1.attackZergling(zergling1);

				for (int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				zergling1.showInfo();

			} else {
				System.out.println("잘못 입력했습니다.");
			}

		} else if (unitChoice == MARINE) {
			// 마린 선택됨
			marine1.showInfo();
			System.out.println("어떤 유닛을 공격하시겠습니까?");
			System.out.println("1. 질럿\t3.저글링");
			int attackChoice = scanner.nextInt();
			if (attackChoice == ZEALOT) {
				marine1.attackZealot(zealot1);
				zealot1.beAttacked(marine1.getPower());

				for (int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				zealot1.showInfo();

			} else if (attackChoice == ZERGLING) {
				marine1.attackZergling(zergling1);
				zergling1.beAttacked(marine1.getPower());
				
				for(int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				zergling1.showInfo();

			} else {
				System.out.println("잘못 입력 했습니다.");
			}
			//----------------------------------------------------------

		} else if (unitChoice == ZERGLING) {
			// 저글링 선택됨
			zergling1.showInfo();
			
			System.out.println("어떤 유닛을 공격하시겠습니까?");
			System.out.println("1. 질럿\t2.마린");
			int attackChoice = scanner.nextInt();
			if(attackChoice == ZEALOT) {
				zergling1.attackZealot(zealot1);
				
				for(int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				zealot1.showInfo();
			}else if(attackChoice == MARINE) {
				zergling1.attackMarine(marine1);
				
				for(int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				marine1.showInfo();
				
			}else {
				System.out.println("잘못 입력했습니다.");
			}

		} else {
			System.out.println("잘못 입력 했습니다.");
		}

	}

}
