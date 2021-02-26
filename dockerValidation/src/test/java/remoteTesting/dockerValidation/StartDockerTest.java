package remoteTesting.dockerValidation;

import java.io.IOException;

import org.testng.annotations.BeforeTest;



public class StartDockerTest {

	@BeforeTest
	public void StartFileTest() {
	try {
			
			String[] cmd = { "sh","/Users/rs683045/git/workspace-rk/dockerValidation/dockerup.sh" };
			Runtime.getRuntime().exec(cmd);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
