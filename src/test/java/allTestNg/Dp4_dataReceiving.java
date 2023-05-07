package allTestNg;

import org.testng.annotations.Test;

public class Dp4_dataReceiving{
	// extends Dp3_dataSending_InSeparateClass {
//or
//instead of extends we can use dataProviderclass to inherit data
	
//@Test(dataProvider = "dp2",dataProviderClass = Dp3_dataSupplier.class)
//	public void testLogin(String s) {
//		System.out.println(s);

	@Test(dataProvider = "dp3",dataProviderClass = Dp3_dataSupplier.class)
	public void testLogin(String[] s) {
		System.out.println(s[0]+"-->"+s[1]);
}
}
