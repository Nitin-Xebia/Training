package com.server;

public class BankProxy implements com.server.Bank {
  private String _endpoint = null;
  private com.server.Bank bank = null;
  
  public BankProxy() {
    _initBankProxy();
  }
  
  public BankProxy(String endpoint) {
    _endpoint = endpoint;
    _initBankProxy();
  }
  
  private void _initBankProxy() {
    try {
      bank = (new com.server.AccountServiceLocator()).getAccountPort();
      if (bank != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bank)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bank)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bank != null)
      ((javax.xml.rpc.Stub)bank)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.server.Bank getBank() {
    if (bank == null)
      _initBankProxy();
    return bank;
  }
  
  public double getBalance() throws java.rmi.RemoteException{
    if (bank == null)
      _initBankProxy();
    return bank.getBalance();
  }
  
  public double addAmount(double arg0) throws java.rmi.RemoteException{
    if (bank == null)
      _initBankProxy();
    return bank.addAmount(arg0);
  }
  
  public double withdrawAmount(double arg0) throws java.rmi.RemoteException{
    if (bank == null)
      _initBankProxy();
    return bank.withdrawAmount(arg0);
  }
  
  
}