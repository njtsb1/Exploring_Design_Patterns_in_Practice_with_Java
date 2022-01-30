package subsistem1.crm;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void recordCustomer(String name, String zipcode, String city, String state) {
		System.out.println("Customer saved in CRM system:");
		System.out.println(name);
		System.out.println(zipcode);
		System.out.println(city);
		System.out.println(state);
	}
}
