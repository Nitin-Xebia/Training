/**
 * Bank.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.server;

public interface Bank extends java.rmi.Remote {
    public double getBalance() throws java.rmi.RemoteException;
    public double addAmount(double arg0) throws java.rmi.RemoteException;
    public double withdrawAmount(double arg0) throws java.rmi.RemoteException;
}
