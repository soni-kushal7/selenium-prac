package HandlingWebTables;

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
	
		driver.get("https://blazedemo.com/");
		
		WebElement departureDD =  driver.findElement(By.name("fromPort"));
		Select selDD1 = new Select(departureDD);
		selDD1.selectByVisibleText("Philadelphia");
		
		
		WebElement destinationDD = driver.findElement(By.name("toPort"));
		
		Select selDD2 = new Select(destinationDD);
		selDD2.selectByVisibleText("London");
		
		
		WebElement findFlight =driver.findElement(By.xpath("//input[@type='submit']"));
		findFlight.click();
		
		
		// Wait until table is visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//table[@class='table']")
		));

		// Get all rows from tbody
		List<WebElement> rows = driver.findElements(
		        By.xpath("//table[@class='table']/tbody/tr")
		);

		double minPrice = Double.MAX_VALUE;
		WebElement minRow = null;
		String airlineName = "";

		for (WebElement row : rows) {

		    // Capture price
		    String priceText = row.findElement(By.xpath("td[6]")).getText();
		    double price = Double.parseDouble(priceText.replace("$", "").trim());

		    // Capture airline name (3rd column)
		    String airline = row.findElement(By.xpath("td[3]")).getText();

		    System.out.println("Airline: " + airline + " | Price: $" + price);

		    if (price < minPrice) {
		        minPrice = price;
		        minRow = row;
		        airlineName = airline;   // store airline name
		    }
		}

		// Print lowest airline details
		System.out.println("Lowest Price Airline: " + airlineName);
		System.out.println("Lowest Price: $" + minPrice);

		// Click button of lowest price flight
		minRow.findElement(By.xpath("td[1]/input")).click();

		driver.findElement(By.id("inputName")).sendKeys("Kushal Verma");
		
		driver.findElement(By.id("address")).sendKeys("sector 110 Noida");
		
		driver.findElement(By.id("city")).sendKeys("Noida");
		driver.findElement(By.id("state")).sendKeys("UP");
		driver.findElement(By.id("zipCode")).sendKeys("203002");
		
		
		WebElement cardDD = driver.findElement(By.name("cardType"));
		Select selDD = new Select(cardDD);
		
		selDD.selectByVisibleText("American Express");
		
		
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("179352772532");
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
		driver.findElement(By.id("creditCardYear")).sendKeys("2025");
		driver.findElement(By.id("nameOnCard")).sendKeys("Kushal Verma");
		
		driver.findElement(By.id("rememberMe")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		
	}

}
