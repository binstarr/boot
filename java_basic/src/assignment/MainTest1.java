package assignment;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student student1 = new Student("강성빈");
		Bus bus1 = new Bus(100);
		Subway subway1 = new Subway(2);

		final int SUBWAY = 1;
		final int BUS = 2;

		student1.showInfo();
		System.out.println("무엇을 타시겠습니까?");
		subway1.showInfo();
		bus1.showInfo();
		System.out.println("\t1.지하철\t2.버스");

		int ride = sc.nextInt();

		if (ride == SUBWAY) {
			student1.getSubway(subway1);
			System.out.print("탑승중");
			for (int i = 0; i < 8; i++) {
				System.out.print("...");
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			subway1.takePassenger(10);
			student1.showInfo();

			for (int i = 0; i < 8; i++) {
				System.out.print("...");
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("운행종료");
			subway1.takeOffSubway();

		} else if (ride == BUS) {
			student1.getBus(bus1);
			System.out.println("탑승중");
			for (int i = 0; i < 4; i++) {
				System.out.print("...");
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			bus1.takeBus(15);
			student1.showInfo();

			for (int i = 0; i < 8; i++) {
				System.out.print("...");
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			System.out.println("운행종료");
			bus1.takeOffBus();

		} else {
			System.out.println("잘못된 입력입니다.");
		}

	}

}
