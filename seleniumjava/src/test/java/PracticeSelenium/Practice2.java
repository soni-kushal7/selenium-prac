package PracticeSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationwithkushal.vercel.app/");
		
		WebElement countryDD =driver.findElement(By.id("simple-dropdown"));
		
		Select selDD = new Select(countryDD);
		selDD.selectByVisibleText("United Kingdom");
		
		
		
//		WebElement multiDD =driver.findElement(By.id("multi-select"));
//		Select skillDD = new Select(multiDD);
//		skillDD.selectByVisibleText("Selenium");
		
		
		
		List<WebElement> options=driver.findElements(By.xpath("//select[@id='multi-select']//option"));
		//System.out.println(options.size());
		
		for(WebElement op:options) {
			
			String opt =op.getText();
			
			//System.out.println(opt);
			
			if(opt.equals("Java") || opt.equals("Selenium") || opt.equals("TestNG")) {
				
				op.click();
			}
			
			driver.findElement(By.xpath("//button[text()='GET SELECTED']")).click();
			
			
		}
		
		
		
		// Select country 
		WebElement countryDD2 =driver.findElement(By.id("country-dd"));
		Select selectDD = new Select(countryDD2);	
		selectDD.selectByVisibleText("USA");
		
		//Thread.sleep(3000);

		
		
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement stateDD =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("state-dd")));
		Select selectState = new Select(stateDD);
		selectState.selectByVisibleText("New York");
		
		
		
		// Select State (CORRECT element)
		//WebElement stateDD = driver.findElement(By.id("state-dd"));
		
		
		
		//Select stateDD = new Select(countryDD2);
		//select[@id='state-dd']//option[contains(@value,'maharashtra')]
		//stateDD.selectByVisibleText("maharashtra");
		
		
		//driver.quit();
		

	}

}
