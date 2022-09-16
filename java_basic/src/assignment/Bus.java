package assignment;

public class Bus {
	
	private int busMoney;
	private int busEarn;
	private int busNumber;
	private int passengerCount;
	
	public Bus(int busNumber) {
		this.busMoney = 1_000;
		this.busNumber = busNumber;
		this.passengerCount = 20;
		this.busEarn = 20_000;
	}
	
	public int getBusMoney() {
		return busMoney;
	}
	
	public int getBusNumber() {
		return busNumber;
	}
	
	public int getPassengerCount() {
		return passengerCount;
	}
	
	public int getBusEarn() {
		return busEarn;
	}
	
	public void takeBus(int totalTake) {
		for(int i = 1; i < totalTake; i++) {
			busEarn += busMoney;
			passengerCount++;
		}
		if(passengerCount <= 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			System.out.println("**승객" + passengerCount + "명이 탑승중입니다.**");System.out.println();
		}
	}
	
	public void takeOffBus() {
		System.out.println("모든 승객이 내렸습니다.");
		System.out.println(busNumber + "번의 버스 하루 수익금이 " + busEarn + "원 입니다.");
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 요금은 : " + busMoney + "원이고, 현재 " + passengerCount + "명이 탑승중입니다.");
	}
	
	
	
}
