package wrapper_ex;

public class MainTest9 {

	public static void main(String[] args) {
		
		Fruit fruit = Fruit.APPLE;
		
		switch(fruit) {
		case APPLE :
			System.out.println("사과입니다.");
			break;
		case BANANA :
			System.out.println("바나나입니다.");
			break;
		case GRAPE :
			System.out.println("포도입니다.");
			break;
		default :
			System.out.println("잘못된 과일입니다.");
		}

	}

}
