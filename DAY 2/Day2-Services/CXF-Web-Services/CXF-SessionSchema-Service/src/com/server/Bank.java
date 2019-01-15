package com.server;

import javax.jws.WebService;

@WebService(name = "Bank", targetNamespace = "http://server.com/")
public interface Bank {

	double getBalance();

	double addAmount(double amount);

	double withdrawAmount(double amount);

}