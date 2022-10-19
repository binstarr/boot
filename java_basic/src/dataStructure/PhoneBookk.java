package dataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookk {

	public static void main(String[] args) {
		
		Map map;
		HashMap<String, String> phoneBook = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int selectedNumber;
		
		
		System.out.println("---- 전화번호부 ----");
		System.out.println("원하는 기능을 눌러주세요.");
		System.out.print("1. 저장");
		System.out.print("\t2. 조회");
		System.out.print("\t3. 수정");
		System.out.println("\t4. 삭제");
		selectedNumber = scanner.nextInt();
		
		// 저장
		if(selectedNumber == 1) {
			System.out.println("저장할 번호와 이름을 적어주세요 (ex : 숫자, 이름)");
			String putNumber = scanner.nextLine();
			String putName = scanner.nextLine();
			phoneBook.put(putNumber, putName);
			
		}else if(selectedNumber == 2) {
			
			
		}else if(selectedNumber == 3) {
			
			
		}else if(selectedNumber == 4) {
			
			
		}else {
			System.out.println("잘못된 번호를 입력했습니다. 다시 실행해주세요.");
		}

	}

}
