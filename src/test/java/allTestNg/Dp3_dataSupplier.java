package allTestNg;

import org.testng.annotations.DataProvider;

public class Dp3_dataSupplier {

	@DataProvider
	public String[] dp1() {
		String[] data=new String[] {
			"Sunny","raj","Manoj"
		} ;
		return data;
	}
	@DataProvider
	public String[] dp2() {
		String[] data=new String[] {
			"Ratnadeep","raj","Rahul"
		} ;
		return data;
	}
	@DataProvider
	public String[][] dp3() {
		String[][] data=new String[][] {
			{"Ratnadeep","77.27%"},{"raj","70%"},{"Rahul","65%"}
		} ;
		return data;
	}
}
