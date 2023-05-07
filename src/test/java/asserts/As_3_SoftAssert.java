package asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class As_3_SoftAssert {

	@Test
	public void actiTimeTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		 WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));

			String expele = "actiTIME - Login";
			String actualele = driver.getTitle();
		
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(actualele, expele);
			
			sa.assertAll();
}
}
