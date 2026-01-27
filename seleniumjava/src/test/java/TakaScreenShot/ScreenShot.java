package TakaScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();  //upcasting		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://automationwithpiyush.vercel.app/screenshots.html");
		
		
// 1> downcasting
        
		TakesScreenshot tks = (TakesScreenshot)driver; //down casting
			
		
//2> take the ss in file format
		
		File source = tks.getScreenshotAs(OutputType.FILE);
		
//		3> create the java representation object of the physical file
		
		String relPath = "./errorshots/dummy.png";
		
		File destination = new File(relPath);
		
		
//		4> copy that content to the dummy file
		
		FileHandler.copy(source, destination);
        

		
		

	}

}
