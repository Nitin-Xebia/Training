import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

import com.server.User; 
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

//This program looks into the wsdl and generates  the proxy interface implementation to invoke the operation
//No need for stub classes on Client side,Needs the proxy interface on client side 


public class ServiceProxyClient {

	 
	public static void main(String[] args) throws ServiceException, MalformedURLException, RemoteException {
		
		String UrlWSDL = "http://localhost:8080/SimpleService/services/User?wsdl";
        String nameSpaceUri = "http://server.com";
        String serviceName = "UserService";
        String portName = "User";

        URL serviceUrl = new URL(UrlWSDL);
        QName serviecQName = new QName(nameSpaceUri, serviceName);
        ServiceFactory serviceFactory = ServiceFactory.newInstance();
        Service proxyService = serviceFactory.createService(serviceUrl,serviecQName);

         
        QName portQName = new QName(nameSpaceUri, portName);
       
        User myProxy = (User) proxyService.getPort(portQName,User.class);

        System.out.println("The service repsonse in ServiceProxyClient is  "+myProxy.readUserNumber());

	}

}
