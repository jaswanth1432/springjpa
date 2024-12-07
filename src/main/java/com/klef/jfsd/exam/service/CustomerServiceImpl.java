package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	public CustomerRepository repository;
	
	@Override
	public String addCustomer(Customer e) 
	{	
		repository.save(e);
		return "Customer Added Successfully";
	}

	@Override
	public List<Customer> displayAllCustomers() 
	{
		return (List<Customer>) repository.findAll();
	}

}
