package asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class As_1_assertEqual {
	@Test
	public void actiTimeTest() {
		
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expele = "actiTIME - Login";
		String actualele = driver.getTitle();
	
		Assert.assertEquals(actualele, expele);
		
		System.out.println(actualele);
	}
}
