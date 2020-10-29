package com.cg.service;

import com.cg.entity.Customer;

public interface CustomerService 
{
	Customer register(Customer customer);
	Customer updateName(Long id, String name);
}
