package ch17;

public abstract class Prize {

	int count; // 개수
	String name; // 상품 이름
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void getPrize();
	
	abstract void failGetPrize();
	
	abstract void showInfo();
	
	
}
