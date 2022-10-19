package io_ex.ch04;

import java.io.FileWriter;

/**
 * 
 * @author bin
 * 문자 단위 출력 스트림
 * 파일에다가 문자 쓰기
 */
public class MainTest2 {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer_1.txt", true)){ // << true 값을 주면 덮어서 계속 쓴다
			char buf[] = {'반', '가', '워'};
			fw.write(buf);
		}catch (Exception e) {
		}
	}
	
}
