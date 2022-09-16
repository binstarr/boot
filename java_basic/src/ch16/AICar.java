package ch16;

//추상 클래스라서 오류가 뜨는데 클래스 이름에 마우스를 대고 add unimplemented method 선택
public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
	
	@Override
	public void wiper() {
		System.out.println("자동으로 와이퍼를 작동합니다.");
	}
	
	@Override
	public void washCar() {
		System.out.println("알아서 세차를 합니다.");
		}
	
//	@Override
//	public void run() { // final 선언해서 사용 불가능
//		System.out.println("AI자동차가 운행합니다."); 
//	}
	
}
