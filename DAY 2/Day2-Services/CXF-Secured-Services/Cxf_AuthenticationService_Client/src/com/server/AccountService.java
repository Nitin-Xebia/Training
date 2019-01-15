package com.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.8
 * 2013-06-22T22:23:35.637+05:30
 * Generated source version: 2.6.8
 * 
 */
@WebServiceClient(name = "AccountService", 
                  wsdlLocation = "http://localhost:8080/Cxf_Basic_Authetication/services/AccountPort?wsdl",
                  targetNamespace = "http://server.com/") 
public class AccountService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.com/", "AccountService");
    public final static QName AccountPort = new QName("http://server.com/", "AccountPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/Cxf_Basic_Authetication/services/AccountPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AccountService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/Cxf_Basic_Authetication/services/AccountPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AccountService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AccountService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Account
     */
    @WebEndpoint(name = "AccountPort")
    public Account getAccountPort() {
        return super.getPort(AccountPort, Account.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Account
     */
    @WebEndpoint(name = "AccountPort")
    public Account getAccountPort(WebServiceFeature... features) {
        return super.getPort(AccountPort, Account.class, features);
    }

}
