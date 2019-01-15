package com.server;

import javax.jws.WebService;

 


@WebService(targetNamespace = "http://server.com/", endpointInterface = "com.server.IAccount", portName = "AccountPort", serviceName = "AccountService")
public class Account implements IAccount {
	
	public void update(String name)
	{
		System.out.println("Delayed Account.update() for "+name);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Account.update over..");
	}

	public int getDetails(double value, String data)
	{
		System.out.println("Delayed Account.getDetails() "+value + " "+data);
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Account.getDetails over..");
		return 100 + (int)value;
	}
	
	
}
