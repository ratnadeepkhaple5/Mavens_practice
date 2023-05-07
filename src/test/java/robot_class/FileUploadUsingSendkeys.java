package robot_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadUsingSendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement ele = driver.findElement(By.id("file-upload"));
		ele.sendKeys("E:\\Eclipse IDE\\Mavens\\screenshots\\filename1.png");	
	}

}
