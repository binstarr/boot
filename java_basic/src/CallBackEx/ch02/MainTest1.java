package CallBackEx.ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 콜백 메서드를 구현할 때 생성자를 통해서 주입 받는 방법 ,,,1
		// 메서드를 통해서 구현할 때
		
		HackerNews hackerNews = new HackerNews();
		MyArticle article = new MyArticle("오늘 날씨가 덥네요~~!!");
		article.setOnWriteArticle(hackerNews.onWriteArticle);
		article.complete(); // <--- HackerNews에 있는 printArticle 이라는 메서드를 호출하고 싶을 때 !!!


	}

}
