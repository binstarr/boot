package ch08;

public class Bus {
	
	// 버스번호
	// 승객 수
	// 수익금
	int busNumber;
	private int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 태우다
	public void take(int money) {
		this.passengerCount++;
		this.money += money;
	}
	
	//내리다
	public void takeOff(int count) {
		if(passengerCount < count) {
			System.out.println("잘못된 요청입니다.");
		}else {
		this.passengerCount -= count;
		System.out.println("-------------");
		System.out.println("승객이 내립니다");
		}
	}
	
	public void showInfo() {
		System.out.println("===상태창===");
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("승객 수 : " + passengerCount);
		System.out.println("버스 요금 : " + money);
	}

}
