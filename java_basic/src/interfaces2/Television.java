package interfaces2;

// 자바는 다중 상속을 지원하지 않습니다.
// ex) 네발달린짐승 클래스, 사자, 강아지 (상속3)
// 사람이 extends 상속 3개 받았다.
// 사람 클래스에서 울다.
public class Television extends HomeAppliances implements RemoteController{

	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}
	
}
