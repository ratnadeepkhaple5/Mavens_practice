package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_details {
	WebDriver driver;	
	
	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']" )
	private WebElement moveToIcon;
	
//	@FindBy(xpath = "//a[text()='Sign Out']") 
//	private static WebElement signoutbutton;
//	
	public WebElement getmoveToIcon() {
		return moveToIcon;
	}
//	public WebElement getSignoutbutton() {
//		return signoutbutton;
//	}
	public Org_details(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	public void moveToIcon() {
		
	//	moveToIcon.click();
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//		for(;;) {
//	Actions mouse=new Actions(driver);
//	//	mouse.moveToElement(moveToIcon).perform();
//		mouse.click(moveToIcon).perform();
//		//Org_details.signout();
////		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
////		break;
//		}
		//mouse.click(moveToIcon).perform();
		//mouse.moveToElement(moveToIcon);
		//moveToIcon.click();
	
//	}
//	public static void signout() {
//		signoutbutton.click();
//	}
}
