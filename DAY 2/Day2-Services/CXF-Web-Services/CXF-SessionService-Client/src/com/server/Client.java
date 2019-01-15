package com.server;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Client {

	public static void main(String[] args) throws RemoteException, ServiceException {
		AccountServiceLocator service = new AccountServiceLocator();
		Bank obj = service.getAccountPort();
		double amount = obj.addAmount(1400);
		System.out.println("First Balance after amount added  "+amount);
		amount = obj.addAmount(3000);
		System.out.println("Balance after amount added next  "+amount);
		amount = obj.getBalance();
		System.out.println("Balance read is   "+amount);
		amount = obj.withdrawAmount(2500);
		System.out.println("Balance after amount withdrawn   "+amount);
		amount = obj.getBalance();
		System.out.println("Balance read final is   "+amount);
		

	}

}
