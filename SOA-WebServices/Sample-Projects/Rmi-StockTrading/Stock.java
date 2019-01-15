 
import java.rmi.Remote; 
import java.rmi.RemoteException; 

public interface Stock extends Remote 
{ 
    double getStockCurrentPrice(String stockName) throws RemoteException; 
    double sellStock(String stockName,int quantity) throws RemoteException; 
    double buyStock(String stockName,int quantity) throws RemoteException; 
    double getBalance(String userId) throws RemoteException; 

}
