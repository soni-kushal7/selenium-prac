package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();  //upcasting		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        
        jse.executeScript("window.location='https://www.facebook.com/';");
        
        Thread.sleep(2000);
        
        jse.executeScript("window.location='https://www.zomato.com/';");
        
        Thread.sleep(2000);
        
        jse.executeScript("window.location='https://www.instagram.com/';");
        
        
       // jse.executeScript("window.location='https://automationwithpiyush.vercel.app/js-executor.html';");
		
		
        String url = "https://automationwithpiyush.vercel.app/js-executor.html";
        
        jse.executeScript("window.location=arguments[0];", url);
        
        
        WebElement text=driver.findElement(By.id("display-text"));
        
        //String textValue = "Kushal";
        
        jse.executeScript("argument[0].value = 'kushal'",text);
        
        
        
		

	}

}
