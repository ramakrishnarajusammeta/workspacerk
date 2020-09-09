package sampletestng;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Need to add TestNG libraries to use TestNG annotations, we have to run this class as 'Run as TestNG test'
// @Test (enabled = false) will not run the test.
// Can be converted to TestNG test which generates testng.xml

 
public class HelloTestNG {

	@Test
	public void HelloTest() {
		System.out.println("Hello to TestNG");
	}
	
	/*@Test
	public void AnotherHelloTest() {
		System.out.println("Hello to AnotherHelloTest");
	}
	
	@Test (groups= {"SANITY"})
	public void AdditonalTest() {
		System.out.println("Hello to AdditonalTest");
	}*/
	
	@BeforeTest
	public void BeforeHelloTest() {
		System.out.println("BeforeTest : Login Hello Test");
	}
	
	@AfterTest
	public void AfterHelloTest() {
		System.out.println("AfterTest : Logout  Hello Test");
	}
	
	@BeforeSuite
	public void BeforeHelloTestSuite() {
		System.out.println("BeforeSuite : LoginMasterAdmin");
	}
	
	@AfterSuite
	public void AfterHelloTestSuite() {
		System.out.println("AfterSuite : LogoutMasterAdmin");
	}
}
