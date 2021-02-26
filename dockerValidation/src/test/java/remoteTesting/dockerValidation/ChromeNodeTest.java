package remoteTesting.dockerValidation;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeNodeTest {
	
	@Test 
	public void ChromeTest()
	{
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS, true);
		URL url = null; 
		
		try {
			url = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RemoteWebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		System.out.println("Completed");
	}

}
