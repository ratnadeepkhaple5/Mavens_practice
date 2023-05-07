package allTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowser_switch {
	WebDriver driver;
	@Parameters("browserName")
	@Test
	public void chechBrowser(String browserName) {
	/*	switch (Integer.valueOf(browserName)) {
		case "Chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
		case "firefox":
			driver=new FirefoxDriver();
		default:
			break;
		}
		*/
	}
}
