import java.io.*;
import javax.xml.ws.*;
import javax.xml.namespace.QName;
import javax.xml.ws.soap.*;
import javax.xml.soap.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.Source;
import java.net.*;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

//Only the Java6 runtime and no interface or cxf jars needed to run

public class XmlMessageDispatchClient {
	public static void main(String[] args) throws MalformedURLException {

		 
		String endpointAddress = "http://localhost:1080/Axis_WebService/services/Account"; // web
																							// service
																							// url
		QName serviceName = new QName("http://server.com",
				"AccountService");// service name
		// Create a dynamic Service instance
		Service service = Service.create(serviceName);

		// QName for Port As defined in wsdl.
		QName portName = new QName("http://server.com", "Account");

		// Add a port to the Service
		service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING,
				endpointAddress);

		//Build the xml soap message structure as part of request		 
		
		String xmlMessage = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +
				"<soapenv:Body><getData xmlns=\"http://server.com\"><data>This is my Message data</data></getData></soapenv:Body></soapenv:Envelope>";
 

		SOAPMessage xmlSoapMessage = null;
		try {
			// Create SOAPMessage Dispatch to dispatch request to webs ervice
			// port Name
			Dispatch<SOAPMessage> SmDispatch = service.createDispatch(portName,
					SOAPMessage.class, Service.Mode.MESSAGE);

			MessageFactory factory = MessageFactory.newInstance();

			StringReader reader = new StringReader(xmlMessage);

			StreamSource src = new StreamSource(reader);

			// Create a Soap Request Message
			xmlSoapMessage = factory.createMessage();
			// pass on the string data to message
			xmlSoapMessage.getSOAPPart().setContent((Source) src);
			xmlSoapMessage.saveChanges();

			System.out
					.println("\nInvoking the operation with Soap Request Message : ");
			System.out.println(xmlMessage);

			System.out.println("\n");

			SOAPMessage response = SmDispatch.invoke(xmlSoapMessage);// synchronous
																		// call..wait
																		// for
																		// the
																		// response

			Source xmlResponse = response.getSOAPPart().getContent();

			String xmlString = sourceToXMLString(xmlResponse);// Convert the
																// soap part to
																// xml format

			System.out.println("Received Soap xml response: ");
			System.out.println(xmlString);
			System.out.println("\n");
			// Find the index of "return" string and get the data inbetween

			String srch = "<getDataReturn>";
			int length = srch.length();
			int index1 = xmlString.lastIndexOf("<getDataReturn>");
			int index2 = xmlString.lastIndexOf("</getDataReturn>");
			String data = xmlString.substring(index1 + length, index2);
			System.out.println("Result received " + data);
		} catch (SOAPException e) {
			e.printStackTrace();
		}

	}

	// This is used to convert soap response part to string format
	private static String sourceToXMLString(Source result) {

		String xmlResult = null;
		try {
			TransformerFactory factory = TransformerFactory.newInstance();
			Transformer transformer = factory.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,
					"yes");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			OutputStream out = new ByteArrayOutputStream();
			StreamResult streamResult = new StreamResult();
			streamResult.setOutputStream(out);
			transformer.transform(result, streamResult);
			xmlResult = streamResult.getOutputStream().toString();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return xmlResult;
	}

}
