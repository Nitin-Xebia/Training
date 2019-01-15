import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

 
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.customerservice.Customer;
import com.customerservice.CustomerService;
import com.customerservice.CustomerType;
import com.customerservice.NoSuchCustomerException;
 

//No cxf libraries are needed here..only the interface Account 
//The Java 6 runtime supports theses jaxws runtime features
public class CxfWsdlService_ProxyClient {
    public static void main (String [] args)  throws MalformedURLException, NoSuchCustomerException {
    	System.out.println("CxfService_ProxyClient.main()");

         // Create a Service instance based on
         // the location of the WSDL
         URL wsdlLocation = new URL ("http://localhost:8080/Cxf_WSDL_First/services/CustomerServicePort?wsdl");
         QName serviceName = new QName ("http://customerservice.com/","CustomerServiceService");
         Service service = Service.create (wsdlLocation, serviceName);

         // Return a list of QNames from service endpoints
         System.out.println ("List of QNames of service endpoints:");
         Iterator it = service.getPorts();
         while (it.hasNext ()) {
        	 QName port = (QName) it.next();
             System.out.println (" Name  " +port.getLocalPart() + " Namespace  "+port.getNamespaceURI());
         }

         // Generate the 'Account' implementation proxy
         CustomerService proxy = service.getPort (CustomerService.class);
         
         Customer customer = new Customer();
         customer.setCustomerId(111);
         customer.setName("Vijay");
         customer.setNumOrders(134);
         customer.setRevenue(10897);
         customer.setTest(new BigDecimal(123));
         customer.setType(CustomerType.BUSINESS);       
         
         
         proxy.updateCustomer(customer);
         
         List result = proxy.getCustomersByName("asoka");
         
         System.out.println ("\nResponse from web service: ");
         System.out.println (" " + result);
         System.out.println ("Size of Customer List " + result.size());
          
         
     }
}