import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.text.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonToJava {
	
	public static void main(String args[]) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:oracle:thin:@10.131.158.232:1521:orcl","test","dost1234");
			
			//select *from customerinfo where purchaseddate=to_date(sysdate,'dd/mm/yy');
			
			Statement st = conn.createStatement();
			//ResultSet rs = st.executeQuery("select *from CUSTOMERINFO where purchaseddate=to_date(sysdate-1,'dd/mm/yy')");
			ResultSet rs = st.executeQuery("select *from CUSTOMERINFO");
			
			
				
			ArrayList <CustomerDetails>  customerDetails = new ArrayList <CustomerDetails>();
			
			
			while (rs.next()) {
				CustomerDetails c = new CustomerDetails();
				c.setCourseName(rs.getString(1));
				c.setPurchased(rs.getString(2));
				c.setAmount(rs.getString(3));
				c.setLocation(rs.getString(4));
				
				customerDetails.add(c);
				System.out.println(c.getCourseName());
				
			}
			
			for (int i=0; i<customerDetails.size(); i++) {
				ObjectMapper oj = new ObjectMapper();
				// Create JSON File from Java Object
				oj.writeValue(new File("./customerInfo"+i+".json"), customerDetails.get(i));
				System.out.println(customerDetails.get(i).getCourseName());
			}
			
			JSONArray ja = new JSONArray();
			for (int i=0; i<customerDetails.size(); i++) {
				//ja.add(index, element);
				// create JSON String from Java Object (GSon)
				
				Gson g = new Gson();
				String jsonString = g.toJson(customerDetails.get(i));
				ja.add(jsonString);
				
			}
			// To create into one file
			JSONObject jo = new JSONObject();			
			jo.put("data", ja);
			System.out.println(jo.toJSONString());
			
			String unEscapedString = StringEscapeUtils.unescapeJava(jo.toJSONString());
			System.out.println(unEscapedString);
			
			String string1 = unEscapedString.replace("}\"", "}");
			String finalString = string1.replace("\"{", "{");
			System.out.println(finalString);
			
			FileWriter file = new FileWriter("./CustomerInfo.json");
			file.write(finalString);
			file.close();
			
			// Reading data from json file and copy into java object
			ObjectMapper oj = new ObjectMapper();
			CustomerDetails cd = oj.readValue(new File("./customerinfo1.json"), CustomerDetails.class);
			System.out.println(cd.getCourseName());
			
			
			System.out.println("Completed");
			
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
