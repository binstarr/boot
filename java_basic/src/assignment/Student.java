package assignment;

public class Student {

	// 학생의 이름
	// 학생의 소지금
	// 학생의 
	private String name;
	private int money;
	
	
	public Student(String name) {
		this.name = name;
		this.money = 5_000;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}
	
	// 버스를 탑니다.
	public void getBus(Bus bus) {
		System.out.println("용돈에서 요금" + bus.getBusMoney() + "원을 냅니다.");
		this.money -= bus.getBusMoney();
		
	}
	
	// 지하철을 탑니다.
	public void getSubway(Subway subway) {
		System.out.println("용돈에서 요금" + subway.getSubwayMoney() + "원을 냅니다.");
		this.money -= subway.getSubwayMoney();
	}
	
	// 버스를 내립니다.
		public void getOffBus(Bus bus) {
			
		}
		
		// 지하철을 내립니다.
		public void getOffSubway(Subway subway) {
			
		}
	
	public void showInfo() {
		System.out.println(
				name + "본인의 용돈은 " + money + "원 남았습니다.");
	}
	
}
