package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChOptionsMaxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
	//	options.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		
		
	}

}
