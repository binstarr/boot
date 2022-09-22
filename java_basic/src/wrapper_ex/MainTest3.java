package wrapper_ex;

public class MainTest3 {

	public static void main(String[] args) {
		String str1 = "10";
		String str2 = "20.5";
		String str3 = "true";
		
		// 1. 문자열 10을 int형으로 변경을 해야한다.
		try {
			int i = Integer.parseInt(str1);			
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("잘못된 요청입니다.");
		}
		
		double d = Double.parseDouble(str2);
		System.out.println("D : " + (d + 1.5));
		
		boolean b = Boolean.parseBoolean(str3);
		System.out.println(!b);

	}

}
