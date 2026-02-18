package Dropdown_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropDown1 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/kushal_verma/git/basic-sel/seleniumjava/src/test/java/Dropdown_Practice/BoostrapDropdown.html");
		
		
		//1) Select single option
		driver.findElement(By.xpath("//button[contains(@class,'btn-multiselect')]")).click();
		
		//2) capture all the options and find out size
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//label"));
		System.out.println("Total No. of Elements : "+options.size() );
		
		
		//3) printing options from dropdown
		
//		int count=1;
//		for(WebElement op:options) {
//			
//			
//			System.out.println(count +"."+ op.getText());
//			count++;
//		}
		

		//4) select multiple options
		
		for (WebElement op : options)
		{
		    String option = op.getText();

		    if (option.equals("Java") || option.equals("Python") || option.equals("MySQL"))
		    {
		        op.click();
		    }
		}
		
		
		
		
	}

}
