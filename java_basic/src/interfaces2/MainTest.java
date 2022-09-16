package interfaces2;

public class MainTest {

	public static void main(String[] args) {
		Television television = new Television();
		Refregerator refregerator = new Refregerator();
		ToyRobot robot = new ToyRobot();
		ToyRobot robot2 = new ToyRobot();

//		television.turnOn();
//		television.turnOff();
//		System.out.println("=======================");
//		refregerator.turnOn();
//		refregerator.turnOff();
//		System.out.println("=======================");
//		robot.turnOn();
//		robot.turnOff();

		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = television;
		remoteControllers[1] = refregerator;
		remoteControllers[2] = robot;
		remoteControllers[3] = robot2;

		// index를 활용한 for
		//
		for (RemoteController a : remoteControllers) {
			a.turnOn();
			a.turnOff();
			System.out.println("======================");
		}

		// 문제1 for - index를 사용해서 전원을 전부 꺼주세요
		for (RemoteController b : remoteControllers) {
			b.turnOff();
		}
		System.out.println("==================");
		// 문제2
		// 배열을 활용해서 toy에 name 값을 화면에 출력하시오
		// 1. for문에 대한 선택(인덱스 연산이 필요 하면 일반 for문을 사용)
		int result = 0;
		for (int i = 0; i < remoteControllers.length; i++) {
			if (remoteControllers[i] instanceof ToyRobot) {
				System.out.println(((ToyRobot) remoteControllers[i]).name);
				result++;
			}
		}
		System.out.println("장난감 로봇은 " + result + "개 있습니다.");

		for (RemoteController remoteController : remoteControllers) {
			if (remoteController instanceof ToyRobot) {
				System.out.println(((ToyRobot) remoteController).name);
				((ToyRobot) remoteController).touchButton();
			}
		}

		// 인터페이스
		// 인터페이스 선언
		// 띠리링 소리가 나는 기능을 추가 해주세요
		// 단 냉장고 띵띵띵 소리나게
		// 장난감 로봇은 뚜뚜뚜뚜 ~~~~~ 소리나게

	}
}
