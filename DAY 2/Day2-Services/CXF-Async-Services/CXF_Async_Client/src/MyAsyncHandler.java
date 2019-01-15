 

 

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.server.GetDetailsResponse;

 


public class MyAsyncHandler implements AsyncHandler<GetDetailsResponse> {
    
    private GetDetailsResponse reply;

    public void handleResponse(Response<GetDetailsResponse> response) {
        try {
            System.out.println("MyAsyncHandler handleResponse called");
            reply = response.get();
            System.out.println("The response object received in MyAsyncHandler handleResponse is  "+reply);
            System.out.println("The response value received in MyAsyncHandler handleResponse is  "+reply.getReturn());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int getResponse() {
    	if(reply==null)
    		 return 0;
    	else
    		return reply.getReturn();
    }
    
}
