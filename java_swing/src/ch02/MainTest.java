package ch02;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Chat myChat = new Chat();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("채팅 내용을 입력해주세요");
		String userInput = scanner.nextLine();
		
		System.out.println("userInput : " + userInput);
		myChat.inputScannerData(userInput);

	}

}
