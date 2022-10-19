package io_ex.ch01;

import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 여러개 쓰고 엔터");
		//\n; <-- 엔터 
		// 한글자를 입력할 때마다 화면에 표시하세요. 엔터키를 누를때 까지
		// 프로그램을 만들어 주세요
		
			int i;
			try {
				while( (i = System.in.read()) != '\n' ) {
					System.out.print("i : " + i);
					System.out.print("(인코딩) : " + (char)i);
					System.out.println();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
