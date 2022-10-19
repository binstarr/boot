package ch20;

public class StringTest2 {

	public static void main(String[] args) {

		// 상수풀에 한번 생성된 String은 불변! (immutable)
		// 상수풀이라는 곳에 abc가 있으면 (한번 만들어진 것이 있으면)
		// 따로 더 만들지 않는다. (new와는 다른 개념임)

		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);

		System.out.println(System.identityHashCode(str1));
		// "abcd"
		str1 = str1 + "d";
		System.out.println(System.identityHashCode(str1));
	}
}
