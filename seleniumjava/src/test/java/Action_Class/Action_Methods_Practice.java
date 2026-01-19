package Action_Class;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action_Methods_Practice {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	
		//driver.get("https://automationwithpiyush.vercel.app/actions.html");
		
		driver.get("file:///C:/Users/kushal_verma/git/basic-sel/seleniumjava/src/test/java/Action_Class/Action.html");
		
		Actions action = new Actions(driver);

//1. Hover 		moveToElement(element)
		
//		WebElement hover = driver.findElement(By.partialLinkText("Discharge Ward"));		
//		Thread.sleep(2000);		
//		action.moveToElement(hover).build().perform();

		
//		WebElement hover1 = driver.findElement(By.id("hover-box"));		
//		Thread.sleep(2000);	
//		action.moveToElement(hover1).build().perform();
		
//2. Click click(element)
		
		
//	WebElement	testClick = driver.findElement(By.id("click-target"));		
//	action.click(testClick).build().perform();
	

//3. Right click 	contextClick(element)
	
//	WebElement rightClick = driver.findElement(By.id("context-msg"));	
//	action.contextClick(rightClick).build().perform();
		
		
//4. doubleClick(element)
		
//		WebElement doubleClick = driver.findElement(By.id("double-click-target"));
//		
//		action.doubleClick(doubleClick).build().perform();
		
//5. clickAndHold(element)
		
		
	    WebElement clickHold =driver.findElement(By.id("hold-target"));    
	   	    
	    action.scrollToElement(clickHold).build().perform();	
	    
		action.clickAndHold(clickHold).build().perform();
		 //Thread.sleep(2000);
		
		
		
//6. 		
		
		
		
		
		

	}

}
