package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffLoginPage {
	
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver) {
		
		this.driver = driver;	
		PageFactory.initElements(driver, this);
		
	}
	
	
	/*By username  = By.xpath("//*[@id='login1']");
	By password = By.xpath("//*[@id='password']");*/
	
	@FindBy(xpath="//*[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	public WebElement UserName()
	{
		//return driver.findElement(username);
		return username;
	}
	
	public WebElement Password()
	{
		//return driver.findElement(password);
		return password;
	}
	

}
