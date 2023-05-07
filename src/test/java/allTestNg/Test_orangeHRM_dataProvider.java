package allTestNg;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_orangeHRM_dataProvider {
	
	WebDriver driver;
	@BeforeMethod
	public void doBefore(){
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
	}
	@Test(dataProvider = "loginCredintials")
	public void testLogin(String userdata,String passdata) throws SocketException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys(userdata);
		driver.findElement(By.id("txtPassword")).sendKeys(passdata);
		driver.findElement(By.id("btnLogin")).click();
//		Assert.assertEquals(userdata, passdata);
		String expectedTitle="OrangeHRM";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(2000);
		System.out.println("same Title");
	}		
	@AfterMethod
	public void doAfter() {
		driver.close();
	}
	@DataProvider(name="loginCredintials")//if we have multiple data provider to identify
	//each data provider uniquely we need to assign the name to data provider..
	//if i removed the name it will throws testNG exception(runtime exception)
	public Object[] lodinData() {
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="admin";
		obj[0][1]="admin123";
		
		obj[1][0]="admin";
		obj[1][1]="Admin123";
		return obj;
	}
}
