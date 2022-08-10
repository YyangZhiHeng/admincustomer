package com.hnbemc.service;

import com.hnbemc.pojo.Customer;
import com.hnbemc.common.utils.Page;

public interface CustomerService {

	public int addCustomer(Customer customer);

	public void deleteCustomer(Integer id);

	public int updateCustomer(Customer customer);

	public Customer findCustomerById(Integer id);
	
	public Page<Customer> findCustomerAll(Integer page, Integer rows);
	

}
