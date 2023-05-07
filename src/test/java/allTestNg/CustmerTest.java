package allTestNg;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustmerTest {

	@BeforeClass
	public void BC() {
		System.out.println("login 1");
	}
	@BeforeMethod
	public void BM() {
	System.out.println("Log-in");	
	}
	
	@Test()
//	@Test(groups = "integration")
	public void createCustomerTest() {
		System.out.println("create a new customer");
	//	Assert.assertEquals("actual","expected");
	}
//	@Test(dependsOnMethods ="createCustomerTest" ,priority = 2)
//	@Test(invocationCount = 3)
//	@Test(groups = "Functional")
	@Test
	public void modifyCustomerTest() {
		System.out.println("modify a new customer");
	}
	
//	@Test(dependsOnMethods = "modifyCustomerTest",priority = 3)
//	@Test(groups = "integration")
	@Test
	public void deleteCustomerTest() {
		System.out.println("delete a new customer");
	}
	@AfterMethod
	public void AM() {
		
		System.out.println("Log-out");
		System.out.println("--------------------------");
		
	}
	@AfterClass
	public void AC() {
		System.out.println("logOut 2");
	}
}
