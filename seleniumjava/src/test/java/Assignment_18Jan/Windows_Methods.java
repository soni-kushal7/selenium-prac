package Assignment_18Jan;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Methods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
	/*	
		
//Windows methods --->
		
		1. maximize()
		2.minimize()
		3.fullScreen()
		4.getSize()
		5.setSize()
		6.getPosition()
		7.setPosition()
		
		
*/		
		
		
		driver.get("https://www.facebook.com/");
		
//1. maximize()		
		
		driver.manage().window().maximize();
		
//		2.minimize()		
		
		driver.manage().window().minimize();
		
//	3.fullScreen()	
		driver.manage().window().fullscreen();
		
//4.getSize()		
		Dimension dim1 = driver.manage().window().getSize();	
		System.out.println(dim1);
		
//5.setSize()		
		Dimension dim2 = new Dimension(500,500);
		driver.manage().window().setSize(dim2);
		
//	6.getPosition()		
		Point p1 = driver.manage().window().getPosition();
		System.out.println(p1);
		
//	7.setPosition()	
		Point p2 = new Point(200,300);		
		driver.manage().window().setPosition(p2);
		
		
		
		
		
		
		
		

	}

}
