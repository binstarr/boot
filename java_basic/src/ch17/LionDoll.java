package ch17;

public class LionDoll extends Prize{

	
	public LionDoll() {
		this.name = "사자 인형";
		this.count = 2;
	}
	@Override
	void getPrize() {if(count <= 0) {
		System.out.println("재고가 없어서 뽑을 수 없습니다.");
	}
		this.count -= 1;
		System.out.println("축하합니다. "+name + "을 뽑았습니다.");
		System.out.println("남은 개수 : " + count);
	}
	
	@Override
	void failGetPrize() {
		System.out.println("다시 도전 해주세요. "+name + "을 뽑지 못했습니다.");
		System.out.println("남은 개수 : " + count);
	}
	
	@Override
	void showInfo() {
		System.out.println("상품 " + name + "의 개수 : ");
		
	}
	
}
