package Synchronization_Waits_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice1 {

	public static void main(String[] args) {
		
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationwithpiyush.vercel.app/synchronization.html");
		
		
//		driver.findElement(By.xpath("//button[contains(text(),'START PROCESS')]")).click();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		driver.findElement(By.xpath("//button[contains(text(),'STOP PROCESS')]")).click();
		
		
		WebElement unlockDisplay =driver.findElement(By.id("trigger-display"));
		unlockDisplay.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
		
		WebElement text =wait.until(ExpectedConditions.elementToBeClickable(By.id("target-display")));
		text.clear();
		text.sendKeys("Kushal");
		
		
		driver.findElement(By.id("trigger-input")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement text1 =wait1.until(ExpectedConditions.elementToBeClickable(By.id("target-input")));
		text1.sendKeys("verma");
		
		
		

	}

}
