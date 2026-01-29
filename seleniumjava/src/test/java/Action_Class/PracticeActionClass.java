package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/actions.html");
		
		Actions act = new Actions(driver);
		
//// 1. Hover		3 methods--> moveToElement(element),moveToElement(element,x,y) and moveByOffSet(x,y);
//		
//		WebElement hover = driver.findElement(By.xpath("//button[contains (text() , 'Hover')]"));
//		Thread.sleep(2000);
//		act.moveToElement(hover).build().perform();
		
////2. Left click	2 methods---> click() and click(element)	
//		
//		WebElement leftClick =driver.findElement(By.id("click-box"));
//		Thread.sleep(2000);
//		act.click(leftClick).build().perform();
		
		
		
////3. Right click  2 methods--->contextClick() and contextClick(element)
//		
//		WebElement doubleClick = driver.findElement(By.id("right-click-area"));
//		Thread.sleep(2000);
//		act.contextClick(doubleClick).build().perform();
		
		
		
//// 4. Double click 2 methods---> doubleClick() and doubleClick(element)
//		
//		WebElement doubleClick = driver.findElement(By.id("db-text"));
//		act.scrollToElement(doubleClick).build().perform();
//		Thread.sleep(5000);
//		act.doubleClick(doubleClick).build().perform();
		

//// 5. 	clickAndHold 2 methods----> clickAndHold() and clickAndHold(element)
//		
//		
//		WebElement clickAndHold = driver.findElement(By.id("click-hold"));		
//		act.scrollToElement(clickAndHold).build().perform();
//		act.clickAndHold(clickAndHold).build().perform();
//		Thread.sleep(5000);
//		
//6.    release 2 methods----> release() and release(element)
//		
//		act.release(clickAndHold).build().perform();
		
/*
 		
//7. dragAndDrop 2 methods----> dragAndDrop(source , destination) and dragAndDrop(Source , x,y)
		
		
//drop laptop......
		
		WebElement source1 = driver.findElement(By.id("prod-laptop"));
		WebElement destination1 = driver.findElement(By.id("cart-zone"));
		act.scrollToElement(destination1).build().perform();
		Thread.sleep(5000);
		act.dragAndDrop(source1, destination1).build().perform();
		
		Thread.sleep(2000);
//	drop phone	
		WebElement source2 = driver.findElement(By.id("prod-phone"));
		WebElement destination2 =driver.findElement(By.id("cart-zone"));
		act.dragAndDrop(source2, destination2).build().perform();
		Thread.sleep(2000);
		
		
//drag laptop
		
		WebElement source3 = driver.findElement(By.id("prod-laptop"));
		WebElement destination3 = driver.findElement(By.id("shelf-zone"));
		act.dragAndDrop(source3, destination3).build().perform();
		Thread.sleep(2000);
		
//drag watch
		
		WebElement source4 = driver.findElement(By.id("prod-watch"));		
		WebElement destination4 = driver.findElement(By.id("cart-zone"));		
		act.dragAndDrop(source4, destination4).build().perform();
			
		
// explicit wait condition---->this condition waits until price is visible 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cart-total")));		
		String getPrice = price.getText();
		
// if condition checks whether price text is retrieved successfully.		
		if(!getPrice.isEmpty()){
			
			System.out.println("✅ Total price is: " + getPrice);
			
		}else {
			
			System.out.println("❌ Price not found...");
			
		}
		
		
*/	
		
		
//// 8. scrolling actions--> 2 methods -->  scrollToElement(element)	and scrollByAmount(x,y)	
//		
//		WebElement hover1 =driver.findElement(By.id("pulse-slider"));
//		
//		act.moveToElement(hover1).moveByOffset(50, 0).click().build().perform();
		
	
		

	}

}
