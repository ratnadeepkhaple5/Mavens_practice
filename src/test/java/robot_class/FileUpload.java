package robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		
		
//1.copy path from location=ctrl+c;		
	//provide path	
		String path=System.getProperty("user.dir")+"\\screenshots\\filename1.png";
		
	//copy selected item to clip board 	
		
		StringSelection strsel=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strsel, null);
		
		WebElement upload = driver.findElement(By.id("file-upload"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(upload).click().perform();
		
		
//2.paste that path in tab
		Robot robot=new Robot();
		
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
//3.after pasting the path we need to click on enter button		
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
