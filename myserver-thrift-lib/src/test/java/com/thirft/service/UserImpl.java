package com.thirft.service;

import org.apache.thrift.TException;

public class UserImpl implements UserService.Iface {

	public UserImpl() {
	}

	@Override
	public User getById(int id) throws TException {
		User u = new User();
		u.setId(id);
		u.setName("HHII");
		u.setVip(true);
		return u;
	}

}
