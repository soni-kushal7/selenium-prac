package Day21;

import javax.swing.text.Position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchData {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver(); //1st line of code
		
		driver.manage().window().maximize(); // 2nd line of code
		
	
		
		driver.get("https://www.instagram.com/");
		
		String gTilte= driver.getTitle();
		System.out.println(gTilte);
		
		
		
		String gUrl =driver.getCurrentUrl();
		System.out.println(gUrl);
		
		//String gPageSource= driver.getPageSource();
		//System.out.println(gPageSource);
		
		
		//driver.manage().window().minimize();
		
		
		Dimension dim1= driver.manage().window().getSize();
		System.out.println(dim1);
		
		int h1= dim1.getHeight();
		System.out.println(h1);
		
		int w1 = dim1.getWidth();
		System.out.println(w1);
		
		
		Window win = driver.manage().window();
		
		Point pt1 = win.getPosition();
		
		
		
		
		
	
		
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
