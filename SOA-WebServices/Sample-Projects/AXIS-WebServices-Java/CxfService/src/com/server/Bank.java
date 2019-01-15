package com.server;

import javax.jws.WebService;

@WebService(name = "Bank", targetNamespace = "http://server.com/")
public interface Bank {

	int getBalance();

	void depositAmount(int amount);

	String getAccountName();

}