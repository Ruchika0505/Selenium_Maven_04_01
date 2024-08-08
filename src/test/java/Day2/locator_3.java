package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_3 {

	public static void main(String[] args) throws InterruptedException {
//		get(url)
//		getTitle()
//		getCurrentURL()
//		getPageSource()
//		getWindowHandle()
//		getwindowHandles()
//		
			ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
//	driver.close();
	
	driver.quit();
	
	

	}

}
