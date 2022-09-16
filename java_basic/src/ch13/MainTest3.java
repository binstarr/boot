package ch13;

public class MainTest3 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(100);
		//구매 발생
		customerLee.calcPrice(10_000);
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer vipCustomerKim = new VIPCustomer();
		vipCustomerKim.setCustomerName("김유신");
		vipCustomerKim.setCustomerID(200);
		// 구매 발생
		vipCustomerKim.calcPrice(10_000);
		System.out.println(vipCustomerKim.showCustomerInfo());
		
	}
}
