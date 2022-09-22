package wrapper_ex;

public class MainTest6 {

	public static void main(String[] args) {
		int month = 12;
		int lastDay;
		
		switch (month) {
		case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay = 31;
			break;
		case 2 : 
			lastDay = 28;
			break;
		case 4: case 6: case 9: case 11 :
			lastDay = 30;
			break;
		default:
			lastDay = 0;
			System.out.println("존재하지 않는 달 입니다.");
		}
		
		System.out.println(month + "월에 마지막 일자는 " + lastDay + " 입니다.");

	}

}
