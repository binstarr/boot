package ch07.constructor;

public class Order {

	int orderNumber;
	String orderPhonNumber;
	String orderAddress;
	int orderDate;
	int orderTime;
	int orderPrice;
	int orderMenuNumber;
	
	public Order(int orderNumber, String orderPhonNumber, String orderAddress, int orderDate, int orderTime, int orderPrice, int orderMenuNumber) {
	
		this.orderNumber = orderNumber;
		this.orderPhonNumber = orderPhonNumber;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.orderMenuNumber = orderMenuNumber;
	}
	
	
}
