package batch_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_BatchExecution {

	@Test
	public void actitimeTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String actititle = driver.getTitle();
		System.out.println(actititle);
		
	}
	@Test
	public void orangehrmTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		String orangeTitle = driver.getTitle();
		System.out.println(orangeTitle);
	}
}
