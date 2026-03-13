package WebElementsMethodsRegistration;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodsOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		
		
		
/*
 

WebElement Methods-----

Action Methods
1.click()----void
2.clear()----void
3.submit()----void
4.sendKeys()----void


Getters Methods
1.getText()--------String
2.getAttribute()--------String
3.getTagName()--------String
4.getCssValue()--------String
5.getLocation()-----Point
6.getSize()------Dimension


7.getRect()---------Rectangle
a.getPoisition()
b.getSize()
c.getHeight()
d.getWidth()
e.getX()
f.getY()


Verification/Validation Methods

1.isDisplay()-----boolean
2.isEnabled()-----boolean
3.isSelected()-----boolean


  		
 */
		
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
/*		
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
      WebElement gText =driver.findElement(By.xpath("//label[text()='Male']"));
      
      //gText.getText();
		
		System.out.println(gText.getText());
		
		
	WebElement gAttribute=	driver.findElement(By.xpath("//input[@id='u_0_a_A/']"));
		
	String GATT=	gAttribute.getAttribute("id");
	
	System.out.println(GATT);
		
*/
		
		
		
/*
 
 Case 1..........
 
 driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
	WebElement display = driver.findElement(By.xpath("//button[text()='Enable']"));
	
	if(display.isDisplayed()) {
		
		display.click();
	}
	
	
		
		 driver.findElement(By.xpath("//button[text()='Disable']/..//input")).sendKeys("Kushal");
		 
		 driver.findElement(By.xpath("//button[text()='Disable']")).click();
		 
*/		 
		 

		
// case 2-------		
		
//	driver.get("https://the-internet.herokuapp.com/add_remove_elements/");	
//	
//	driver.findElement(By.xpath("//button[text()='Add Element']")).click();
//	
//	driver.findElement(By.xpath("//button[text()='Delete']")).click();
		

		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		//driver.findElement(By.id("register-button")).click();
		
		
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Kushal");	
		
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Verma");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kushal25@yopmail.com\r\n"
				+ "");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Kushal@1234");
		
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Kushal@1234");
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		
	WebElement text =	driver.findElement(By.xpath("//div[@class='result']"));
		
	System.out.println(text.getText());
	
	driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
	
		
	driver.findElement(By.partialLinkText("Log out")).click();
	
	driver.findElement(By.partialLinkText("Log in")).click();
	
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kushal25@yopmail.com");
	
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Kushal@1234");
	
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	driver.findElement(By.xpath("//label[text()='Good']/..//input")).click();
	
	driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
	
	
	
////	  // Locate all poll answers
//    List<WebElement> pollResults =
//            driver.findElements(By.xpath("//ul[@class='poll-results']/li"));
//    System.out.println(pollResults.size());
//
//    // Print results with serial number
//    int count = 1;
//    for (WebElement result : pollResults) {
//        System.out.println(count + ". " + result.getText());
//        count++;
//    }
	
	
	
	}


}
