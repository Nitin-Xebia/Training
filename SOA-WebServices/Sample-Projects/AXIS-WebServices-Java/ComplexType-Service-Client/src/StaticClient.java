import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.server.Address;
import com.server.BankService;
import com.server.BankServiceService;
import com.server.BankServiceServiceLocator;
import com.server.User;

 


public class StaticClient {

	/**
	 * @param args
	 * @throws ServiceException 
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws ServiceException, RemoteException {
		// TODO Auto-generated method stub
		BankServiceService service = new BankServiceServiceLocator();
		
		//service.setAccountEndpointAddress("http://localhost:8080/ComplexTypeService/services/BankService?wsdl");
		BankService bs = service.getBankService();
		
		
		//User obj1 = bs.getUser(12);
		User obj = bs.getUser(111);	
		 
		
		System.out.println("The User address is  "+obj.getAddr().getRoad());
		System.out.println("The User balance is  "+obj.getBalance());
		
		User current = new User();
		Address adr = new Address();
		adr.setRoad("M G Road");
		adr.setNumber(2345);
		
		current.setId(123);
		current.setName("Vijay");
		current.setBalance(3456.09);
		//current.setAddr(adr);
		
		
		boolean flag = bs.updateUser(current);
		System.out.println("The User update is  "+flag);
		
		
		
		

	}

}
