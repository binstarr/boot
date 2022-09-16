package interfaces2;

// Refrigerator 클래스는 Remote Controller구현
public class Refregerator extends HomeAppliances implements RemoteController, SoundImpact{

	@Override
	public void turnOn() {
		System.out.println("냉장고를 켭니다.");
		
	}

	public void turnOff() {
		System.out.println("냉장고를 끕니다.");
		

	
	}

	@Override
	public void touchButton() {
		System.out.println("띵띵띵");
		
	}
	
	
	
}
