package db_connect.ch03;

import java.sql.SQLException;
import java.util.ArrayList;

public interface iEmployeeDao {

	// 해당 직함에 직원 이력 출력
	ArrayList<EmployeeDto> showTitleEmpInfo(String title);
	
	// 부서명을 받아서 해당 부서의 역대 매니저 정보 출력
	ArrayList<EmployeeDto> showManagerInfo(String deptName);
	
	// 이름을 받아서 연봉 받은 횟수 반환
	int showSalaryCount(String firstName, String lastName);
	
	// 현재 해당 직함을 가진 직원 수 반환
	int showTitleEmpCount(String title);
	
	// 직원이 가장 최근에 받은 연봉(최고연봉) 반환
	int showSalary(String firstName, String lastName);
	
}
