package threadex.ch03;

// 서울에서 부산은행으로 입금을 한다.
public class Father extends Thread {

	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {

		account.saveMoney(10_000);

	}

}
