package com.hnbemc.service;


import com.hnbemc.pojo.User;


public interface UserService {
	
	//登录
	public  User  findUser(String username,String password);
	
	//注册	
	public int register(User user);
}
