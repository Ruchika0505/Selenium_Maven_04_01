package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	ChromeDriver driver;
	
	@BeforeClass
	void setup()
	{
		
	 driver =new ChromeDriver();
	}
	@Test(priority=2, dataProvider="dp")
	void TestLogin(String email,String passwd) throws InterruptedException
	{
		
		driver.get("https://demo.nopcommerce.com/login?returnurl=%2F");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(passwd);
		
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp="nopCommerce demo store";
		
		String act=driver.getTitle();
		
		Assert.assertEquals(exp, act);
		
		
	}
	
	@AfterClass
	void tearup()
	{
		driver.close();
	}
	
	@DataProvider(name="dp",indices= {0,1})
	String[][] loginData()
	{
		String data[][]= { {"abc@gmail","test"},
			            	{"john@gmail.com","test12"},
			            	{"mk@gmail.com","hello"}
			            	
		                   };
				
				return data;
				
						
		
	}
}
