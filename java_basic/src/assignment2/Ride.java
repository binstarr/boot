package assignment2;

public class Ride {

	protected String name;
	protected String destination;
	protected int takeTime;
	
	public String getName() {
		return name;
	}

	public String getDestination() {
		return destination;
	}

	public int getTakeTime() {
		return takeTime;
	}

	public void getOff(Bus bus) {
		System.out.println(this.name + "을 타고 " + destination + "에서  " + takeTime + "시간에 걸쳐 내립니다");
	}
	
	public void getOff(Car car) {
		System.out.println(this.name + "을 타고 " + destination + "에서  " + takeTime + "시간에 걸쳐 내립니다");
	}
	
	public void getOff(Airplane airplane) {
		System.out.println(this.name + "을 타고 " + destination + "에서  " + takeTime + "시간에 걸쳐 내립니다");
	}
	
	public void showInfo() {
		System.out.println(name + "을 타면 " + destination + "까지  " + takeTime + "시간 걸립니다.");
	}
	
}
