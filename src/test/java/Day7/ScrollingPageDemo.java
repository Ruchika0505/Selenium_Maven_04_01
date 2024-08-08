package Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		//	WebDriver driver=new ChromeDriver();
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
					driver.get("https://www.orangehrm.com/");
					
					driver.manage().window().maximize();
					
					JavascriptExecutor js= driver;
					
				//	Scroll page by pixel
					
				js.executeScript("window.scrollBy(0,300)", " ");
				
				System.out.println(js.executeScript("return window.pageYOffset;")); //300
				
			
		
				
				Thread.sleep(5000);

						
				//Scroll down to specific element
				
				
//				WebElement text=driver.findElement(By.xpath("//h3[@class='text-center']"));
//				js.executeScript("arguments[0].scrollIntoView();", text);
//				System.out.println(js.executeScript("return window.pageYOffset;"));
//				
//				Thread.sleep(5000);
				
				//scroll to the end of the page
				
//				js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
//				System.out.println(js.executeScript("return window.pageYOffset;")); //6068.7998046875
				
				//scroll to the start of the page
				
//				Thread.sleep(5000);
//				
//				js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
//				System.out.println(js.executeScript("return window.pageYOffset;"));  //0
//				
//				
					
					
	}
}
