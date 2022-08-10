package com.hnbemc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hnbemc.pojo.User;
import com.hnbemc.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	//跳转注册页面
	@RequestMapping("/toRegister")
	public String toRegister() {
		return "register";
	}
	//注册
	@RequestMapping("/register")
	public String register(User user,Model model) {
		 userService.register(user);
		 model.addAttribute("msg", "1111");
		return "succes";
	}
	//登录
	@RequestMapping("/toLogin")
	public String toLogin(String username,String password,Model model,HttpSession session) {
		User  user = userService.findUser(username, password);
		System.out.println(user);
		if (user!=null) {
			session.setAttribute("USER_SESSION", user);
			return "redirect:/findCustomerAll";	
		}
		//向模型对象中添加数据
		model.addAttribute("msg", "请输入正确的账号或者密码,如果没有请先注册");
		return "login";	
	}
	
	//退出
	
	
	//退出到登录页面，并清除session
	@RequestMapping("/toLoginOut")
	public String toLoginOut(HttpSession session) {
		
		System.out.println(session.getAttribute("USER_SESSION"));
		session.invalidate();
		return "login";
	}
}
