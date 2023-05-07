package Basic;

import java.awt.Robot;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Org_driver1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 WebDriver driver=new EdgeDriver();
	//	driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();	
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("sriram laptops21z");
//		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.name("assigntype")).click();
		driver.findElement(By.name("button")).click();
		
	//	WebElement ele = driver.findElement(By.xpath("(//*[@class='small'])[4]"));
	//	WebElement ele = driver.findElement(By.xpath("(//img[@border='0'])[3]"));
		
WebElement ele = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]"));
//		for(;;) {
//		Actions action=new Actions(driver);		
//	//	action.moveToElement(ele).perform();
//		action.click(ele).perform();
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
//		}

		JavascriptExecutor jse=(JavascriptExecutor) driver;

		for(;;) {
			try {
				Thread.sleep(3000);
				ele.click();
				driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			} catch (Exception e) {
				e.printStackTrace();
		     }
		}
	//	jse.executeScript("arguments[0].moveToElement()", ele);	
	}

}
