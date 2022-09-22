package threadex.ch03;

public class SharedResource {

	public static void main(String[] args) {
		
		// 현재 10만원이 들어가 있는 생성
		BankAccount bankAccount = new BankAccount();
		Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount);
		
		// 아버지가 먼저 입금합니다 (10_000)
		father.start();
		// 어머니가 출금 5_000원
		mother.start();
		 // 정상 처리 금액 10 + 1 - 0.5 = 10만5천원
		
		// 레이스 컨디션 상태일때 즉 임계 영역이 발생할 때는
		// 의도치 않은 결과를 생성시킬 수 있다.
		// 그래서 다른 작업자(쓰래드)가 사용하지 못하도록 동기화 처리를 해주어야
		// 안정적인 결과값을 얻을 수 있다.(LOCK)
		
		// 해결방법
		// 자바에서는 동기화 처리 
		// 1. (synchronized) 메서드
		// 2. (synchronized) 블록
		
	}

}
