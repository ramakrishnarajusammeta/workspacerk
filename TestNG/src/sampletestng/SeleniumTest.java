package sampletestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	//@Parameters({"username","password"})
	
	
	@Test(dataProvider="getData")
	public void LoginTest(String UserName, String Password) {
		System.out.println("Username=" + UserName);
		System.out.println("Password=" + Password);
		System.out.println("SeleniumTest:LoginTest success");
	}

	/*@Test
	public void LogoutTest() {
		System.out.println("SeleniumTest:Logout success");
	}
	

	@Test
	public void AdminOperationTest1() {
		System.out.println("SeleniumTest:AdminOperationTest success");
	}
	*/
	
	@DataProvider
	public Object[][] getData() {
		Object data[][] = new Object[3][3];
		
		// 1st set
		data[0][0] = "firstsetUserName";
		data[0][1] = "firstsetPassword";
		
		// 2nd set
		data[1][0] = "secondsetUserName";
		data[1][1] = "secondsetPassword";
		
		// 3rd set
		data[2][0] = "thirdsetUserName";
		data[2][1] = "thirdsetPassword";
		
		return data;
	}
	
}
