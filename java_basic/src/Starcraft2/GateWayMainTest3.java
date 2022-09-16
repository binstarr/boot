package Starcraft2;

public class GateWayMainTest3 {

	public static void main(String[] args) {
		
		// 배열이란
		// 연관된 데이터를 통으로 모아서 관리하기 위해 사용하는 데이터 타입
		// 모든 프로그램에서 인덱스 값에 시작은 0부터 시작한다.
		
		// 배열은 선언과 동시에 자료형에 따라 초기화 된다.
		int[] numbers = new int[3];
		double[] numbers2 = new double[3];
		
		System.out.println(numbers[2]);
		System.out.println(numbers2[2]);
		
		// 오류 확인 : 배열을 사용할 때 인덱스에 크기와 배열에 길이를 잘 확인해야 한다.
		//	System.out.println(numbers[3]);
		
		// 필요에 따라서 배열 선언과 동시에 초기화를 직접할 수 있다. *3번*
		// String != String[] 완전 다른 데이터 타입 입니다.!!
		String[] strArr1 = new String[] {"안", "녕", "하"};
		String strArr2[] = new String[] {"반", "가", "워"};
		System.out.println(strArr1[0]);
		int[] intArr1 = {10, 20, 101}; // 3번의 이유 때문에 new 생략 가능하다.
		System.out.println(intArr1[2]);
		
	
		

	}

}
