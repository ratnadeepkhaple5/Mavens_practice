package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Assignment.Org_Datasupplier;
import Assignment.Org_Datasupplier1;

public class Org_allTcs1 {

	WebDriver driver;
	@DataProvider(name = "logindata"/*,dataProviderClass = Org_Datasupplier1.class*/)
	@BeforeTest()
	public void doIt(String userdata,String passdata ) throws Exception {
		driver=new EdgeDriver();
		driver.get("http://localhost:8888/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.name("user_name")).sendKeys(userdata);
		driver.findElement(By.name("user_password")).sendKeys(passdata);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();	
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	}
	@Test(priority = 0,dataProviderClass = Org_Datasupplier.class)
	public void Test1(String orgName) throws Exception{
		
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.name("assigntype")).click();
		driver.findElement(By.name("button")).click();
		

	}
	@Test(priority = 1,dataProvider = "logindata",dataProviderClass = Org_Datasupplier.class)
	public void Test2(String userdata,String passdata,String orgName) throws Exception{
		
	
		
		driver.findElement(By.name("industry")).click();
	}
	@Test(priority = 2,dataProvider = "logindata",dataProviderClass = Org_Datasupplier.class)
	public void Test3(String userdata,String passdata,String orgName) throws Exception{
		
		driver.findElement(By.name("user_name")).sendKeys(userdata);
		driver.findElement(By.name("user_password")).sendKeys(passdata);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();	
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		WebElement ele = driver.findElement(By.name("industry"));
		ele.click();
		Select sl=new Select(ele);
		List<WebElement> eleList = sl.getOptions();

		for (WebElement webElement : eleList) {
		//	System.out.println(webElement.getText());
		
		if (webElement.getText().contains("Retail")) {
			sl.selectByVisibleText("Retail");
			System.out.println("Text got selected...pass");
			break;
		}
	 }
	}
	@Test(priority = 3,dataProvider = "logindata",dataProviderClass = Org_Datasupplier.class)
	public void Test4(String userdata,String passdata,String orgName) throws Exception{
		
		driver.findElement(By.name("user_name")).sendKeys(userdata);
		driver.findElement(By.name("user_password")).sendKeys(passdata);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();	
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
   
		WebElement ele = driver.findElement(By.name("accounttype"));
	ele.click();
//	Actions act=new Actions(driver);
//	act.clickAndHold(ele);
	}
}
