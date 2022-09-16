package ch13;

public class MainTest5 {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer() ;
//		customer1. : 보너스 포인트 보임, 보너스비율 보임, customerGrade 보임
		
		
		Customer customer2 = new VIPCustomer(); // 업 캐스팅 되어 있는 상태
		// 컴파일 시점에서 메모리에 올라간 상태가 아니라서  지금 상태에서는 부모 상태라고 본다 (업캐스팅된 상태)
		// 이럴 경우 데이터 타입을 봐야한다. (데이터 타입 = Customer이다, VIPCustomer로 바꿔주자)
		// customer2.salesRatio = 10; // 다운 캐스팅해서 접근해야 한다.
		((VIPCustomer)customer2).salesRatio = 10;
		double b = 10.0;
		int a = (int)b;
		
//		customer2. : 보너스 포인트 보임, 보너스비율 보임,  customerGrade 보임

		VIPCustomer vipCustomer1 = new VIPCustomer();
//		vipCustomer1. : 보너스 포인트 보임, 보너스비율 보임,  customerGrade 보임, salesRatio
		
		
	}

}
