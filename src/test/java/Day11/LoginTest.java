package Day11;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
 
	WebDriver driver;
 //   LoginPage lp;
	LoginPage2 lp;
	
	@BeforeClass
	
   void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	@Test(priority=2)

	void TestLogin()
	{
	
		lp.setUserName("Admin");
		lp.setPasswdName("admin123");
		lp.clicksumit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@Test(priority=1)
	
	void Logo_Check()
	{
		//lp=new LoginPage(driver); 
		
		
		lp=new LoginPage2(driver); //object
		
		
		Assert.assertEquals(lp.checkLogo(),true);
	}
	@AfterClass
	
	void tearDown()
	{
		driver.close();
	}
}
