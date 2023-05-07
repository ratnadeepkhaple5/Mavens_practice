package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbutton;

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Loginpage Home() {
		logoutbutton.click();
		return new Loginpage(driver);
				
	}
}
