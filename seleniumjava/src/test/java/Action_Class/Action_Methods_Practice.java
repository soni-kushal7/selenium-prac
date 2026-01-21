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
		
		
	
		driver.get("https://automationwithpiyush.vercel.app/actions.html");
		
		//driver.get("file:///C:/Users/kushal_verma/git/basic-sel/seleniumjava/src/test/java/Action_Class/Action.html");
		
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
		
		
//	    WebElement clickHold =driver.findElement(By.id("hold-target"));    
//	   	    
//	    action.scrollToElement(clickHold).build().perform();	
//	    
//		action.clickAndHold(clickHold).build().perform();
//		 //Thread.sleep(2000);
		
		
		
		
		
//6. 	relesase(element)     action.release(clickHold).build().perform();	----- not working
		
		
//	7. dragAndDrop(source, dest) 
	
	
	WebElement source =  driver.findElement(By.id("drag-source"));
	
	WebElement dest = driver.findElement(By.id("drop-target"));
		
	action.dragAndDrop(source, dest).build().perform();
		
		
		
// 8. scrollByAmount(x, y)  or scrollToElement(element)
		
		action.scrollByAmount(0, 100);
		 Thread.sleep(2000);
		
		action.scrollByAmount(0, 100);
		 Thread.sleep(2000);
		 
		action.scrollByAmount(0, 100);
		 Thread.sleep(2000);
		 
		
		// Actions => click()
		//Actions act = new Actions(driver);

		// click
		// WebElement exit = driver.findElement(By.partialLinkText("Exit"));
		// act.moveToElement(exit).build().perform();
		// act.click().build().perform();
		// or
		// act.click(exit).build().perform();

		// right click
		// WebElement right = driver.findElement(By.id("context-area"));
		// act.moveToElement(right).build().perform();
		// act.contextClick().build().perform();4
		// or
		// act.contextClick(right).build().perform();


		// double click
		// WebElement doubleEle = driver.findElement(By.id("double-click-target"));
		// act.moveToElement(doubleEle).perform();
		// act.doubleClick().build().perform();
		// or
		// act.doubleClick(doubleEle).build().perform();

		// click and hold
		// WebElement hold = driver.findElement(By.id("hold-target"));
		// act.clickAndHold().build().perform();
		// or
		// act.clickAndHold(hold).build().perform();

		// Thread.sleep(2500);
		//
		// release
		// act.release().build().perform();
		// or
		// act.release(hold).build().perform();

		// WebElement source = driver.findElement(By.id("drag-source"));
		// WebElement dest = driver.findElement(By.id("drop-target"));
		//
		// scroll
		// act.scrollByAmount(0, 100).build().perform();
		// act.scrollToElement(dest).build().perform();
		//
		// drag and drop
		// act.dragAndDrop(source, dest).build().perform();
		// act.dragAndDropBy(source, 0, 200).build().perform();

		// WebElement slider = driver.findElement(By.id("precision-seekbar"));

		// hover (Slider)
		// act.moveToElement(slider).moveByOffset(20, 0).click().build().perform();
//		 act.moveToElement(slider, w, 0).click().build().perform();	
		
		
		
		
		
		
		
		

	}

}
