package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//How to select single checkbox.
		
		
		//driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
		
	//	How to select multiple checkboxes
		
List  <WebElement>	checkboxes=	driver.findElements(By.xpath("//*[@class='form-check-input'and @type='checkbox']"));
		
//		for(WebElement chk:checkboxes)
//		{
//			chk.click();
//		}
//		
//		for(int i=0;i<checkboxes.size();i++)
//		{
//			
//			checkboxes.get(i).click();
//			
//					}
	//How to select last three checkboxes	
//for(int i=4;i<checkboxes.size();i++)
//{
//	
//	checkboxes.get(i).click();
//	
//			}

////How to select first three checkboxes	
		

for(int i=0;i<3;i++)
{
	
	checkboxes.get(i).click();
	
			}

Thread.sleep(5000);

for(int i=0;i< checkboxes.size();i++)
{
	
	if(checkboxes.get(i).isSelected())
	{
	checkboxes.get(i).click();
	}
			}

	}

}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


