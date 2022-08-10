package com.hnbemc.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnbemc.dao.UserDao;
import com.hnbemc.pojo.User;
import com.hnbemc.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	//登录
	@Override
	public User findUser(String username, String password) {
		User user =  userDao.findUser(username, password);
		return user;
	}
	//注册
	public int register(User user) {
		return userDao.register(user);
		
	}
}
