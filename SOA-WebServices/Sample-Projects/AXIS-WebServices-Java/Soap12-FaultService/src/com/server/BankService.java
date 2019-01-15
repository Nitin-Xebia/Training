package com.server;

import javax.jws.WebService;



@WebService(targetNamespace = "http://server.com/", endpointInterface = "com.server.Bank", portName = "BankServicePort", serviceName = "BankServiceService")
public class BankService  implements Bank{
	 public User getUser(int id1) throws Exception{
		 System.out.println("Inside BankService getUser ");
		 if(id1 < 101)
			 throw new Exception("The user id must be above 101");
		 User obj = new User();
		 obj.setId(id1);
		 obj.setName("DefaultName");
		 obj.setBalance(1265.76);
		 Address location = new Address();
		 obj.setAddr(location);
		 location.setNumber(1367);
		 location.road = "Market Road";
		 return obj;
	 }
	  public boolean updateUser(User obj){
		  System.out.println("Inside BankService updateUser ");
		  System.out.println("User Name recd "+obj.getName());
		  System.out.println("User Id recd "+obj.getId());
		  System.out.println("User Balance recd "+obj.getBalance());
		  if(obj.getAddr()==null)
			  throw new AddressNotDefinedException("Address not found");
		  System.out.println("User Address location is "+obj.getAddr().road);
		  return true;		  
		  
	  }
}
