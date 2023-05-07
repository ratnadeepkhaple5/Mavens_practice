package robot_class;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPageAndDelayMethod {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.get("http://tutorialsninja.com/demo/");

		Robot robot=new Robot();
	//1.1 to scroll down
		robot.mouseWheel(10);//provide scroll amount 
		
	//2 delay method
		robot.delay(2000);//delay in milliseconds...delay is alternate for thread.sleep(miSec)
		
	//1.2 to scroll up
		robot.mouseWheel(-5);
		
		
		
	}

}
