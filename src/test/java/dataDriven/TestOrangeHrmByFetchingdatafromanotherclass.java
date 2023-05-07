package dataDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestOrangeHrmByFetchingdatafromanotherclass {
	

	@Test(dataProvider = "logindata",dataProviderClass = ExcelDataProvider2.class)
	public void testLogin(String userdata,String passdata) throws Exception {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(userdata);
		driver.findElement(By.name("password")).sendKeys(passdata);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertTrue(driver.getPageSource().contains("PIM"));


//		SoftAssert sa=new SoftAssert();
//		sa.assertTrue(driver.getPageSource().contains("PIM"));

		driver.quit();
	}		
	
	
}

