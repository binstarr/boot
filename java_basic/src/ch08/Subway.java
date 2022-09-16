package ch08;

public class Subway {
	
	// 노선 번호
	// 승객 수
	// 수익금
	int subwayNumber;
	int passengerCount;
	int money;
	
	//생성자
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	// showInfo()
			public void showInfo() {
				System.out.println("===상태창===");
				System.out.println("노선 : " + subwayNumber + "호선");
				System.out.println("승객 수 : " + passengerCount);
				System.out.println("지하철 요금 : " + money);
			}
	
	// 타다
	public void take(int count, int money) {
			this.passengerCount += count;
			this.money += money;
			System.out.println();
			System.out.println("승객이 탑승했습니다.");
			
	}
	
	// 내리다
	public void takeOff(int count) {
		if(passengerCount < count) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.passengerCount--;
			System.out.println();
			System.out.println("-----------");
			System.out.println("승객이 내립니다.");
			
		}
		
	}

}
