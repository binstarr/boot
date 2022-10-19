package io_ex.ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author bin 바이트 단위 출력 파일에 한 바이트씩 쓰기 -1
 */

public class MainTest1 {

	public static void main(String[] args) {
		// 함수안에 사용하는 변수는 - 지역 변수 초기화 값을 넣어주는게 좋다 (습관)
		FileOutputStream fos = null; // <-- 멤버 변수가 아닌 지역 변수라서 꼭 초기화를 해줘야한다. 멤버 변수는 FileOutputStream fos; 이렇게 해도 초기화 됨

		try {
			// 만약 파일 없다면 자동으로 파일을 만들어 준다.
			fos = new FileOutputStream("output_a.txt");
			fos.write(65);
			fos.write(66);
			fos.write('c');
			fos.write('D');
			fos.write('e');

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
