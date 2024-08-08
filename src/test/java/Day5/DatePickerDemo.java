package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		
		//approach--1 using 
		
		driver.switchTo().frame(0);
		
	//	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/15/2026");
		
		
		//approach--2  
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String year="2020";
		String month="May";
		String date="20";
		
		
		//selecting month and year.
		
		while(true)
		{
			
			String yr=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			String mon=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			
			if(year.equals(yr)  &&  month.equals(mon))
			{
				break;
			}
				
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click(); //past
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //future
		}

		
		//date
		
		List <WebElement> alldates=driver.findElements(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
		
//		for(WebElement dates:alldates) 
//		{
//			if (dates.getText().equals(date))
//			{
//				dates.click();
//				break;
//			}
//		}
		
		for(int i=0; i <alldates.size();i++)
		{
			if(alldates.get(i).getText().equals(date))
			{
				alldates.get(i).click();
				break;
			}
			
		}
		
		
		
	}

}
