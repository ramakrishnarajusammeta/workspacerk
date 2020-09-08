package samples.selenium;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenURL {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rs683045/git/workspace-rk/Selenium/lib/browsers/chromedriver");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("http://www.facebook.com");
		Thread.sleep(10000);
		System.out.println("Completed Test");
		chromeDriver.close();
		
		

	}

}
