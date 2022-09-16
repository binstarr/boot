package ch04;

public class IfMainTest3 {

	public static void main(String[] args) {
		
		// 1부터 100 까지 연산에 합을 화면에 출력해 보세요 ~ 단 반복문을 활용해주세요
		// 1 + 2 + 3 ... + 100 =???
		
		//1 +2;
		// 사용자가 입력한 값을 받아서 처리할 수 있도록 코드를 수정해 주세요
		int result = 0;
		int maxNumber = 90;
		for(int i = 1; i <= maxNumber; i++) {
			//연산한 값을 담아 줘야 해!!
			// 기존에 있던 값에 더하기 1해야 식이 완성 된다.
//			System.out.println("result: " + result + ", i: " + i);
			result = result + i;
		}
		
		System.out.println("1부터" + maxNumber + "까지 합은: " + result + "입니다.");
		

	}

}
