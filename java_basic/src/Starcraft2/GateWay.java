package Starcraft2;

public class GateWay {
	
	static int zealotTotalCount;
	static int dragoonTotalCount;
	static int darkTemplerTotalCount;
	
	private String name;
	
	public GateWay() {
		this.name = "게이트웨이";
		zealotTotalCount = 0;
	}
	
	// 질럿 생산하기
	public Zealot createZealot() {
		System.out.println("질럿을 생산합니다.");
		for(int i = 0; i < 10; i++) {
			System.out.print("-");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		zealotTotalCount++;
		return new Zealot("질럿" + zealotTotalCount);
	}
	
	public Dragoon createDragoon() {
		System.out.println("드라군을 생산합니다.");
		for(int i = 0; i < 10; i++) {
			System.out.print("-");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		dragoonTotalCount++;
		return new Dragoon("드라군 " + dragoonTotalCount);
	}
	
	public DarkTempler createDarkTempler() {
		System.out.println("다크템플러를 생산합니다.");
		for(int i = 0; i < 10; i++) {
			System.out.print("-");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		darkTemplerTotalCount++;
		return new DarkTempler("다크템플러 " + darkTemplerTotalCount);
	}

}
