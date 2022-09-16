package ch08;

import java.util.Scanner;

public class Maintest3 {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior(1);
		Warrior warrior2 = new Warrior(1);
		Warrior warrior3 = new Warrior(3);
		
		Wizard wizard3 = new Wizard("흑마법사");
		
		warrior1.attack();
		warrior1.warriorStatus();
		
		warrior1.attack();
		warrior1.warriorStatus();
		
		warrior1.attaked();
		warrior1.warriorStatus();
		
		warrior1.attaked();
		warrior1.warriorStatus();
		
		warrior2.warriorStatus();
		
		Scanner sc = new Scanner(System.in);
		int select;
		do {
			System.out.println("전사는 1번, 마법사는 2번을 눌러주세요.");
			select = sc.nextInt();
			if(select == 1) {
				System.out.println("전사가 나타납니다." );
				warrior3.warriorStatus();
				break;
			}else if(select == 2) {
				System.out.println("마법사가 나타납니다.");
				wizard3.showInfo();
				break;
			}else {
				System.out.println("잘못된선택입니다.");
				continue;
			}
		}while(select != 9);
		System.out.println("종료");
	}

}
