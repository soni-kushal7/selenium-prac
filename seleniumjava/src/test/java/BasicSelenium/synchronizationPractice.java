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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronizationPractice {

	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/synchronization.html");
		
//		WebElement startProcess = driver.findElement(By.xpath("//button[contains(text(), 'START PROCESS')]"));
//		startProcess.click();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//		
//		WebElement stopProcess= driver.findElement(By.xpath("//button[contains(text(), 'STOP PROCESS')]"));
//		stopProcess.click();
//		
		
		
		WebElement unlockDisplay = driver.findElement(By.id("trigger-display"));
		unlockDisplay.click();
		
		Actions act = new Actions(driver);
		act.scrollToElement(unlockDisplay);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement enterText= wait.until(ExpectedConditions.elementToBeClickable(By.id("target-display")));
	
		
		enterText.clear();
		enterText.sendKeys("After enable text field");
		

		WebElement unlockInput = driver.findElement(By.id("trigger-input"));
		unlockInput.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
		WebElement enterCommand = wait1.until(ExpectedConditions.elementToBeClickable(By.id("target-input")));
		
		enterCommand.sendKeys("Text box enabled.....");
		
		
		
		
	}

}
