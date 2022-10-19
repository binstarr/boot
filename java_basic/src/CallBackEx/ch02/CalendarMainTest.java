package CallBackEx.ch02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainTest {

	public static void main(String[] args) {
		// Calendar란 날짜 관련 클래스 입니다. 달력이나 시간계산등을 사용할 때 많이 사용하는 클래스
		Calendar calendar = Calendar.getInstance(); 
		// Calender 호출할 때 마다 매번 생성되는게 아니라 JVM에서 미리 프로그램에서 사용할 객체들을 띄어둔다
		System.out.println(calendar.getTimeInMillis());
		
		// 보기 불편하기 때문에 형식을 개발자마다 지정해서 사용할 수 있도록 만들어 놓았다.
		DateFormat dateFormat = new SimpleDateFormat();
		// 현재 시간을 내가 정한 format 형식으로 변환
		String date = dateFormat.format(calendar.getTimeInMillis());
		System.out.println(date);
		
	}

}
