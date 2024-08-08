package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessTestingDemo {

	public static void main(String[] args) throws InterruptedException {
	
		//Approach-1
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("headless=new");
		WebDriver driver =new ChromeDriver(option); //open the browser 
		
		//Approach-2
		
//	   ChromeOptions option =new ChromeOptions();
//       option.addArguments("--headless=new");
//       WebDriver driver= WebDriverManager.chromedriver().capabilities(option).create();
          				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //pass the url
				
				Thread.sleep(3000);
				driver.findElement(By.name("username")).sendKeys("Admin");
				
				Thread.sleep(3000);
				driver.findElement(By.name("password")).sendKeys("admin123");
				
				Thread.sleep(3000);
				driver.findElement(By.className("oxd-button")).click();
				
				
			String act_value =	driver.getTitle(); //string value
			
			String exp_value="OrangeHRM";
			
			if(act_value.equals(exp_value))
			{
				System.out.println("Test is Passed");
			}
			else
			{
				System.out.println("Test is Failed");
			}
					
		   driver.close(); //close the browser
			
			}

	}


