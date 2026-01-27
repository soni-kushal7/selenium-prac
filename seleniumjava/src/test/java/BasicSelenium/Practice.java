package BasicSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/locators.html");
		
		WebElement uName= driver.findElement(By.id("email"));
		uName.sendKeys("Kushal");
		
		WebElement pas = driver.findElement(By.name("pass"));
		pas.sendKeys("123456");
		
		WebElement checkBox =driver.findElement(By.id("terms_checkbox"));
		checkBox.click();
		
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@id , 'u_0')]"));
		loginButton.click();
		
		WebElement text = driver.findElement(By.xpath("//h2[text() ='Access Granted']"));
		
		String gText= text.getText();
		
		if (gText.equals("Access Granted")) {
			
			System.out.println("Login Successfully....."+gText);
			
			TakesScreenshot tks = (TakesScreenshot)driver;
			
			File source = tks.getScreenshotAs(OutputType.FILE);
			
			String relPath = "./errorshots/dummy.png";
			
			File destination = new File(relPath);
			
			FileHandler.copy(source, destination);
			
			System.out.println("📸 Screenshot saved successfully at: " + destination.getAbsolutePath());
			
			
		}else {
			
			System.out.println("Access Denyed");
		}
		
	
		
		
		
	}

}
