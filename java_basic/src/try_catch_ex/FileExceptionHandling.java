package try_catch_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.close();
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("temp");
			System.out.println("ok");
			return;
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("오류가 납니다.");
		}finally {
			// 심지어 return 키워드를 만나더라도 수행이 된다.
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("항상 수행이 됩니다.");
		}
		
		System.out.println("비정상 종료가 안됨");

	}

}
