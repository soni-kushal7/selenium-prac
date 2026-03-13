package LocatersPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpressionLocators {

	public static void main(String[] args) throws InterruptedException {
		
		
// 1. CSS Selector 
// 2. XPATH 
		
		
// 1. CSS Selector 
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kushal");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		
		
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("123456");
		
		//driver.findElement(By.xpath("//label[text()=\"Male\"]/..//input[@id='sex']")).click();
		
		//driver.findElement(By.xpath("//label[text()='Custom']/..//input[@id='sex']")).click();
		
		//driver.findElement(By.xpath("//label[text()='Female']/..//input[@id='sex']")).click();
				
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Kushal");
		
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		
		
		
//Radio button practice..........
		
		//driver.get("https://demowebshop.tricentis.com/");
		
		//driver.findElement(By.xpath("//label[text()='Excellent']/..//input")).click();
		
		//driver.findElement(By.xpath("//label[text()='Good']/..//input")).click();
				
		//driver.findElement(By.xpath("//label[text()='Poor']/..//input")).click();
	
		//driver.findElement(By.xpath("//label[text()='Very bad']/..//input")).click();
		
	
//		driver.get("http://103.246.106.171:6060/IITK-0/");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pingalasupport");
//		
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
//		
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//		Thread.sleep(7000);
		
		
		
		
		
		
		
		
	}

}
