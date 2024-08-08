package Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//
//get(url)
//getTitle()
//getCurrentURL()
//getPageSource()


public class get_methods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
//	System.out.println(	driver.getTitle());
//		
//	System.out.println(driver.getCurrentUrl());
	
	//System.out.println(driver.getPageSource());
	
//	String id=driver.getWindowHandle() ; // return one window id for current page
//	
//	System.out.println("Window id for login " + id); //BEBFE0FF02FBDE8A0B1BC4B599B60195
//	                                                 //6488BB1C99BB065974CAFBFC6DA9420C
	
	
		
		Set < String > wids=driver.getWindowHandles();
		
//		List ids= new ArrayList(wids);
		
		
	//	System.out.println(wids);
		
		for(String id :wids)
		{
			System.out.println(id);
		}
		
		
		driver.quit();
		
	}

}
