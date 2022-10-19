package io_ex.ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author bin
 * 입력 스트림
 * 파일에서 한 바이트씩 자료 얻기
 */

public class MainTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		// 한글을 읽으려면 2바이트씩 읽어야 하기 때문에 오류가 난다
		try {
			fis = new FileInputStream("boot_a.txt");
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
			System.out.print((char)fis.read()); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}catch (NullPointerException e2) {
				System.out.println("null 포인터 !! 객체 생성 또는 주소값 확인 했니!!");
			}
		}

	}

}
