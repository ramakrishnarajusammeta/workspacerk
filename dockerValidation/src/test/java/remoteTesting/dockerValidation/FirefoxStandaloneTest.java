package remoteTesting.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class FirefoxStandaloneTest {
	
	public static void main(String[] args)
	{
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		
		cap.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS, true);
		URL url = null; 
		
		try {
			url = new URL("http://localhost:4445/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RemoteWebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		System.out.println("Completed");
	}

}
