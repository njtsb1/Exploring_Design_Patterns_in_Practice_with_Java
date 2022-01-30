package subsistem2.zipcode;

public class zipcodeApi {

	private static zipcodeApi instance = new zipcodeApi();

	private zipcodeApi() {
		super();
	}

	public static zipcodeApi getInstance() {
		return instance;
	}
	
	public String recoverCity(String zipcode) {
		return "Miracatu";
	}
	
	public String recoverState(String zipcode) {
		return "SP";
	}
}
