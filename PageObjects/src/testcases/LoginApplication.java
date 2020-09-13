package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepo.RediffLoginPage;

public class LoginApplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "./lib/browsers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage rd = new RediffLoginPage(driver);
		
		rd.UserName().sendKeys("ramakrishnaraju.sammeta");
		rd.Password().sendKeys("dost1234");
		
		
	}
	
}
