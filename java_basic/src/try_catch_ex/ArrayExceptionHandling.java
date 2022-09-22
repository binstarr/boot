package try_catch_ex;

import java.util.Iterator;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		System.out.println("비정상 종료가 되지 않았습니다.");

	}

}
