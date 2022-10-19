package io_ex.ch06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {
		
		String text = "test.text";
		String fileName = "result.txt";
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			// 느리고 불편해서 보조 스트림을 추가해줘야 한다. (기능의 확장)
			bufferedWriter = new BufferedWriter(fileWriter);
			
			//파일에 문자 쓰기
			bufferedWriter.write(text);
			bufferedWriter.flush(); // 버퍼드writer 사용시 flush() 권장
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// 자원을 닫을 때는 생성의 반대 순서로 해야함.
				bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
