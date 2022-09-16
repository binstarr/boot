package ch15;

public class Banana extends Fruit{
	
	String orgin;
	
	public Banana() {
		name = "델몬트 바나나";
		price = 3000;
		fresh = 100;
		orgin = "필리핀";
		
	}
	
	public void saleBanana() {
		System.out.println("바나나 가격을 할인합니다.");
		price -= 1000;
	}
	
}
