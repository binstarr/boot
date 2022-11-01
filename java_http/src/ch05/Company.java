package ch05;

import lombok.Data;

@Data
public class Company {
	String name;
	String catchPhrase;
	String bs;
	@Override
	public String toString() {
		return "Company [name=" + name + ", catchPhrase=" + catchPhrase + ", bs=" + bs + "]";
	}
	
}
