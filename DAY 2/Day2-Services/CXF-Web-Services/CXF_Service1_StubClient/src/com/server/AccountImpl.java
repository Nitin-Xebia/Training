
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.server;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.8
 * 2013-06-21T12:19:30.369+05:30
 * Generated source version: 2.6.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "AccountService",
                      portName = "AccountPort",
                      targetNamespace = "http://server.com/",
                      wsdlLocation = "http://localhost:8080/CXF_service1/services/AccountPort?wsdl",
                      endpointInterface = "com.server.Account")
                      
public class AccountImpl implements Account {

    private static final Logger LOG = Logger.getLogger(AccountImpl.class.getName());

    /* (non-Javadoc)
     * @see com.server.Account#update(java.lang.String  arg0 )*
     */
    public void update(java.lang.String arg0) { 
        LOG.info("Executing operation update");
        System.out.println(arg0);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.server.Account#getDetails(double  arg0 ,)java.lang.String  arg1 )*
     */
    public int getDetails(double arg0,java.lang.String arg1) { 
        LOG.info("Executing operation getDetails");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            int _return = 1678555909;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
