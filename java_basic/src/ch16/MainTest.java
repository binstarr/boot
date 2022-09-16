package ch16;

public class MainTest {

	// 코드의 시작점(메인 쓰레드)
	public static void main(String[] args) {
		
		Car aiCar = new AICar(); // 업캐스팅, 다형성
		aiCar.run(); 

		System.out.println("====================");
		
		Car manualCar = new ManualCar();
		manualCar.run();
		// 이렇게 실행의 흐름을 만드는게 템플릿 메서드 (final method) 패턴이다
		
		System.out.println(Define.MAX);
		System.out.println(Define.APPNAME);
		
	}// end of main

}
