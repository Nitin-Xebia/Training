import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

 

//No cxf libraries are needed here..only the interface Bank 
//The Java 6 runtime supports theses jaxws runtime features
public class Service_ProxyClient {
    public static void main (String [] args)  throws Exception {
    	System.out.println("Service_ProxyClient.main()");

         // Create a Service instance based on
         // the location of the WSDL
         URL wsdlLocation = new URL ("http://localhost:8080/Soap12-FaultService/services/bankservice?wsdl");
         QName serviceName = new QName ("http://server.com/","BankServiceService");
         Service service = Service.create (wsdlLocation, serviceName);

         // Return a list of QNames from service endpoints
         System.out.println ("List of QNames of service endpoints : "+service);
         /*Iterator it = service.getPorts();
         while (it.hasNext ()) {
        	 QName port = (QName) it.next();
             System.out.println (" Name  " +port.getLocalPart() + " Namespace  "+port.getNamespaceURI());
         }*/

         // Generate the 'Bank' implementation proxy
         Bank proxy = service.getPort(Bank.class);
         System.out.println("The proxy is  "+proxy);
         User obj = proxy.getUser(123);
         
         System.out.println ("\nResponse from web service: ");
         System.out.println (" " + obj);    
          
         System.out.println("The User address is  "+obj.getAddr().getRoad());
 		 System.out.println("The User balance is  "+obj.getBalance());
 		
         
         
     }
}