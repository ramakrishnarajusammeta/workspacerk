package samples.selenium;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenURL {

	public static void main(String[] args) throws InterruptedException {
		
		// updated relative path - modified 13July2022
		// final update 13July2022-2nd time
		System.setProperty("webdriver.chrome.driver", "./lib/browsers/chromedriver");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("http://www.facebook.com");
		Thread.sleep(10000);
		System.out.println("Completed Test");
		chromeDriver.close();
	
	}

}
