package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelDemo {

	
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	
	void setup(String br)
	{
		switch(br)
		{
		case "chrome":driver=new ChromeDriver();
		break;
		case "edge":driver=new EdgeDriver();
		break;
		case "firefox":driver=new FirefoxDriver();
		break;
		default: System.out.println("Invalid Browser");
		return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=1)
	void Logo() throws InterruptedException
	{
		Thread.sleep(3000);
		Boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		//Assert.assertTrue(logo);
		
		
		if(logo)
			Assert.assertTrue(true);
		else
			Assert.fail();
	}
	@Test(priority=2)
	void Login()
	{
        driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
				driver.findElement(By.className("oxd-button")).click();
		
		
	String act_value =	driver.getTitle(); //string value
	String exp_value="OrangeHRM";
	    Assert.assertEquals(act_value, exp_value);
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
}
