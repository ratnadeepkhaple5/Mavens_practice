package allTestNg;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.ITestListenerclass;
/**
 * listeners at class level
 */
@Listeners(ITestListenerclass.class)//from overriding class
//public class OrganisationListenerTest implements ITestListener {
//or
public class OrganisationListenerTest extends TestListenerAdapter {
//same as ItestListener

	@Test(priority = 1,timeOut = 1000)
	public void createOrgannisationTest() throws InterruptedException {
		//Thread.sleep(2000);
		System.out.println("'Create' a new organisation");
	}
	@Test(priority = 2)
	private void modifyOrganisationTest() {
		System.out.println("'Modify' a new Organisation");
	//	Assert.assertTrue(false);
	}
	@Test(dependsOnMethods ={"createOrgannisationTest","modifyOrganisationTest" })
	public void deleteOrganization() {
		System.out.println("'Delete' an organization");
	}
	
	/*
		Listeners at 'suite level'
	
	 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
<listeners>
	<listener class-name="listeners.ITestListenerclass"/>
</listeners>
  <test  name="Test1">
    <classes>
      <class name="allTestNg.OrganisationListenerTest"/>
    </classes>
  </test> <!-- Test -->
  
   <test  name="Test2">
    <classes>
      <class name="allTestNg.OrganisationListenerTest">
      <methods>
      	<exclude name="deleteOrganization"></exclude>
      </methods>
      </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

	 */
	/*
	 * [RemoteTestNG] detected TestNG version 7.3.0
Test execution get started :-
1)  Test is started: 
create a new organisation
test execution is successful..!
2)  Test is started: 
modify a new Organisation
Test got failed...?
3)  Test is started: 
Test got Skipped...? 
All test execution got Finished..!
PASSED: createOrgannisationTest
FAILED: modifyOrganisationTest
	 * 
	 */
}