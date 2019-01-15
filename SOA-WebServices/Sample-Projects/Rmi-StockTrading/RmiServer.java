
import java.rmi.*;

class RmiServer 
{
	public static void main(String args[]) { 

        
		System.out.println("RmiServer starting");
        try
		{ 
	     StockServer obj = new StockServer(); 
	    // Bind this object instance to the name "myStock" in RmiRegistry
	     Naming.rebind("rmi://localhost/myStock", obj); 
	     System.out.println("StockServer bound in registry"); 
        } 
		catch (Exception e)
		{ 
	     System.out.println("RmiServer err: " + e.getMessage()); 
	    e.printStackTrace(); 
        } 
    } 
}
