package com.server;

import javax.jws.WebService;

@WebService(name = "IAccount", targetNamespace = "http://server.com/")
public interface IAccount {

	public void update(String name);

	public int getDetails(double value, String data);

}