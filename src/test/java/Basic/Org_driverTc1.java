package Basic;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Assignment.Org_Datasupplier;
import Assignment.Org_details;

public class Org_driverTc1 {
	WebDriver driver;

	@BeforeTest
	public void beforetest() {
		 driver=new EdgeDriver();
	//	driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}	
	@Test(dataProvider = "logindata",dataProviderClass = Org_Datasupplier.class)
	public void Test1(String userdata,String passdata,String orgName) throws Exception{

		driver.findElement(By.name("user_name")).sendKeys(userdata);
		driver.findElement(By.name("user_password")).sendKeys(passdata);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();	
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
//		driver.findElement(By.name("accountname")).sendKeys("sriram laptops");
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.name("assigntype")).click();
		driver.findElement(By.name("button")).click();


	}
	@AfterTest
	public void aftertest() throws Exception {
		Org_details org=new Org_details(driver);
	//	org.moveToIcon();
	//	org.signout();
//		driver.close();
	}
}
