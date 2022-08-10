package com.hnbemc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hnbemc.common.utils.Page;
import com.hnbemc.pojo.Customer;
import com.hnbemc.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	// 跳转添加页面
	//@RequestMapping("/toaddCustomer")=@RequestMapping(value="/toaddCustomer")
	@RequestMapping("/toaddCustomer")
	public String toAddCustomer() {
		return "addCustomer";
	}

	// 增
	@RequestMapping("/addCustomer")
	public String addCustomer(Customer customer, Model model) {
		customerService.addCustomer(customer);
		return "redirect:/findCustomerAll";
	}

	// id删除信息
	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(Integer id) {
		customerService.deleteCustomer(id);
		return "redirect:/findCustomerAll";
	}

	// 跳转到修改页面
	@RequestMapping("/toupdateCustomer")
	public String toupdateCustomer(Integer id, Model model) {
		Customer customer = customerService.findCustomerById(id);
		model.addAttribute("customer", customer);
		return "updateCustomer";
	}

	// 改
	@RequestMapping("/updateCustomer")
	public String updateCustomer(Customer customer, Model model,HttpSession session) {
		customerService.updateCustomer(customer);
		model.addAttribute("customer", customer);
		System.out.println(customer);
		return "redirect:/findCustomerAll";
	}
	
	//跳转查询页面
	@RequestMapping("/tofindCustomerById")
	public String tofindCustomerById() {
		return "tofindCustomerById";
	}
	
	
	// id查寻
	@RequestMapping("/findCustomerById")
	public String findCustomerById(Integer id, Model model) {
		Customer customer = customerService.findCustomerById(id);
		model.addAttribute("customer", customer);
		System.out.println(customer);
		return "customer";

	}

	// 查询所有
	@RequestMapping("/findCustomerAll")
	private String findCustomerAll(Model model,@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "2") Integer rows) {
		Page<Customer> customers = customerService.findCustomerAll(page, rows);
		model.addAttribute("page", customers);
		System.out.println(customers.getRows());
		return "userlist";

	}

}
