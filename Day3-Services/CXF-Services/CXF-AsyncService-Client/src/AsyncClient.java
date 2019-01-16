 
 

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

public final class AsyncClient {

    private static final QName SERVICE_NAME 
        = new QName("http://server.com/", "AccountService");


    private AsyncClient() {
    } 

    public static void main(String args[]) throws Exception {
                 
         
        URL wsdlURL = AccountService.WSDL_LOCATION;
        System.out.println("The wsdl is "+wsdlURL);

        AccountService service = new AccountService(wsdlURL, SERVICE_NAME);
        /*ExecutorService executor = Executors.newFixedThreadPool(5);
        service.setExecutor(executor);*/
        
        IAccount port = service.getAccountPort();
        
        System.out.println("The synchronous client1 is starting.");
        
        
       //Regular synchronous call
        System.out.println("Regular synchronous invocation and wait for it..");
        
        int result = port.getDetails(100.67, "This is my second chance");
        
        System.out.println("The response recd after delayed blocking  "+result);
        
        // callback method
         
      /*  int respValue = 0; 
        MyAsyncHandler asyncHandler = new MyAsyncHandler();
        System.out.println("Invoking getDetails delayed using callback object...");
        Future<?> response = port.getDetailsAsync(113.45, "AsynServiceResponse", asyncHandler) ;
        
        int count = 1;
        while (!response.isDone()) {
        	count++;
        	System.out.println("Doing some work....");
        	System.out.println("Will get notification when response is there....");
            Thread.sleep(100);
            if(count > 15)
            	break;
        }  
        System.out.println("Now explicitly wait for the call back..");
        while(respValue ==0)
        respValue = asyncHandler.getResponse();
        
        System.out.println();
        System.out.println("Response received from Server through callback with: " + respValue);
        System.out.println("Main exit");*/
        
        //polling method by client to invoke  methods aynchronopusly
        
        /*System.out.println("Invoking getDetails delayed using polling...");
        
        Response<GetDetailsResponse> delayedResponse = port.getDetailsAsync(45.87, "MyDelayedResponse");
           
        while (!delayedResponse.isDone()) {
        	System.out.println("Doing some work while polling the server for response....");        	
            Thread.sleep(100);
            System.out.println("Will fetch the rersponse value when response is received....");
        }
        GetDetailsResponse reply = delayedResponse.get();
        System.out.println("Server responded through polling with: " + reply.getReturn());    

        System.exit(0); */

    }

}
