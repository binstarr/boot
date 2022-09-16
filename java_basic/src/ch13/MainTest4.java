package ch13;

public class MainTest4 {

	public static void main(String[] args) {
		
		Engin engin6 = new Engin("6기통", 1_500);
		Car car = new Car("BMW5", 6_000, engin6);
		
		
		System.out.println(car.engin.name);
//		car.name = "벤츠";
//		car.price = 7200;
//		
//		car.engin = engin6;
//		car.engin.name = "6기통 GDI";
//		car.engin.price = 1_000;
//		
//		System.out.println(car.name);

	}

}
