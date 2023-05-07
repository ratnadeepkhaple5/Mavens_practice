package allTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Cross_browser {

	WebDriver driver;
	
	@Parameters("Browser")
	@Test
	public void ActiTest(String Browser) {
		if (Browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if (Browser.equals("Edge")) {
			driver=new EdgeDriver();
		}
//		else if(Browser.equals("FireFox")) {
//			driver=new FirefoxDriver();
//		}
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	
	}
}
/*TestNG code
 * 
	<test thread-count="5" parallel="tests" name="TestChrome">
  	<parameter name="Browser" value="Chrome"></parameter>
	  <classes>
	  <class name="allTestNg.Cross_browser"></class>
	  </classes>
	   </test> <!-- Test -->
	   
	    <test thread-count="5" parallel="tests" name="TestEdge">
	    <parameter name="Browser" value="Edge"></parameter>
	  <classes>
	  <class name="allTestNg.Cross_browser"></class>
	  </classes>
	   </test> <!-- Test -->
  
  	  <test thread-count="5" parallel="tests" name="TestFirefox">
	    <parameter name="Browser" value="FireFox"></parameter>
	  <classes>
	  <class name="allTestNg.Cross_browser"></class>
	  </classes>
	   </test> <!-- Test -->

 */



