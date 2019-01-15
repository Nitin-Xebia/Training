import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

 


public class REST_Java_Client {

	 
	public static void main(String[] args) throws IOException {
		  System.out.println("*** REST service Java Client **");
		  
		  URL getUrl = new URL("http://localhost:8090/First-REST/services/message/userData");
	 
	      HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();	      
	      
	      // Get json structure of customer object from the service
	     
	      connection = (HttpURLConnection) getUrl.openConnection();
	      connection.setRequestMethod("GET");       
	      connection.setRequestProperty("Accept", "application/json");
	    
	      System.out.println("The response code is  "+connection.getResponseCode());
	       
	      System.out.println("The response content type is "+connection.getContentType());
	      
	      		   
	      BufferedReader reader = new BufferedReader(new
	              InputStreamReader(connection.getInputStream()));
	      System.out.println("\nThe JSON format of customer sent by server...\n");

	      
	      String line = reader.readLine();
	      while (line != null)
	      {
	         System.out.println(line);
	         line = reader.readLine();
	      }
	      connection.disconnect();  
	}
}
	       

	       
	      
	      
	       
	      
 
