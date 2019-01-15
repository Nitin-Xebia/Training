
package com.server;


import javax.jws.WebService;

@WebService(targetNamespace = "http://server.com/", endpointInterface = "com.server.Bank", portName = "AccountPort", serviceName = "AccountService")
public class Account implements Bank {
	
	private int balance;

	public int getBalance() {
		return balance;
	}
	
	
	 public void depositAmount(int amount)
	 {
		 balance+=amount;
	 }
	 
	 public String getAccountName()
	 {
		 return "Ashok Gupta";
	 }
}
