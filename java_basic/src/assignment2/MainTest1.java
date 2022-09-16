package assignment2;

public class MainTest1 {

	public static void main(String[] args) {
		
		Bus bus1 = new Bus("고속버스1");
		Bus bus2 = new Bus("고속버스2");
		Car car1 = new Car("승용차");
		Airplane airplane1 = new Airplane("비행기1");
		Airplane airplane2 = new Airplane("비행기2"); 
		
		bus1.showInfo();
		bus1.getOff(bus1);
		airplane1.getOff(airplane1);// 스타처럼 대상이 있을 경우를 생각해서 이렇게 적음

	}

}
