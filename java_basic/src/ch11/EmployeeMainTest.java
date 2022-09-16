package ch11;

public class EmployeeMainTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setEmployeeName("이순신");
//		employee1.setEmployeeId(1);


		System.out.println(employee1.getEmployeeName());
		System.out.println(employee1.getEmployeeId());
	
		Employee employee2 = new Employee();
		employee2.setEmployeeName("김유신");
//		employee2.setEmployeeId(2);
		
		System.out.println(employee2.getEmployeeName());
		System.out.println(employee2.getEmployeeId());
		
		Employee employee3 = new Employee();
		employee3.setEmployeeName("야스오");
//		employee2.setEmployeeId(2);
		
		System.out.println(employee3.getEmployeeName());
		System.out.println(employee3.getEmployeeId());
		
		System.out.println(
				employee2.getEmployeeName() + " , " +
				employee2.getEmployeeId());
		
	}

}
