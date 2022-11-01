package ch05;

public class Address {
	String street;
	String suite;
	String city;
	String zipcode;
	Geo geo;
	@Override
	public String toString() {
		return "Address [street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode=" + zipcode + ", geo="
				+ geo + "]";
	}
	
	
}
