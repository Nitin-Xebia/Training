 
package com.server;

import javax.jws.WebService;

@WebService(targetNamespace = "http://server.com/", portName = "AccountPort", serviceName = "AccountService")
public class Account  {	
	 
	public void update(int num,String data)
	{
		System.out.println("Account.update for  "+num +"  and  "+data);
	}

	 
	public String getName(int num)
	{
		System.out.println("Account getName for  "+num);
		return "User "+num;
	}
	public String processData(int data,double income)
	{
		System.out.println("Account.processData()");
		String result = "Income "+income + data;
		return result;
	}
}
