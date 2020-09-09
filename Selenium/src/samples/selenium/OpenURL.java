package samples.selenium;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenURL {

	public static void main(String[] args) throws InterruptedException {
		
		// updated relative path 
		System.setProperty("webdriver.chrome.driver", "./lib/browsers/chromedriver");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("http://www.facebook.com");
		Thread.sleep(10000);
		System.out.println("Completed Test");
		chromeDriver.close();
	
	}

}
