package com.SpringBootProject.CRM.service;

import java.util.List;

import com.SpringBootProject.CRM.emtity.Customer;

public interface CustomerService {
 
   String add(Customer customer); 
   List <Customer> getCustomer();
   Customer getCustomerById(int id) ;
   String customerUpdate(Customer customer);
   String customerDateleById(int id);
   String insertMultipleCustomer(List <Customer> customers);
   
}
