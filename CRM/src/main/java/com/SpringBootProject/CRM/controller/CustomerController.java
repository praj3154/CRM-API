package com.SpringBootProject.CRM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootProject.CRM.emtity.Customer;
import com.SpringBootProject.CRM.sevice.serviceIMPL.CustomerServiceIMP;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	@Autowired
   CustomerServiceIMP serviceIMP ;
	@PostMapping ("/add")
	public String add (@RequestBody Customer customer) {
		 
		return serviceIMP.add(customer);
	}
	@GetMapping
	public List<Customer> getCustomers() {
		
		return serviceIMP.getCustomer();
		
	}
	
	
	@GetMapping("/{id}")
	public Customer getCustomerByid( @PathVariable int id) {
		
	 return serviceIMP.getCustomerById(id);
	}
	
	@PutMapping
	public String customerUpdate( @RequestBody Customer customer) {
		
		return serviceIMP.customerUpdate(customer);
	}
	
	
	@DeleteMapping("/{Id}")
	public String dateleCustomerById( @PathVariable int  Id ) {
		
		return serviceIMP.customerDateleById(Id);
		
	}
	
	@PostMapping
	public String inserMultipleCustomers(@RequestBody List <Customer> customers) {
		
		return serviceIMP.insertMultipleCustomer(customers);
	}
	
	
}
