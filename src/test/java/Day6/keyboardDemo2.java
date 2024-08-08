package Day6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardDemo2 {

	
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demo.nopcommerce.com/");
			
			WebElement Reg=driver.findElement(By.xpath("//a[@class='ico-register']"));
			
			Actions act=new Actions(driver);
			
			act.keyDown(Keys.CONTROL).click(Reg).keyUp(Keys.CONTROL).perform();
			
			
			
			
			Set <String>winids=driver.getWindowHandles();
			
			List <String >wid =new ArrayList(winids);
			
			String parentid= wid.get(0);
			String childid= wid.get(1);
			
			driver.switchTo().window(childid);
			
			//Action on child window
			
			driver.switchTo().window(parentid);
			
			//Action on parent window

	}

}
