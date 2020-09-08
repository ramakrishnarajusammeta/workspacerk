package samples.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURL {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rs683045/eclipse-workspace/extLibs/browsers/chromedriver");
		System.setProperty("webdriver.gecko.driver",  "/Users/rs683045/eclipse-workspace/extLibs/browsers/geckodriver");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		FirefoxDriver firefoxDriver = new FirefoxDriver();
		
		chromeDriver.get("http://seleniumhq.org");
		firefoxDriver.get("https://www.facebook.com");

		Thread.sleep(10000);
		System.out.println("Completed Test");
		chromeDriver.close();
		firefoxDriver.close();
		
		
		
		

	}

}
