package com.server;

public class User   {
	
	 
	public String getUserName(int id)
	{
		return "User"+id;
	}
	
	 
	public double readUserNumber()
	{
		return 123456.8976;
	}
	
	 
	public int getUserIncome(String userName)
	{
		int res = userName.length() * 1000;
		return res;
	}

}
