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

public class Practice {

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
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//table[@class='table']")
		));
		
		
		
		int rows =driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		System.out.println("Total No. of Rows :- "+rows);
		
		int column = driver.findElements(By.xpath("//table[@class='table']//tr//th")).size();
		System.out.println("Total No. of Columns :- "+column);
		
		
		
		List<WebElement> rows1 = driver.findElements(
		        By.xpath("//table[@class='table']//tr[position()>1]")
		);

		System.out.println("Total Data Rows: " + rows1.size());

		for (WebElement row : rows1) {
		    String price = row.findElement(By.xpath("td[6]")).getText();
		    System.out.println(price);
		}
		
		String pSourct = driver.getPageSource();
		
		System.out.println(pSourct);
		
		
		
//		for(int r=1;r<=rows;r++) {
//			
//		
//			String price = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
//			System.out.println(price);
//			
//			
//		}
		
		

	}

}
