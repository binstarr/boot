package ch16;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 정지 합니다.");
	}
	
	@Override
	public void wiper() {
		System.out.println("사람이 와이퍼를 작동합니다.");
	}
	
//	@Override		
//	public void run() {
//		System.out.println("일반 자동차를 운행합니다.");
//	}

	
}
