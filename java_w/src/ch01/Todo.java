package ch01;

public class Todo {
	int userId;
	int id;
	String title;
	String body;
	boolean completed;
	@Override
	public String toString() {
		return "Todo [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + ", completed="
				+ completed + "]";
	}
	

}
