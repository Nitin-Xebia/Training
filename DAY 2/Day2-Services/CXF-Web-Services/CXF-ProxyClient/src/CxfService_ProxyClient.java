import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.server.Account;

 

//No cxf libraries are needed here..only the interface Account 
//The Java 6 runtime supports theses jaxws runtime features
public class CxfService_ProxyClient {
    public static void main (String [] args)  throws MalformedURLException {
    	System.out.println("CxfService_ProxyClient.main()");

         // Create a Service instance based on
         // the location of the WSDL
         URL wsdlLocation = new URL ("http://localhost:9090/CXF_service1/services/AccountPort?wsdl");
         QName serviceName = new QName ("http://server.com/","AccountService");
         Service service = Service.create (wsdlLocation, serviceName);

         // Return a list of QNames from service endpoints
         System.out.println ("List of QNames of service endpoints:");
         Iterator it = service.getPorts();
         while (it.hasNext ()) {
        	 QName port = (QName) it.next();
             System.out.println (" Name  " +port.getLocalPart() + " Namespace  "+port.getNamespaceURI());
         }

         // Generate the 'Account' implementation proxy
         Account proxy = service.getPort (Account.class);
         System.out.println("The proxy is  "+proxy);
         int result = proxy.getDetails(12.45, "User");
         
         System.out.println ("\nResponse from web service: ");
         System.out.println (" " + result);
         proxy.update("Asoka");
         
         
     }
}