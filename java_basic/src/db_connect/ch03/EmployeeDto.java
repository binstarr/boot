package db_connect.ch03;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto {

	private String empNo;
	private String deptNo;
	private String deptName;
	private String firstName;
	private String lastName;
	private String title;

	@Override
	public String toString() {
		return "EmployeeDto [empNo=" + empNo + ", deptNo=" + deptNo + ", deptName=" + deptName + ", firstName="
				+ firstName + ", lastName=" + lastName + ", title=" + title + "]";
	}

}
