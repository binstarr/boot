package ch11;

public class AirplaneMainTest {

	// 코드의 시작점(메인 함수)
	public static void main(String[] args) {
		
		Airplane airplane1 = Airplane.getInstance();
		Airplane airplane2 = Airplane.getInstance();
		Airplane airplane3 = Airplane.getInstance();
				
		System.out.println(airplane1);
		System.out.println(airplane2);
		System.out.println(airplane3);
		
		airplane1.airportNum = 100;
		System.out.println(airplane2.airportNum);
		
		

	}

}
