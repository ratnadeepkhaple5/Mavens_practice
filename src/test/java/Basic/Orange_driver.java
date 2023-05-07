package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pom.Home_Orange;
import Pom.Login_Orange;

public class Orange_driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
//4//	Login_Orange lp=new Login_Orange(driver);
	
//1.1	//	PageFactory.initElements(driver, lp);
//2.1	//	lp.getUsertext().sendKeys("admin");
//2.2	//	lp.getPasstext().sendKeys("admin123");
//2.3	//	lp.getLoginbutton().click();
		
//3		lp.Loginpage("admin", "admin123");
			
//4//	Home_Orange hp=new Home_Orange(driver);
		
//1	//	PageFactory.initElements(driver, hp);
//2.1	//	hp.getDropdown().click();
//2.2	//	hp.getLogoutbutton().click();
		
//3		hp.homepage();
		
		new Login_Orange(driver).Loginpage("admin", "admin123").homepage();
	//	new Login_Orange(driver).Loginpage("admin", "admin123");
		
	//	new Home_Orange(driver).homepage();
	
	}

}
