package robot_class;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseHowerRobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://omayo.blogspot.com/");
		
		Robot robot=new Robot();
		
		robot.mouseMove(230, 280);
		
	}

}
