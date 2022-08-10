package com.hnbemc.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hnbemc.dao.CustomerDao;
import com.hnbemc.pojo.Customer;
import com.hnbemc.service.CustomerService;
import com.hnbemc.common.utils.Page;

@Service
@Transactional
public class CustomerServicerImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	// 增
	@Override
	public int addCustomer(Customer customer) {
		return this.customerDao.addCustomer(customer);
	}

	// 删
	@Override
	public void deleteCustomer(Integer id) {
		customerDao.deleteCustomer(id);
	}

	// 改
	@Override
	public int updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

	// id查查询
	@Override
	public Customer findCustomerById(Integer id) {
		return this.customerDao.findCustomerById(id);
	}

	// 查询所有
	@Override
	public Page<Customer> findCustomerAll(Integer page, Integer rows) {

		// 创建客户对象
		Customer customer = new Customer();
		// 当前页
		customer.setStart((page - 1) * rows);
		// 每页数
		customer.setRows(rows);
		// 查询客户列表
		List<Customer> customers = customerDao.findCustomerAll(customer);
		// 查询客户列表总记录数
		Integer count = customerDao.selectCustomerCount(customer);
		// 创建Page返回对象
		Page<Customer> result = new Page<Customer>();
		result.setPage(page);
		result.setRows(customers);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

}
