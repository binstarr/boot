package CallBackEx.ch02;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// 응답자로 만들어보자
public class HackerNews {

	OnWriteArticle onWriteArticle = new OnWriteArticle() {
		
		@Override
		public void printNews(String article) {
			System.out.println("****** HackerNews ******");
			System.out.println();
			System.out.println(article);
			System.out.println();
			System.out.println("기사 작성일 : " + nowDate());
			
		}
	};

	private String nowDate() {
		// 1. Calendar -> Long타입
		// 2. Date
		// 날짜 형식을 원하는대로 변경해 보세요 !!
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		return dateFormat.format(Calendar.getInstance().getTimeInMillis());
	}

}
