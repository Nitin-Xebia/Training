
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

// CXF REST Service Client  

public class Client {
	private URL url;

	private HttpURLConnection conn;

	/*Client() {
		try {
			url = new URL("http://localhost:8090/CXF-Student-Service/rest/updateName");
			conn = (HttpURLConnection) url.openConnection();
			System.out.println("The connection is "+conn);
			conn.setRequestProperty("Content-Type", "application/json");
		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		}*/

	 
	
	private void connect() throws IOException
	{
		url = new URL("http://localhost:8090/CXF-REST-Service/rest/updateName");
		conn = (HttpURLConnection) url.openConnection();
		//System.out.println("The connection is "+conn);
		conn.setRequestProperty("Content-Type", "application/json");
		//conn.setAllowUserInteraction(true);
		 
	}

	public static void main(String[] args) throws IOException {
       System.out.println("The Client is started..");
		Client client1 = new Client();
		Client client2 = new Client();
		
		
		String first = "{\"Student\":{\"name\":\"Baba\"}}";

		String second = "{\"Student\":{\"name\":\"Mohan\"}}";

		client1.connect();
		
		 
		
		System.out.println("\nThe Client is updating..");
		 
		client1.upadatName(first);
		
		 
		System.out.println("\nThe Client is reading..");		
		 

		client1.readName();
		
		 

		/*
		 * client2.readName();
		 * 
		 * client2.upadatName(second);
		 * 
		 * client1.readName(); client2.readName();
		 */

	}

	public void upadatName(String data) throws IOException {
		// URL url = new
		// URL("http://localhost:8080/CXF-REST-Service/rest/updateName");
		//HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		//conn.setRequestProperty("Content-Type", "application/json");

		OutputStream os = conn.getOutputStream();
		os.write(data.getBytes());
		os.flush();

		Scanner scanner;
		String response;
		if (conn.getResponseCode() != 200) {
			scanner = new Scanner(conn.getErrorStream());
			response = "Error From Server \n\n";
		} else {
			scanner = new Scanner(conn.getInputStream());
			response = "Response From Server for Post request\n\n";
		}
		scanner.useDelimiter("\\Z");
		System.out.println(response + scanner.next());
		scanner.close();
		 
		conn.disconnect();

	}

	public void readName() throws IOException {
		// use get method
		 
		conn = (HttpURLConnection) url.openConnection();
		
		//conn.setDoOutput(true);
		conn.setRequestMethod("GET");
		conn.connect();
		
		 
		//conn.connect();
		//conn.setRequestProperty("Content-Type", "application/json");

		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		String line = reader.readLine();
		System.out.println("The service response object read");
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		conn.disconnect();
	}
}