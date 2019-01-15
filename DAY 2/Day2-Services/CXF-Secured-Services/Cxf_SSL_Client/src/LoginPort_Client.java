 

 
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.io.*;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.server.Login;

 

 
public final class LoginPort_Client {

	

	static {
	    //for localhost testing only
	    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
	    new javax.net.ssl.HostnameVerifier(){
 
	        public boolean verify(String hostname,
	                javax.net.ssl.SSLSession sslSession) {
	        	System.out.println("Verify hostname.. for  "+hostname);
	            if (hostname.equals("localhost")) {
	                return true;
	            }
	            return false;
	        }
	    });
	}
	public static void main(String args[]) throws java.lang.Exception {

		  

		System.setProperty("javax.net.ssl.trustStore", "d:/keys.data");
		System.setProperty("javax.net.ssl.trustStorePassword", "myData");

		URL https_url = new URL("https://localhost:1080/Cxf_SSL_Service/services/LoginPort?wsdl");
	 	 
		QName SERVICE_NAME = new QName("http://server.com/","Login");
 
        Service service = Service.create(https_url, SERVICE_NAME);
		 	
		Login port = service.getPort(Login.class);
		
		//Login ss = new Login(wsdlURL, SERVICE_NAME);
		//LoginPortType port = ss.getLoginPort();

		 

		{
			System.out.println("Invoking processData...");
			java.lang.String _processData_name = "_processData_name442320982";
			int _processData_number = -1038665047;
			double _processData_bal = 0.12386985149256513;
			java.lang.String _processData__return = port.processData(_processData_name, _processData_number, _processData_bal);
			System.out.println("processData.result=" + _processData__return);

		}
		{
			System.out.println("Invoking processLogin...");
			java.lang.String _processLogin_user = "_processLogin_user337433030";
			java.lang.String _processLogin_pwd = "_processLogin_pwd562476151";
			boolean _processLogin__return = port.processLogin(
					_processLogin_user, _processLogin_pwd);
			System.out.println("processLogin.result=" + _processLogin__return);

		}

		System.exit(0);
		 

	}

	 

	  

	 

	 
	 

}
