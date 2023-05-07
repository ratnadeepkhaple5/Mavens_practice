package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Orange {

	WebDriver driver;
	
	@FindBy(id ="welcome")
	private WebElement dropdown;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutbutton;

	public WebElement getDropdown() {
		return dropdown;
	}
	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	public Home_Orange( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Login_Orange homepage() {
		this.dropdown.click();;
		this.logoutbutton.click();
		
		return new Login_Orange(driver);
	}
	
	
}
