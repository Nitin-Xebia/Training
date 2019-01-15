 
import java.applet.Applet; 
import java.awt.Graphics; 
import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.rmi.*;

public class StockClient
{ 
 
    // "RemoteStock" is the Stock variable identifier client we'll use to refer 
    // to the remote object that implements the "Stock"  interface 
     //Try running the program on remote machine without the stub component

     public static void main(String args[]) 
	 { 
	  
	 Stock remoteStock= null;
	 String shareName = "Wipro";
       String shareBuy = "IBM";

       double amount;
       String id="Vijay";
       int sellQuantity=100;
       int buyQuantity =  45;
	 try
	{ 
             Object obj = Naming.lookup("rmi://LocalHost/myStock"); 
             //Type cast the remote object to Stock Type
	       remoteStock = (Stock )obj;
		 System.out.println("\nThe remote object is  "+remoteStock);
            // double price = remoteStock.getStockCurrentPrice("");
double price = remoteStock.getStockCurrentPrice(shareName);

		 System.out.println("\nThe price of stock from Stock Server is "+price);

             double amount1 = remoteStock.sellStock(shareName,sellQuantity);

		 System.out.println("\nThe amount returned after selling the stock from Stock Server is "+amount1);

             double amount2 = remoteStock.buyStock(shareBuy,buyQuantity);

		 System.out.println("\nThe amount updated after buying of stock from Stock Server is "+amount2);


      //   double finalAmount = remoteStock.getBalance(id);

  double finalAmount = remoteStock.getBalance("");


		 System.out.println("\nThe final amount received from Stock Server is "+finalAmount);


	} 
	catch (Exception e)
	{ 
	    System.out.println("StockClient exception: " + 
				    e.getMessage()); 
	     
	} 
    } 

     
}
