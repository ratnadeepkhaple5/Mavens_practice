package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pom.Homepage;
import Pom.Loginpage;

public class Pomproject {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		
	//	Loginpage lp =new Loginpage(driver);
		
	//	PageFactory.initElements(driver, lp);
	//	lp.getUsername().sendKeys("admin");
	//	lp.getPassword().sendKeys("manager");
	//	lp.getLoginbutton().click();
		
	//	Homepage hp=new Homepage(driver);
	//	PageFactory.initElements(driver, hp);
	//	hp.getLogoutbutton().click();
	
		new Loginpage(driver).Login("admin", "manager").Home();
	}
}
