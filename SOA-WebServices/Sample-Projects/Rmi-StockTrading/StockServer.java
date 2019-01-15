 

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.rmi.server.UnicastRemoteObject;

 

public class StockServer extends UnicastRemoteObject  implements Stock
{
    double balance;

    public StockServer() throws RemoteException
    {
        super();
    }

   
    public double getStockCurrentPrice(String stockName) 
     {
        System.out.println("inside getStockCurrentPrice for "+stockName);
        //Connect to online DB and return the price..

       if(stockName.length() < 1)
        throw new RuntimeException("stockName not valid!");

       return stockName.length() + 100.45;

    }    
    public  double sellStock(String stockName,int quantity) 
     {
       System.out.println("inside sellStock  for "+quantity +"  of "+stockName);
        //Connect to online Trade DB and sell the stock at the current price..

      double amount = quantity * 100.45;
     
      balance+= amount;
      return amount;

}
    public  double buyStock(String stockName,int quantity) 
    {
     System.out.println("inside buyStock for "+quantity +"  of "+stockName);
        //Connect to online Trade DB and buy the stock at the current price..

      double amount = quantity * 100.45;
     
      balance-= amount;//subtract the amount from current user balance
      return amount;

}
    public  double getBalance(String userId) 
     {
     System.out.println("inside getBalance for "+userId);
        //Connect to online   DB and get the current balance..      
      if(userId.length() < 1)
        throw new RuntimeException("User id not valid!");
      return balance;
  }

      
}
