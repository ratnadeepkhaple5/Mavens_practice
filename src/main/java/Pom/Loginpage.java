package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	@FindBy(id="username")
	private WebElement usernamedata;
	
	@FindBy(name="pwd")
	private WebElement passworddata;

	@FindBy(id="loginButton")
	private WebElement loginbutton;

	public WebElement getUsername() {
		return usernamedata;
	}
	public WebElement getPassword() {
		return passworddata;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	public Homepage Login(String username,String password) {
		usernamedata.sendKeys(username);
		passworddata.sendKeys(password);
		loginbutton.click();
		
		return new Homepage(driver);
	}

	
	
	
}
