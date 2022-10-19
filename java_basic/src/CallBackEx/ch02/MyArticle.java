package CallBackEx.ch02;

// 호출자(콜리)로 만들어 보자 . 이것을 하려면 주소값을 알고 있어야 한다. 편지를 전달할 객체...
public class MyArticle {

	String article;
	OnWriteArticle onWriteArticle;
	
	public MyArticle(String article) {
		this.article = article;
	}

	public void setOnWriteArticle(OnWriteArticle onWriteArticle) {
		this.onWriteArticle = onWriteArticle;
	}


	public void complete() {
		onWriteArticle.printNews(article);
	}
	
}
