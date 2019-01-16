 
 

import java.io.File;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.xml.namespace.QName;
import javax.xml.ws.Response;

import com.server.AccountService;
import com.server.GetDetailsResponse;
import com.server.IAccount;

 /*The JAX-WS specification only addresses
asynchronous requests on the client side*/

public final class SyncClient {

    private static final QName SERVICE_NAME 
        = new QName("http://server.com/", "AccountService");


     
    public static void main(String args[]) throws Exception {
                 
         
    	 System.out.println("The synchronous client 2 is starting.");
         
        URL wsdlURL = AccountService.WSDL_LOCATION;
        System.out.println("The wsdl is "+wsdlURL);

        AccountService service = new AccountService(wsdlURL, SERVICE_NAME);
         
        
        IAccount port = service.getAccountPort();
        
       //Regular synchronous call
        System.out.println("Regular synchronous invocation and wait for it..");
        
        int result = port.getDetails(100.67, "This is by the sync client1 ");
        
        System.out.println("The response recd by second client after delayed blocking  "+result);
        
    }  
}
