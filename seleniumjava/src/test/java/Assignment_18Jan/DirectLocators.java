package Assignment_18Jan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("Kushal");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Kushal");
		
		
		//driver.findElement(By.name("pass")).sendKeys("12345");
		
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("1234599");
		
		
		
		
		

	}

}
