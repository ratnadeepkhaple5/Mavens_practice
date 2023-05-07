package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TodeleteCookies {

	public static void main(String[] args) {

		// to delete all cookies
				ChromeOptions options=new ChromeOptions();
				
				options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				WebDriver driver=new ChromeDriver(options);
				//or
					//WebDriver driver=new ChromeDriver();
					driver.manage().deleteAllCookies();
	}

}
