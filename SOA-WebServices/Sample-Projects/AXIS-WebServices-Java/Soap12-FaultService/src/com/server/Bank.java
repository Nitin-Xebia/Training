package com.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "Bank", targetNamespace = "http://server.com/")
public interface Bank {
	@WebMethod(operationName = "getUser", action = "urn:GetUser")
	public User getUser(@WebParam(name = "arg0") int id1) throws Exception;
	@WebMethod(operationName = "updateUser", action = "urn:UpdateUser")
	public boolean updateUser(@WebParam(name = "arg0") User obj);
}
