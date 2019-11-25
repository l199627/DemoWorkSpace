package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.Dao.UserDao;
import com.zl.pojo.User;
import com.zl.service.UserService;
@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserDao ud;
	@Override
	public User login(User user) {
		return ud.login(user);
	}

}
