package threadex.ch03;

public class Mother extends Thread {

	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withdrawMoney(5_000);
	}

}
