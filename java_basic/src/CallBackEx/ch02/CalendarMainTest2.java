package CallBackEx.ch02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarMainTest2 {

	public static void main(String[] args) {
		// 시간과 날짜를 다룰때
		// 1. Calender, Date 클래스를 이용한다.
		// 2. 내가 원하는 형식으로 변경하고 싶다면 format 클래스를 사용해서 형식을 변경할 수 있다.
		
		Date date = new Date();
		System.out.println("date : " + date);
		
		// 포메터라는 클래스를 사용해서 형식을 지정할 수 있다.
		String patern = "yyyy년 MM월 dd일 HH:mm:ss";
		SimpleDateFormat dateFormat = new SimpleDateFormat(patern);
		
		String nowTime = dateFormat.format(date);
		System.out.println(nowTime);
	}

}
