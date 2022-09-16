package ch13;

public class VIPCustomer extends Customer {

	private int agentID;
	double salesRatio;
	
	public VIPCustomer() {
		super.customerGrade = "VIP";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}


}
