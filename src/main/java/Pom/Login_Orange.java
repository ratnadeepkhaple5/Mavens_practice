package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Orange {

	WebDriver driver;
	
	@FindBy(id="txtUsername")
	private WebElement usertext;
	
	@FindBy(id="txtPassword")
	private WebElement passtext;
	
	@FindBy(id="btnLogin")
	private WebElement loginbutton;

	public WebElement getUsertext() {
		return usertext;
	}
	public WebElement getPasstext() {
		return passtext;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	public Login_Orange(WebDriver Driver) {
		this.driver=driver;
		PageFactory.initElements(Driver, this);
	}
	
	public Home_Orange Loginpage(String userdata,String passdata) {
		usertext.sendKeys(userdata);
		passtext.sendKeys(passdata);
		loginbutton.click();
	
		return new Home_Orange(driver);
	}
	
}
