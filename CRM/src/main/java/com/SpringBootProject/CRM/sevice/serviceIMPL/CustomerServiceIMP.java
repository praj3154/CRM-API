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

	@Override
	public String customerUpdate(Customer customer) {
		// TODO Auto-generated method stub
		return repo.updateCustomer(customer);
	}

	@Override
	public String customerDateleById(int id) {
		
		return repo.deleteCustomerById(id);
	}

	@Override
	public String insertMultipleCustomer(List<Customer> customers) {
		// TODO Auto-generated method stub
		return repo.insertMultipleCustomer(customers);
	}

	@Override
	public List<Customer> findCustomerByName(String Name) {
		// TODO Auto-generated method stub
		return repo.findCustomerByName(Name);
	}

	@Override
	public List<Customer> getCustomerByLessThanAge(int age) {
		// TODO Auto-generated method stub
		return repo.getCustomerByLessThanAge(age);
	}

	@Override
	public List<Customer> getCustomerByGraterThanAge(int age) {
		// TODO Auto-generated method stub
		return repo.getCustomerByGreaterThanAge(age);
	}

}
