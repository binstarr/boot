package interfaces2;

public class ToyRobot extends HomeAppliances implements RemoteController, SoundImpact{

	String name;
	public ToyRobot() {
		this.name = "마징가Z";
	}
	
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");
	}

	@Override
	public void touchButton() {
		System.out.println("뚜뚜뚜뚜~~");
		
	}
	
}
