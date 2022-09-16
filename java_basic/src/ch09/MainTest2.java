package ch09;

public class MainTest2 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		String s1 = "반가워";
		String s2 = "반가워";
		String s3 = new String("반가워");
		
		// String 클래스는 참조 타입? 0 (클래스)
		String temp = new String("반가워");
		// 문자열
		// 특별하게 편하게 사용하라고 "반가워"
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		// 문자열에 길이를 반환하는 기능입니다.
		int count = "반가워".length();
		System.out.println("count : " + count);
		System.out.println("반가워".length());

		if (s2.equals(s3)) {
			System.out.println("같은 문자열입니다.");
		} else {
			System.out.println("다른 문자열입니다..");
		}
	}

}
