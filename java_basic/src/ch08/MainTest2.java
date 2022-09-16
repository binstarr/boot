package ch08;

public class MainTest2 {

	public static void main(String[] args) {
		
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		
		subway1.take(2, 2600);
		subway1.showInfo();
		
		subway1.takeOff(1);
		subway1.showInfo();
		
		subway1.take(2, 2600);
		subway1.showInfo();

	}

}
