package com.cg.repository;

import com.cg.entity.Customer;

public interface CustomerRepository 
{
	Customer addCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	Customer findById(Long id);
}
