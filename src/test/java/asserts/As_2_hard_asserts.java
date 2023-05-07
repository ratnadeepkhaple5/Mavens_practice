package asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class As_2_hard_asserts {

	@Test
	public void actiTimeTest() {
		
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		 WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));

	//	 Assert.assertTrue(checkbox.isDisplayed());
	//	 Assert.assertTrue(checkbox.isSelected());//FAILED: actiTimeTest
	//	 Assert.assertFalse(checkbox.isDisplayed());//FAILED: actiTimeTest
		 Assert.assertFalse(checkbox.isEnabled());//FAILED: actiTimeTest
		 
		 String actualtitle = driver.getTitle();
		 System.out.println(actualtitle);
	
	
	
	}
}
