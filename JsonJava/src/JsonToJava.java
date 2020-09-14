import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
	
	public static void main(String args[]) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:oracle:thin:@10.131.158.232:1521:orcl","test","dost1234");
			
			//select *from customerinfo where purchaseddate=to_date(sysdate,'dd/mm/yy');
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select *from CUSTOMERINFO where purchaseddate=to_date(sysdate,'dd/mm/yy')");
			ArrayList <CustomerDetails>  customerDetails = new ArrayList <CustomerDetails>();
			CustomerDetails c = new CustomerDetails();
			
			while (rs.next()) {
				c.setCourseName(rs.getString(1));
				c.setPurchased(rs.getString(2));
				c.setAmount(rs.getString(3));
				c.setLocation(rs.getString(4));
				
				customerDetails.add(c);
			}
			
			for (int i=0; i<customerDetails.size(); i++) {
				ObjectMapper oj = new ObjectMapper();
				oj.writeValue(new File("./customerInfo"+i+".json"), customerDetails.get(i));
			}
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
