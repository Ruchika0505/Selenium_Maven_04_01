package Day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//POM Class--Page Factory
public class LoginPage2 {

	WebDriver driver; //global
	//Constructor
	
	LoginPage2(WebDriver driver) //chorme,edge,
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //use for creating POM classes; here we dnt use findelement();
	
	}
	
	//locate Elements
	
	@FindBy(css="img[alt='company-branding']")
	WebElement logo;
	
	
	@FindBy(name="username")
	WebElement user_name;
	
//	@FindBy(how=How.NAME, using="username")
//	WebElement user_name;
	
	@FindBy(name="password")
	WebElement pass_word;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickbutton;
	
	
	
	//locate Element
//	By logo=By.cssSelector("img[alt='company-branding']");
//	By user_name =By.name("username");
//	By pass_word=By.name("password");
//	By clickbutton=By.xpath("//button[@type='submit']");
	
	//actions
	
	public void setUserName(String username)
	{
		user_name.sendKeys(username);
	
	}
	 
	public void setPasswdName(String password)
	{
		pass_word.sendKeys(password);
	}
	
	public void clicksumit()
	{
		clickbutton.click();
	}
	
	public Boolean checkLogo()
	{
		Boolean status =logo.isDisplayed();
		return status;
	}
	
	
	
}
