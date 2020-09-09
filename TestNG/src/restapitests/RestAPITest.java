package restapitests;

import org.testng.annotations.Test;

public class RestAPITest {
	
	@Test 
	public void RESTLoginTest() {
		System.out.println("RESTLoginTest success");
	}


	@Test 
	public void RESTLogoutTest() {
		System.out.println("RESTLogoutTest success");
	}
	
	/*

	@Test (groups= {"SANITY"})
	public void RESTAdminOperationTest() {
		System.out.println("RESTAdminOperationTest success");
	}*/

}
