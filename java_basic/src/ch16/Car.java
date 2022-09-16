package ch16;

public abstract class Car {

	// 내부 클래스
	void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public abstract void wiper();
	
	public abstract void drive();
	
	public abstract void stop();
	
	// 후크 메서드: 빈 메서드이지만 필요하다면 알아서 재정의해서 사용 가능하다.
	public void washCar() {
		
	}
	
	void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// final - 상수 (변수 앞에)
	// final - 메서드 (메서드 앞에)
	// 사용하는 이유 : 하위 클래스에서 재정의할 수 없다.
	final void run() {
		startCar(); // 메서드 안에 메서드를 정의할 수는 없지만 호출은 가능하다.
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}
