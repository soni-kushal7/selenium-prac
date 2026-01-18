package Dropdown_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomDD {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		driver.get("file:///C:/Users/kushal_verma/eclipse-workspace/seleniumjava/src/test/java/Dropdown_Practice/DDHtml.html");

		
//===========================Student Dropdown===========================================
		
		
// 1.Step :-  First we create object of dtudent dropdown....
		
		WebElement stuDD = driver.findElement(By.id("student"));
		
		
// 2.Step :- Then we create select class ka object
				
		Select selStu = new Select(stuDD);
		
		
//Select the value from dropdown one by one in single select dropdown ......
		
		//selStu.selectByIndex(4); // Select by index method
				
		//selStu.selectByValue("fifth"); // Select by value Method
				
		//selStu.selectByVisibleText("Pappu"); // select by visible text method
		
		
//this code extrects all the value of student dropdown and print them by (for each loop)
		
		List<WebElement> allOptions = selStu.getOptions(); 
				
		for (WebElement i : allOptions) {
			
			String text = i.getText();
			
			System.out.println(text);
						
		}
		
		
		
		
		

//========================Car Dropdown=============================================
		
	WebElement carDD = driver.findElement(By.id("car"));
	
	Select selCar = new Select(carDD);

	
//Select value dropdown one by one Multi select 
	
	selCar.selectByIndex(0);
	selCar.selectByValue("second");
	selCar.selectByVisibleText("G-WagonR");
	
	
//This code is written for --->to print selected options  by you by for each loop....
	
	
	List<WebElement> selectedOptions = selCar.getAllSelectedOptions();
	
	System.out.println("Selected Options by you Are : ");
	
	for(WebElement options :selectedOptions) {
		
		System.out.println(options.getText());
		
		
	}
	
	
//This code is for select all options in multi select dropdown by indexing loop.....
	
   List<WebElement> allOpt = selCar.getOptions();
		

// Select all oprions with indexing loop.....	
	
//	for (int i = 0; i<allOpt.size(); i++) {
//		
//		selCar.selectByIndex(i);
//	
//	}
//	
	
	
// Select all oprions with forEach loop....
			
	
//	for (WebElement option : allOpt) {
//		
//		selCar.selectByVisibleText(option.getText());
//		
//	}
	
	
	
	
	
//deSelect All options 	
//selCar.deselectAll();
	
	
//This code is written for ---> print all options from multi select dropdown by for each loop....
//	
//	System.out.println("All Selected Options Are : ");
//	for(WebElement i : allOpt) {
//				
//		String text = i.getText();		
//		System.out.println(text);
//		
//	}
		
		
		
		
		
		
		
		
		

	}

}
