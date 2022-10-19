package io_ex.ch04;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class HangMan {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 5;
		String[] call;
		
		try(FileReader fr = new FileReader("hangman.txt")) {
			try(FileWriter fw = new FileWriter("hangman.txt")) {
				String[] quiz = new String[3];
				int i;
				while((i = fr.read()) != -1) { // 읽을게 없으면 -1이 나오기때문
						System.out.print((char)i);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			System.out.println();

			System.out.println("기회가" + count + " 번 남았습니다. 대문자 알파벳 한개를 입력해주세요. ");
			String selectedAlpha = sc.next();

//				for(int j = 0; j< quiz.length; j++) {
					if(selectedAlpha.equals(null)) {
						System.out.println("dd");
					}else {
						System.out.println("sss");
					}
//				}=
//				if() {
//					System.out.println("기회가" + count + " 번 남았습니다. 다음  대문자 알파벳 한개를 입력해주세요. ");
//					
//				}else {
//					count--;
//					System.out.println("틀렸습니다.");
//				}
			
			
			if(count == 0) {
			}
		} catch (Exception e) {
		}

		
		
		
		

	}
}

