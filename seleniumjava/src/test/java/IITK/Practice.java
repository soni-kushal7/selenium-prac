package IITK;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		ChromeOptions options = new ChromeOptions();

        // Disable save password popup
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);

       
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
			
		driver.get("http://103.246.106.171:6060/IITK-0/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("arh");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='HRMS']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll until element comes into view
		js.executeScript("arguments[0].scrollIntoView(true);", element);

		// Click the element
		element.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Employee Data Approval Workflow']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@href=\"javascript:loadFormext('listEmployeeMasterCheckerMapping')\"])[1]")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Access as role Faculty']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
	    WebElement Element =driver.findElement(By.xpath("//span[normalize-space()='--Select--']"));
	    Element.click();
	    
	    
	    FluentWait<WebDriver> wait = new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(30))
	            .pollingEvery(Duration.ofSeconds(2))
	            .ignoring(NoSuchElementException.class);

	    // Wait until Medical Booklet option appears
	    WebElement medicalBooklet = wait.until(new Function<WebDriver, WebElement>() {
	        public WebElement apply(WebDriver driver) {
	            WebElement element = driver.findElement(
	                    By.xpath("//*[contains(text(),'Medical Booklet')]")
	            );

	            if (element.isDisplayed()) {
	                return element;
	            }
	            return null;
	        }
	    });

	    // Scroll to element
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].scrollIntoView(true);", medicalBooklet);

	    // Click using JavaScript
	    js1.executeScript("arguments[0].click();", medicalBooklet);
	    
	    
	    
	    
	    
	    
	    
	    
//	    WebElement f1=driver.findElement(By.id("ajaxform"));
//	    driver.switchTo().frame(f1);
	    
//	 // Explicit wait
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	    // Wait until Medical Booklet option becomes visible
//	    WebElement medicalBooklet = wait.until(
//	            ExpectedConditions.visibilityOfElementLocated(
//	                    By.xpath("//span[contains(text(),'Medical Booklet')]")
//	            )
//	    );
//
//	    
//	 // Click option
//	    medicalBooklet.click();
	    
	    
	    
//	 // Click using Actions
//	    Actions action = new Actions(driver);
//	    action.moveToElement(medicalBooklet).click().perform();
	    
	    
	    
	    
	    
//	    Thread.sleep(3000);
//	    WebElement medicalBooklet = driver.findElement(By.xpath("//span[normalize-space()='Medical Booklet']"));
//	    Actions action = new Actions(driver);
//
//	    // Hover over the element	
//	    action.moveToElement(medicalBooklet).click().perform();
//	    
	 
//	    WebElement	selectLink =driver.findElement(By.id("page_sub_menu_location_pk"));
//		Select linkDD= new Select(selectLink);
//		Thread.sleep(3000);
//		linkDD.selectByVisibleText("Medical Booklet");
		

		
		
		

	}

}
