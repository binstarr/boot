package ch17;

import java.util.Random;
import java.util.Scanner;

// 사자 인형, 곰 인형, 권총, 에어팟
public class ToyMachine {

	int leftCount;
	int payment;
	int moneyInput;
	
	public ToyMachine() {
		this.leftCount = leftCount;
		this.payment = 1_000;
		this.moneyInput = moneyInput;
	}
	
	public void useToyMachine() {
		if(moneyInput == payment) {
			leftCount++;
			System.out.println("기회 " + leftCount + "번 남았습니다.");
			System.out.println("시~~작");
		}else if(moneyInput != payment) {
			System.out.println("금액이 맞지 않습니다. 처음부터 다시 시작해 주세요");
			
		}
	 
	}
	
	public void game() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 원하시는 숫자 (1~8)과 엔터를 눌러주세요");
		int keyNumber = random.nextInt(8) + 1;
		int userNumber = scanner.nextInt();
		
		
		if(keyNumber == userNumber) {
			System.out.println("당첨 입니다.");
			System.out.println("원하는 상품 번호를 눌러주세요.");
		}else {
			System.out.println("꽝 입니다.");
			System.out.println("당첨 번호는 " + keyNumber);
		}
	}
	
	public void showInfo() {
		System.out.println("1. 사자 인형\t2.곰 인형\t3.에어팟\t4.장난감 총");
		System.out.println("1회 사용 요금은 " + payment + "입니다.");
		System.out.println("남은 기회는 " + leftCount + "번 입니다.");
	}
	
}
// 객체 지향 패터다임으로 코드를 설계하고
// 동작을 구현시킬 수 있는 코딩능력을 테스트 !