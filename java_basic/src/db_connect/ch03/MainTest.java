package db_connect.ch03;

import java.sql.SQLException;
import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) throws SQLException {
		EmployeeDao dao = new EmployeeDao();
		ArrayList<EmployeeDto> eList = dao.showTitleEmpInfo("Staff");
		for (EmployeeDto employeeDto : eList) {
			System.out.println(employeeDto);	
		}
		
		System.out.println("=================================");
		
		ArrayList<EmployeeDto> mList = dao.showManagerInfo("Finance");
		for (EmployeeDto employeeDto : mList) {
			System.out.println(employeeDto);
		}
		
		System.out.println("=================================");
		
		System.out.println(dao.showSalaryCount("Georgi", "Facello"));
		
		System.out.println("==============직함 직원 수===================");
		
		System.out.println(dao.showTitleEmpCount("Staff"));
		
		
		
	}

}
