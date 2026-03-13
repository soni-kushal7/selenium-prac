package TakaScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice1 {

	public static void main(String[] args) throws IOException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationwithpiyush.vercel.app/index.html");
		
		
		
//1. downcast
		
		TakesScreenshot tks = (TakesScreenshot)driver;

		File source = tks.getScreenshotAs(OutputType.FILE);

		String realPath="./errorshots/dummy1.png";
		
		File destination = new File(realPath);
		
		FileHandler.copy(source, destination);
		

	}

}
