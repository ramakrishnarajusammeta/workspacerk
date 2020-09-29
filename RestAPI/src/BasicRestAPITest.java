import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import Files.PayLoad;
import Files.ReUsableMethods;
public class BasicRestAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().queryParam("key", "qaclick123").headers("Content-Type","application/json").body(PayLoad.AddPlace()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();		
		
		
		System.out.println("Response = " + response);
		JsonPath js = ReUsableMethods.rawToJSon(response);
		String place_id = js.getString("place_id");
		System.out.println("Place_ID="+place_id);
		
		// no header is required as there is no body for GET information
		response = given().queryParam("key", "qaclick123").queryParam("place_id", place_id)
				.when().post("maps/api/place/get/json").then().statusCode(200).extract().response().asString();
		JsonPath js1 = ReUsableMethods.rawToJSon(response);
		String address = js1.getString("address");
		System.out.println("Address="+address);
		
		
		
	}

}
