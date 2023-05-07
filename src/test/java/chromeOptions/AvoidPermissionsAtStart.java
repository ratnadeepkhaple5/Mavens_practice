package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidPermissionsAtStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(false);
		//false--> it don't allow permission at start
		WebDriver driver = new ChromeDriver(option);
	}

}
