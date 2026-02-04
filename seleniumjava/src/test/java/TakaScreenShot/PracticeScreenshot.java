package TakaScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class PracticeScreenshot {
	
	
//	public String toString() {
//		 
//		return null;
//		
//	}
	
	

	public static void main(String[] args) throws IOException{
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://automationwithpiyush.vercel.app/index.html");
		
		
// 1. downcast
		
		
		TakesScreenshot tks = (TakesScreenshot)driver;

//2. take the screenshot in file format		
		
		File source = tks.getScreenshotAs(OutputType.FILE);
		
//3. create the java representation object of physical file
		
		String realPath = "./errorshots/dummy.png";
		File destination = new File(realPath);

		
//4. Copy that content to the dummy file....		
		
		FileHandler.copy(source, destination);
		
		
		
		
		
		
		
		
		
		
		

	}

}
