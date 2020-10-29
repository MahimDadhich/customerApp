package com.cg.repository;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;


import com.cg.entity.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository 
{
	private Map<Long, Customer> store = new HashMap<>();
	private Long generatedId;
	
	Long generateId() 
	{
		++generatedId;
		return generatedId;
	}

	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Long id=generateId();
		customer.setId(id);
		store.put(id, customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Long  id = customer.getId();
		store.put(id, customer);
		return customer;
		}
	@Override
	public Customer findById(Long id) {
		return store.get(id);
	}
}
