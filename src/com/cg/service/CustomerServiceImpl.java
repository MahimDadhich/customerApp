package com.cg.service;

import com.cg.entity.Customer;
import com.cg.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public Customer register(Customer customer) {
		// TODO Auto-generated method stub
		customer=customerRepo.addCustomer(customer);
		return customer;
	}

	@Override
	public Customer updateName(Long id, String name) 
	{
		// TODO Auto-generated method stub
		Customer customer = customerRepo.findById(id);
		customer.setName(name);
		customer = customerRepo.updateCustomer(customer);
		return customer;
	}

}
