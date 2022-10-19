package db_connect.ch03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDao implements iEmployeeDao {

	private DBHelper dbHelper;
	private Connection connection;
//	private Statement statement;
	private PreparedStatement preparedStatement;
	// Statement와 차이점은 캐시를 구현해줌 -> 캐시는 한번 검색해둔 것을 메모리에 저장해서 검색이 더 빨라짐
	private ResultSet resultSet;

	public EmployeeDao() {
		// 매개변수에 넣으면 의존성 컴포지션 관계 -> 의존성 높다 -> 좋은 코드는 아니다. 루즈하게 만드는게 좋다
		this.dbHelper = DBHelper.getInstance();
	}

	@Override
	public ArrayList<EmployeeDto> showTitleEmpInfo(String title) {
		ArrayList<EmployeeDto> resultList = new ArrayList<>();
		String sql = " SELECT * " + "		  FROM employees AS A " + "		  INNER JOIN titles AS B "
				+ "		  ON A.emp_no = B.emp_no " + "		  WHERE B.title = ? ";
		try {
			preparedStatement = dbHelper.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, title); // ? 값에 어떤 걸 넣을 것인지 정하는 문
			resultSet = preparedStatement.executeQuery(); // 쿼리문 실행

			while (resultSet.next()) {
				EmployeeDto dto = new EmployeeDto();
				dto.setEmpNo(resultSet.getString("emp_no"));
				dto.setFirstName(resultSet.getString("first_name"));
				dto.setTitle(resultSet.getString("title"));
				resultList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 닫는건 반대로 닫아야 해서 역순으로
			try {
				resultSet.close();
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultList;
	}

	@Override
	public ArrayList<EmployeeDto> showManagerInfo(String deptName) {
		ArrayList<EmployeeDto> managerList = new ArrayList<>();
		String sql = " SELECT * "
				+ "FROM employees AS A "
				+ "INNER JOIN dept_manager AS B ON A.emp_no = B.emp_no "
				+ "INNER JOIN departments AS C ON B.dept_no = C.dept_no "
				+ "WHERE C.dept_name = ? ";
		try {
			preparedStatement = dbHelper.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, deptName);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				EmployeeDto dto = new EmployeeDto();
				dto.setDeptNo(resultSet.getString("dept_no"));
				dto.setDeptName(resultSet.getString("dept_name"));
				dto.setEmpNo(resultSet.getString("emp_no"));
				dto.setFirstName(resultSet.getString("first_name"));
				managerList.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return managerList;
	}

	@Override
	public int showSalaryCount(String firstName, String lastName) {
		int result = 0;
		String sql = " select A.emp_no, A.first_name, A.last_name, count(A.emp_no) as 'Z' "
				+ "from employees as A "
				+ "inner join salaries as B "
				+ "on A.emp_no = B.emp_no "
				+ "where A.first_name = ? and A.last_name = ? ";
		
		try {
			preparedStatement = dbHelper.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				
				EmployeeDto dto = new EmployeeDto();
				dto.setEmpNo(resultSet.getString("emp_no"));
				dto.setFirstName(resultSet.getString("first_name"));
				dto.setLastName(resultSet.getString("last_name"));
				result = resultSet.getInt("Z");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				resultSet.close();
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int showTitleEmpCount(String title) {
		int result = 0;
		String sql = " SELECT COUNT(B.title) as C "
				+ "FROM employees AS A "
				+ "INNER JOIN titles AS B "
				+ "ON A.emp_no = B.emp_no "
				+ "WHERE B.title = ? ";
		try {
			preparedStatement = dbHelper.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, title);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				result = resultSet.getInt("C");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int showSalary(String firstName, String lastName) {
		int result = 0;
		String sql = " select A.emp_no, A.first_name, A.last_name, max(B.salary) as C "
				+ "from employees as A "
				+ "inner join salaries as B "
				+ "on A.emp_no = B.emp_no "
				+ "where A.first_name = ? and A.last_name = ? ";
		try {
			preparedStatement = dbHelper.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}

}
