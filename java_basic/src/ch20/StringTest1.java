package ch20;

public class StringTest1 {

	public static void main(String[] args) {

		// String 선언 방식
		// heap 메모리 인스턴스로 생성되는 경우
		String str1 = new String("abc"); // heap 메모리에 new
		String str2 = "abc"; // 상수 풀

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
