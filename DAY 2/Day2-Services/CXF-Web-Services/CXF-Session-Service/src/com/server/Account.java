package com.server;

import javax.jws.WebService;

@WebService(targetNamespace = "http://server.com/", endpointInterface = "com.server.Bank", portName = "AccountPort", serviceName = "AccountService")
public class Account implements Bank {

	public Account()
	{
		System.out.println("Account.constructor()");
		balance = 1000;
	}
	
	 private double balance;
	 public double getBalance()
	 {
		 return balance;
	 }
	 
	 public double addAmount(double amount)
	 {
		 balance+= amount;
		 return balance;
	 }
	 public double withdrawAmount(double amount)
	 {
		 if(amount > balance)
			 throw new RuntimeException("The amount is not available");
		 balance-= amount;
		 return balance;
	 }
	 
	 
}
