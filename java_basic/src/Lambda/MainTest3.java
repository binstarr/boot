package Lambda;

public class MainTest3 {

	public static void main(String[] args) {
		
		// 1. 람다식 만들기
		IMaxNumber maxNumber  = (x, y) -> {return (x > y) ? x : y;};
		System.out.println(maxNumber.bigNumber(8, 7));
		
		// 결론 - 자바에서 람다 표현식이란 ?
		// 함수형 인터페이스를 제공하여 람다 표현식으로 생성 후에 사용할 수 있다.
		// 반복적인 코드를 줄여서 간소화와 순수 함수 사이드 이펙트 영향을 줄이는데 목적이 있다.
		// 단 가독성은 떨어진다.

	}

}
