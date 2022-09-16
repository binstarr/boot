package ch11;

public class Airplane {
	
	public int airportNum;
	
	private Airplane() {
		
	}
	
	private static Airplane instance = new Airplane();
	
	public static Airplane getInstance() {
		return instance;
	}

}
