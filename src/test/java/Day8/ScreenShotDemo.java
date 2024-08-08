package Day8;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// capture full page screenshot
		//TakesScreenshot ts= driver;
		TakesScreenshot ts= (TakesScreenshot) driver;
		
//		File src=ts.getScreenshotAs(OutputType.FILE); //take the screenshot
//		File trg=new File("C:\\Users\\ruchika\\eclipse-workspace\\Selenium_Maven_B12\\Screenshot\\fullpage.png");
//		Files.copy(src,trg);
		
		
		//Capture screen shot for specific area--selenium4
		
//		WebElement featureProduct=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		File src=featureProduct.getScreenshotAs(OutputType.FILE);
//		File trg=new File("C:\\Users\\ruchika\\eclipse-workspace\\Selenium_Maven_B12\\Screenshot\\featureproduct.png");
//		Files.copy(src,trg);
//		System.out.println("Screenshot taken");
//		
//		driver.close();
		
		//capture screenshot for specific element--selenium4
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src= logo.getScreenshotAs(OutputType.FILE);
		File trg =new File("C:\\Users\\ruchika\\eclipse-workspace\\Selenium_Maven_04_01\\ScreenShot\\logo.png");
		Files.copy(src,trg);
		
		System.out.println("Screenshot taken");
	}

}
