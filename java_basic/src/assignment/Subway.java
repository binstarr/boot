package assignment;

public class Subway {

	private int subwayMoney;
	private int subwayEarn;
	private int subwayNumber;
	private int passengerCount;
	
	public Subway(int subwayNumber) {
		this.subwayMoney = 2000;
		this.subwayNumber = subwayNumber;
		this.passengerCount = 100;
		this.subwayEarn = 200_000;
	}
	
	public int getSubwayMoney() {
		return subwayMoney;
	}
	
	public int getSubwayNumber() {
		return subwayNumber;
	}
	
	public int getPassengerCount() {
		return passengerCount;
	}
	
	public int getSubwayEarn() {
		return subwayEarn;
	}
	
	public void takePassenger(int totalTake) {
		for(int i = 1; i <= totalTake; i++) {
			subwayEarn += subwayMoney;
			passengerCount++;
		}
		if(passengerCount <= 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			System.out.println("**승객" + passengerCount + "명이 탑승중입니다.**");
		}
	}
	
	public void takeOffSubway() {
		System.out.println("모든 승객이 내렸습니다.");
		System.out.println(subwayNumber + "호선의 지하철 하루 수익금이 " + subwayEarn + "원 입니다.");
	}
	
	public void showInfo() {
		System.out.println(subwayNumber + "호선 지하철의 요금은 : " + subwayMoney + "원이고, 현재 " + passengerCount + "명이 탑승중입니다.");
	}
	
}
