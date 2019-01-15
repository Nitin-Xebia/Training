 
 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.test.classes.Employee;

 
 
public class XML_UnMarshaler {
    
    // This  application demonstrates how to unmarshal an instance
    // document into a Java content tree and access data contained within it.
    
    public static void main( String[] args ) {
        try {
            // create a JAXBContext capable of handling classes generated into the package
            
            JAXBContext jc = JAXBContext.newInstance( "com.test.classes" );
            
            // create an Unmarshaller
            Unmarshaller u = jc.createUnmarshaller();            
            
                
            Employee obj = (Employee)u.unmarshal( new FileInputStream( "employee.xml") );
	    
            // examine some of the content in the PurchaseOrder
            System.out.println( "Employee id  is "+obj.getId());
            
            System.out.println( "Employee location is   is "+obj.getAddress().getArea().getRoadName());
             
            
        } catch( JAXBException je ) {
            je.printStackTrace();
        } catch( IOException ioe ) {
            ioe.printStackTrace();
        }
    }
    
    
    
}
