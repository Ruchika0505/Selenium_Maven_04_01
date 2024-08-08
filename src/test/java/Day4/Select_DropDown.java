package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDown {

	
		public static void main(String[] args) throws InterruptedException  {
			
			
			ChromeDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
	WebElement	drpdwn=	driver.findElement(By.xpath("//select[@id='country']//option"));
	
	
			drpdwn.click();
			
			
			Select dropdown=new Select(drpdwn);
			
			// dropdown.selectByVisibleText("Germany"); //Germany
			
		//	dropdown.selectByValue("uk"); //United Kingdom
			
			dropdown.selectByIndex(0); // france
			 
			 
			 Thread.sleep(5000);
			 
			 driver.close();

			
	}

}
