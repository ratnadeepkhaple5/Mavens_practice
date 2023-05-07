package robot_class;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotsOfSpecificArea {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.get("http://tutorialsninja.com/demo/");

		Robot robot=new Robot();

		//1. create rectangle object

		Rectangle rect=new Rectangle(20,100,1000,300);//x,y,height,width we have to provide inside
		// constructor
		
		//2. pass rect variable inside scrCapture method so it returns BufferedImage 	
		BufferedImage srcImage = robot.createScreenCapture(rect);

		//3. store captured image inside folder(before that create screenshots folder)
		//   & import write method from ImageIo class
		ImageIO.write(srcImage, "png", new File("./screenshots/filename2.png"));
	}

}
