package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController 
{  
	@Autowired
	public CustomerService service;
	
	@PostMapping("add")
	public String add(@RequestBody Customer customer)
	{
		return service.addCustomer(customer);
	}
	
	@GetMapping("viewallcustomers")
	public List<Customer> viewallcustomers()
	{
		return service.displayAllCustomers();
	}
	
}
