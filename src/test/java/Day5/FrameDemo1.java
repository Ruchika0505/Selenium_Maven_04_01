package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameDemo1 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello Frames");
		
		//Approach-1--id /name
		
		//driver.switchTo().frame("frm1");
		
		
		//Approach-2--webelement
		
    WebElement	frame1=	driver.findElement(By.xpath("//*[@id=\"frm1\"]"));

		driver.switchTo().frame(frame1);
		
	WebElement	dd=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]")); 
	
		Select drpdown=new Select(dd);
		
		drpdown.selectByVisibleText("- Java");
		
		
	     driver.switchTo().defaultContent(); 
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Byee Frames");
		

	}

}
