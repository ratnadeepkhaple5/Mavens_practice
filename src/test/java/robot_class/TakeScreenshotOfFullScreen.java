package robot_class;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotOfFullScreen {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.get("http://tutorialsninja.com/demo/");

		Robot robot=new Robot();

	//1. get dimension using getScreenSize() methos from ToolKit class	
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
	//2. pass dimensions by dimension ref in rectangle constructor to specify sizes taken	
		
		Rectangle rect=new Rectangle(dimension);//dimension will specifies height & width
	
	//3. pass rect ref in scCapture method; it will capture screenshot & return bufferedImage	
		
		BufferedImage srcImage = robot.createScreenCapture(rect);
	
	//4. store image in system by write method from ImageIo class
		//& pass 3 args:-srcImage,"extension",file object with string path
		
		ImageIO.write(srcImage,"png", new File("./screenshots/filenameFull1.png"));
	}

}
