package io_ex.ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author bin
 * 입력 스트림 - file
 * 문자 단위로 사용 
 * 1.7 버전 이상 오토클로즈 생김
 */

public class MainTest2 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("boot_a.txt")){
				int i;
				while((i = fis.read()) != -1) { // 읽을게 없으면 -1이 나오기때문
					System.out.print((char)i);
				}
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
