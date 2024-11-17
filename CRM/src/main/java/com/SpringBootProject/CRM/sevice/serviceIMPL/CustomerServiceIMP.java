package com.SpringBootProject.CRM.sevice.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootProject.CRM.emtity.Customer;
import com.SpringBootProject.CRM.repo.CustomerRepo;
import com.SpringBootProject.CRM.service.CustomerService;

import jakarta.transaction.Transactional;
@Service
public class CustomerServiceIMP implements CustomerService {
	@Autowired
	CustomerRepo repo;
	
	@Override
    @Transactional
	public String add( Customer customer) {
		// TODO Auto-generated method stub
		return repo.add(customer);
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return repo.getCustomerList();
	}

	@Override
	public Customer getCustomerById(int id) {
	
		
		return repo.getCustomerById(id);
	}

}
