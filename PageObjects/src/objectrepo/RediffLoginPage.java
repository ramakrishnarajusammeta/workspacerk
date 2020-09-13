package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver) {
		
		this.driver = driver;		
	}
	
	
	By username  = By.xpath("//*[@id='login1']");
	By password = By.xpath("//*[@id='password']");
	
	public WebElement UserName()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}

}
