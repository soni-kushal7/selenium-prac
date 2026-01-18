package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		
		// go to Facebook
		
		Navigation nav = driver.navigate();
		
		nav.to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		
		// come back to insta
		
		nav.back();
		Thread.sleep(3000);
		
		// again go to fb
		
		nav.forward();
		Thread.sleep(3000);
		
		
		// refresh the page
		
		nav.refresh();
		Thread.sleep(3000);
		
		// come back to insta
		
		nav.back();
		Thread.sleep(3000);
		

		
		driver.quit();
		
	}

}
