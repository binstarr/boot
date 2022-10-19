package io_ex.ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 
 * @author bin
 * 바이트 단위 출력 스트림 -2
 * A - Z 한꺼번에 파일에 쓰기
 */

public class MainTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output_b.txt");
		
		// 오토 클로즈 동작 
		try(fos){
			byte[] bs = new byte[26];
			byte data = 65;
			
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs); // 배열을 한꺼번에 출력 하기
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
