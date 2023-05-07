package allTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp2_partialDataSending_indices {

	@Test(dataProvider = "dp1")
	public void testLogin(String s) {
		System.out.println(s);
	}
	
	@DataProvider(indices = {2,0})
	public String[] dp1() {
		String[] data=new String[] {
			"Sunny","raj","Manoj"
		} ;
		return data;
	}
}
