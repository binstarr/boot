package assignment2;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("데스크탑 모니터 디스플레이");
	}
	@Override
	public void typing() {
		System.out.println("데스크탑을 타이핑 합니다.");
	}
}
