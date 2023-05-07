package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChOPtions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		
	//	options.addExtensions("")
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://localhost:8888/");
		
	}

}
