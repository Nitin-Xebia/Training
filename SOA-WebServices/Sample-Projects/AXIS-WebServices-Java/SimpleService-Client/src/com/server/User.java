/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.server;

public interface User extends java.rmi.Remote {
    public java.lang.String getUserName(int id) throws java.rmi.RemoteException;
    public double readUserNumber() throws java.rmi.RemoteException;
    public int getUserIncome(java.lang.String userName) throws java.rmi.RemoteException;
}
