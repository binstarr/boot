package io_ex.ch06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author bin
 * Reader 사용
 * 문자 단위 입력 스트림
 * 파일에서 라인 단위로 문자 읽기
 */
public class MainTest1 {

	public static void main(String[] args) {
		
		int count = 0;
		try {
			File file = new File("mytext_1.txt");
			FileReader reader = new FileReader(file); // 기반 스트림 + 보조 스트림 (한 줄씩 읽게 만들기)	
			// buffered는 바구니와 같다. 하나 하나 옮기는 것과 바구니로 옮기는 것 <<이런 느낌?
			BufferedReader bufferedReader = new BufferedReader(reader); 
			// 보조 스트림 생성시 매개변수로 기반 스트림을 넣고 있다.
			String line;
//			while((line = bufferedReader.readLine()) != null ) {
//				System.out.println(line);
//				count++;
//			}
			int i = 0;
			while((i = reader.read()) != -1 ) {
				System.out.println((char)i);
				count++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("반복 횟수 : " + count);
		

	}

}
