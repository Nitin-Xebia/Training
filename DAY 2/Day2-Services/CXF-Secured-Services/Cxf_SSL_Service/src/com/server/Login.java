package com.server;

import javax.jws.WebService;
/*
 * <!-- Add following configuration in web.xml for running the service only 
 * in SSl mode and NOT in normal http protocol mode
    -->
  <security-constraint>
        <web-resource-collection>
            <web-resource-name>Login</web-resource-name>
            <url-pattern>/services/LoginPort</url-pattern>
            <http-method>GET</http-method>
            <http-method>POST</http-method>
        </web-resource-collection>
        <user-data-constraint>
            <transport-guarantee>CONFIDENTIAL</transport-guarantee>
        </user-data-constraint>
    </security-constraint>  
    To eanble ssl add the foloowing entries in your tomcat servers conf/server.xml
    //Comment existong 8080 line and add the follwoeing next line
    <Connector connectionTimeout="20000" port="8080" protocol="HTTP/1.1"/>
    <Connector SSLEnabled="true" acceptCount="100" clientAuth="false" debug="0" disableUploadTimeout="true" enableLookups="true" keystoreFile="c:/keys.Data" keystorePass="myData" maxSpareThreads="75" maxThreads="150" minSpareThreads="25" port="8443" protocol="org.apache.coyote.http11.Http11Protocol" scheme="https" secure="true" sslProtocol="TLS"/>

keytool -genkey -alias tomcat -keyalg RSA -keystore d:/keys.data -keysize 2048

 keytool command options to genetraye key
 keytool -genkey -alias tomcat -keyalg RSA -keystore d:/keys.data -keysize 2048


  
 */

 

@WebService(targetNamespace = "http://server.com/", portName = "LoginPort", serviceName = "Login")
public class Login {
 public boolean processLogin(String user, String pwd){
	System.out.println("Inside processLogin...");
	 String id = user;
	 String password = pwd;
	 if((id.equals("DON"))&(password.equals("Mushkil")) )
		 return true;
		 else return false;
			 
 }
 public String processData(String name,int number,double bal){
	 System.out.println("Inside processData...");
	 return name + number + bal;
 }
}
