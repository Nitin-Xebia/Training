
import java.util.Iterator;

import javax.xml.messaging.URLEndpoint; 
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

 


public class SoapXmlMessageClient {

	/**
	 * @param args
	 * @throws SOAPException 
	 */
	public static void main(String[] args) throws SOAPException {
		    SOAPConnectionFactory scFactory = SOAPConnectionFactory.newInstance();
	        SOAPConnection con = scFactory.createConnection();

	        MessageFactory factory = MessageFactory.newInstance();
	        SOAPMessage message = factory.createMessage();

	        SOAPPart soapPart = message.getSOAPPart();
	        SOAPEnvelope envelope = soapPart.getEnvelope();

	        SOAPHeader header = envelope.getHeader();
	        header.detachNode();
	        
	        SOAPBody body = envelope.getBody();           
	        
	        Name bodyName = envelope.createName("getData", "ns", "http://server.com");
	        SOAPBodyElement gltp = body.addBodyElement(bodyName);

	        Name name = envelope.createName("data","ns", "http://server.com");
	        SOAPElement symbol = gltp.addChildElement(name);
	        symbol.addTextNode("This is my message..");

	        
	        URLEndpoint endpoint = new URLEndpoint("http://localhost:1080/Axis_WebService/services/Account");
	        SOAPMessage response = con.call(message, endpoint);
	        con.close();

	        SOAPPart sp = response.getSOAPPart();
	        SOAPEnvelope se = sp.getEnvelope();
	        SOAPBody sb = se.getBody();
	        Iterator it = sb.getChildElements();
	        while (it.hasNext())
	        {
	            SOAPBodyElement bodyElement = (SOAPBodyElement) it.next();
	            //SOAPElement bodyElement = (SOAPElement) it.next();
		          
	            Iterator it2 = bodyElement.getChildElements();
	            while (it2.hasNext())
	            {
	                SOAPElement element2 = (SOAPElement) it2.next();
	                System.out.println(element2.getValue());
	            }
	        }   

	             

	             
	            System.out.printf ("");
	        
	    }

	 

}
