

import Files.PayLoad;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	
	public void PraseJSon()
	{
		JsonPath js = new JsonPath(PayLoad.ComplexJson());
		System.out.println(PayLoad.ComplexJson());
		int numberOfCourses = js.getInt("courses.size()");
		System.out.println("Number of Courses " + numberOfCourses);
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Total Amount " + totalAmount);
		String courseTitle = js.get("courses[0].title");
		
		System.out.println("Title of First Course="+courseTitle);
		
		System.out.println("Price of Course = " + js.get("courses[0].price"));
	}

}
