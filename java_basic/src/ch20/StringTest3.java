package ch20;

public class StringTest3 {

	public static void main(String[] args) {

//		 StringBuilder , StringBuffer
//		 내부적으로 가변적인 char[]... 멤버 변수로 가진다.
//		 문자열을 여러번 연결하거나 변경할 때 사용하면 유용하다.
//		 StringBuffer은 멀티 스레드 프로그래밍에서 동기화를 보장한다.
//		 단일 스레드 프로그램에서는 StringBuilder를 권장한다.

		String java = new String("java");
		String android = new String("android");

		System.out.println(java + android);

		StringBuilder builder = new StringBuilder(java);
		System.out.println(System.identityHashCode(builder));
		// 2104457164

		builder.append(android);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		// 2104457164
		System.out.println(builder);

		String result = builder.toString();
		System.out.println("result : " + result);

		StringBuffer buffer = new StringBuffer("abc");
		System.out.println(System.identityHashCode(buffer));
		buffer.append("d");
		buffer.append("e");
		buffer.append("f");
		System.out.println(System.identityHashCode(buffer));

	}

}
