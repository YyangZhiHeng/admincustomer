package com.hnbemc.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.hnbemc.pojo.User;

@Repository
public interface UserDao {
	public User findUser(@Param("username")String username,@Param("password")String password);
	public int register(User user);
}
