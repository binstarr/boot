package io_ex.ch04;

import java.io.FileReader;

/**
 * 
 * @author bin Reader - 문자 단위 입력 스트림
 */

public class MainTest1 {

	public static void main(String[] args) {

		// 1 byte씩 inputStream
		// 2 바이트씩 - 영어, 한글, 중국어, 일본어 (형 변환 해줘야함)
		try (FileReader fr = new FileReader("reader_1.txt")) {
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {

		}

	}

}
