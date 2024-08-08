package Day7;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomDemo {

	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		//	WebDriver driver=new ChromeDriver();
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
					driver.get("https://www.orangehrm.com/");
					
					driver.manage().window().maximize();
					
					JavascriptExecutor js= driver;
					
					
					
					js.executeScript("document.body.style.zoom='50%'");  //setZoom level 50 %
                      Thread.sleep(3000);
                  	js.executeScript("document.body.style.zoom='80%'");  //setZoom level 80 %
				 
}}
