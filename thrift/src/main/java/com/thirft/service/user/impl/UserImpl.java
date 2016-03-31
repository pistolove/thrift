package com.thirft.service.user.impl;

import org.apache.thrift.TException;

import com.thirft.service.user.User;
import com.thirft.service.user.UserService;

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
