package com.hnbemc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hnbemc.pojo.Customer;
@Repository
public interface CustomerDao {

	public int  addCustomer(Customer customer);

	public void deleteCustomer(Integer id);

	public int updateCustomer(Customer customer);

	public Customer findCustomerById(Integer id);

	public List<Customer> findCustomerAll(Customer customer);
	
	public int selectCustomerCount(Customer customer);

}
