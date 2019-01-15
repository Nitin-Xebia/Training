import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.utils.Options;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

//This program looks into the service url and dynamically invokes the speciffied opeartions
//No need for proxy interface  or Stub classes on client side 

public class DynamicClient {

	 
	public static void main(String[] args) throws RemoteException, ServiceException, MalformedURLException {
		   String endpoint = "http://localhost:8080/SimpleService/services/User";
		   
		   String method = "readUserNumber";
		   Service  service = new Service();
		   Call     call    = (Call) service.createCall();		   

		   call.setTargetEndpointAddress(new java.net.URL(endpoint) );
		   call.setOperationName(method);
		   //call.addParameter( "param1", XMLType.XSD_STRING, ParameterMode.IN );		   
		   call.setReturnType( XMLType.XSD_DOUBLE);	   
		    
          //Default return type ?
		   //Above call paarms should be specified if you want to get 
		   //other than string as return type
		   Double  ret = (Double) call.invoke( new Object [] {});
		   
		   System.out.println("Received result in DynamicClient : " + ret);


	}

}
