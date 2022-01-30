package one.digitalinnovation.gof.facade;

import subsistem1.crm.CrmService;
import subsistem2.zipcode.zipcodeApi;

public class Facade {

	public void migrateClient(String name, String zipcode) {
		String city = zipcodeApi.getInstance().recoverCity(zipcode);
		String state = zipcodeApi.getInstance().recoverState(zipcode);
		
		CrmService.recordCustomer(name, zipcode, city, state);
	}
}
