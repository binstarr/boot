package ch02;

import java.util.Scanner;

public class MainTest1 {
	public static void main(String[] args) {
		MyComponents components = new MyComponents();
		//
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자 이름을 입력해주세요");
		String userInput = scanner.nextLine();
		
		System.out.println("userInput : " + userInput);
//		components.textField.setText(userInput);
		components.inputScannerData(userInput);
		
	}
}