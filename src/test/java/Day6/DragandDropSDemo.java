package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropSDemo {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
        
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
	WebElement country=	driver.findElement(By.xpath("//*[@id=\"box103\"]"));
	WebElement capital=	driver.findElement(By.xpath("//*[@id=\"box3\"]"));	
	
		Actions act =new Actions(driver);
	
	      act.dragAndDrop(capital, country).perform();
	      

	}

}
