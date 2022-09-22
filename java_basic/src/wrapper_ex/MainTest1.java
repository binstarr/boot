package wrapper_ex;

public class MainTest1 {

	public static void main(String[] args) {
		
		Integer num = new Integer(3); // 박싱
		// Number number =3;
		
//		int n = num.intValue(); 같은 의미 
		int n = num;// 언박싱
		
		System.out.println(n);

	}

}
