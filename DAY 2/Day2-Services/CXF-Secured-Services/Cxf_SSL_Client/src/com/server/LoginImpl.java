
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
 * 2013-06-23T03:04:14.971+05:30
 * Generated source version: 2.6.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "Login",
                      portName = "LoginPort",
                      targetNamespace = "http://server.com/",
                      wsdlLocation = "http://localhost:8080/Cxf_SSL_Service/services/LoginPort?wsdl",
                      endpointInterface = "com.server.Login")
                      
public class LoginImpl implements Login {

    private static final Logger LOG = Logger.getLogger(LoginImpl.class.getName());

    /* (non-Javadoc)
     * @see com.server.Login#processData(java.lang.String  arg0 ,)int  arg1 ,)double  arg2 )*
     */
    public java.lang.String processData(java.lang.String arg0,int arg1,double arg2) { 
        LOG.info("Executing operation processData");
        System.out.println(arg0);
        System.out.println(arg1);
        System.out.println(arg2);
        try {
            java.lang.String _return = "_return-699828192";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.server.Login#processLogin(java.lang.String  arg0 ,)java.lang.String  arg1 )*
     */
    public boolean processLogin(java.lang.String arg0,java.lang.String arg1) { 
        LOG.info("Executing operation processLogin");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
