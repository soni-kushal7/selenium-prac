package SeleniumAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class SauceDemoAssignment {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new EdgeDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.saucedemo.com/");
		
// it will check if get URL and current URL are same.....
		
		String currentURL = driver.getCurrentUrl();
		
		System.out.println("Your Current URL IS : " + currentURL);
		
		
		if (currentURL.equalsIgnoreCase("https://www.saucedemo.com/")){
			
	System.out.println("You Are On The right URL");
	
	} else {
		
		System.out.println("You Are On The Wrong URL");
		
	}
		
		
// Login Steps-------
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); //Locate with ID
		driver.findElement(By.name("password")).sendKeys("secret_sauce"); //Locate with name
		
		
// Login button condition.....
		
		
		
		WebElement loginButton = driver.findElement(By.xpath(" //input[@id='login-button']"));
		
		if (loginButton.isDisplayed() && loginButton.isEnabled()) {
			
			loginButton.click();
			
			System.out.println("Login succesfully !");
			
		}
		
		
// Get the name of product which we are going to Add to cart /Get the name of product on product page....	
		
		WebElement productName =driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));		
		String getName = productName.getText();		
		//System.out.println(getName); 
		
		
			driver.findElement(By.xpath("//button[text()='Add to cart' and @id ='add-to-cart-sauce-labs-backpack' ]")).click();					
			driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']")).click(); //Click on Add to cart logo			
			driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
			
		//Add Another product.......
			
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();			
			driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']")).click(); //Click on Add to cart logo
		
			
		
// Get the name of product present on Add to cart page....
		
		WebElement addedProductName =driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));		
		String getName1 =addedProductName.getText(); 		
		//System.out.println(getName1);
		

//Get the price of the product......
		
		WebElement price = driver.findElement(By.xpath("//div[text()='29.99']"));		
		String getPrice = price.getText(); // Get the price of the product		
		//System.out.println(getPrice);
		
		
// condition to check if product we added to cart is correct then it will click on checkout button...		
		if (getName.equals(getName1) ) {
			
			driver.findElement(By.xpath("//button[@id='checkout']")).click();
			
				
		}else {
			
			System.out.println("Product you are trying to buy is not same!....");
			
		}
		
// Filling Checkout Information page.....
		
		driver.findElement(By.cssSelector("input[id='first-name']")).sendKeys("Kushal");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Verma");		
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("202121");	
		driver.findElement(By.xpath("//input[@name='continue']")).click();

		
		WebElement totalPrice =driver.findElement(By.xpath("//div[text()= '43.18']"));		
		String getTotalPrice = totalPrice.getText();		
		System.out.println(getTotalPrice);
		
//Checkout: Overview page-----
		
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		
//Checkout: Complete! page......
		
		WebElement status= driver.findElement(By.xpath("//span[text()='Checkout: Complete!']"));		
		String getStatus = status.getText();		
		System.out.println(getStatus);
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		
		
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	
//Login Again with different crad.....
		
		driver.findElement(By.id("user-name")).sendKeys("visual_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce"); 
		
		
WebElement loginButton1 = driver.findElement(By.xpath(" //input[@id='login-button']"));
		
		if (loginButton1.isDisplayed() && loginButton1.isEnabled()) {
			
			loginButton1.click();
			
			System.out.println("Login succesfully Again !");
			
		}
		
	
		
		
		
		
		
		

	}

}
