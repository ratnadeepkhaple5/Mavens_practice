package Assignment;

import org.testng.annotations.DataProvider;

public class Org_Datasupplier1 {

	@DataProvider(name="logindata")
	public String[] logindata() {
		String[] data=new String[]{
		"admin","admin"
	};
	return data;
	}
	
}
