package Assignment;

import org.testng.annotations.DataProvider;

public class Org_Datasupplier {

	
	@DataProvider(name="logindata")
	public String[][] logindata() {

		String[][] data=new String[][] {
			{"admin","admin","sriram laptops25"},
//			{"admin","admin","sriram laptops22"},
//			{"admin","admin","sriram laptops23"},
//			{"admin","admin","sriram laptops24"}
		};
		return data;
	}
	
}
