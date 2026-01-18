package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		
	//1. Launch Chrome browser-----
		
		
		//ChromeDriver driver = new ChromeDriver();
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver= new EdgeDriver();
		
	//2. Open URL	
		
		driver.get("https://hrms.elevenxcapital.com/");
		
		
	//3. Validate Title of the page----	HR Portal
	
		String actualTitle= driver.getTitle();
		
		if (actualTitle.equals("HR Portal")) {
			
			System.out.println("Test Case Pass.....");
			
		}else {
			
			System.out.println("Test Case Fail.....");
			
		}
		
		//driver.close();
		//driver.quit();
		
		
		
	}

}
