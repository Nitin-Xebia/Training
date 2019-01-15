package com.server;

public interface Bank {
	public User getUser(int id1) throws Exception;
	public boolean updateUser(User obj);
}
