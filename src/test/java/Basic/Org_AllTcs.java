package Basic;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Assignment.Org_Datasupplier;

public class Org_AllTcs {

	WebDriver driver;
//	@BeforeTest
//	public void beforetest() {
//		 driver=new EdgeDriver();
//	//	driver.manage().window().maximize();
//		driver.get("http://localhost:8888/index.php");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//	}
	@Test(priority = 0,dataProvider = "logindata",dataProviderClass = Org_Datasupplier.class)
	public void Test1(String userdata,String passdata,String orgName) throws Exception{

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
	
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.name("assigntype")).click();
		driver.findElement(By.name("button")).click();
		Thread.sleep(2000);
		try {
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		}catch(StaleElementReferenceException exp){
		exp.getStackTrace();
			}
	}
	@Test(priority = 1,dataProvider = "logindata",dataProviderClass = Org_Datasupplier.class)
	public void Test2(String userdata,String passdata,String orgName) throws Exception{

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
		driver.findElement(By.name("industry")).click();
		Thread.sleep(2000);
		try {
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		}catch(StaleElementReferenceException exp){
		exp.getStackTrace();
			}
	}
	@Test(priority = 2,dataProvider = "logindata",dataProviderClass = Org_Datasupplier.class)
	public void Test3(String userdata,String passdata,String orgName) throws Exception{
		
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
		Thread.sleep(2000);
		try {
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		}catch(StaleElementReferenceException exp){
		exp.getStackTrace();
			}
	}
	@Test(priority = 3,dataProvider = "logindata",dataProviderClass = Org_Datasupplier.class)
	public void Test4(String userdata,String passdata,String orgName) throws Exception{
		
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
   
		WebElement ele = driver.findElement(By.name("accounttype"));
	ele.click();
//	Actions act=new Actions(driver);
//	act.clickAndHold(ele);
	
	Thread.sleep(2000);
	try {
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.linkText("Sign Out")).click();
	}catch(StaleElementReferenceException exp){
	exp.getStackTrace();
		}
	
	}
}
