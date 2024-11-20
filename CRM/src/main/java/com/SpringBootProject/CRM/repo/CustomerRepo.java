package com.SpringBootProject.CRM.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBootProject.CRM.emtity.Customer;

@Repository
public class CustomerRepo {

    @Autowired
    private SessionFactory sessionFactory;
//Add Data
    public String add(Customer customer) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
            return "Customer inserted";
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw e;  // or handle exception as needed
        }
    }
    //Get Data
    public  List <Customer> getCustomerList() {
    	Session session = sessionFactory.openSession();
    	
    	 return session.createQuery("from Customer").list();
    	
    	
    	
    }
    
    //single data 
    public  Customer getCustomerById(int id) {
    	Session session = sessionFactory.openSession();
    	  return session.get(Customer.class, id);
    
    	
    	
    }
    
    //update data
    @SuppressWarnings("deprecation")
	public String updateCustomer(Customer customer) {
    Session session = sessionFactory.openSession();
    Transaction transaction =  session.beginTransaction();
    	session.update(customer);
    	transaction.commit();
    	session.close();
    	return "Customer updated successfully" ;
    }
    
    //Delete
    public String deleteCustomerById(int id) {
    	
    	Session session = sessionFactory.openSession();
    	 Transaction transaction = session.beginTransaction();
    	   Customer customer =   session.get(Customer.class, id);
    	   session.delete(customer);
    	   transaction.commit();
    	   session.close();
    	   return "Customer delete successfully";
    	   
    }
    
    // Insert Multiple customer
    
    public String insertMultipleCustomer(List <Customer> customers) {
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	for ( Customer cr : customers) {
    		session.save(cr);
    		
    	}
    	transaction.commit();
    	session.close();
    	return "Customers are inserted succesfully";
  
    	
    }
    
    //find Customer by Name 
    
    public List<Customer> findCustomerByName ( String name) {
    	
    	Session session = sessionFactory.openSession();
    	
    	
    	Query<Customer>  Customers = session.createQuery("from Customer c where c.name=: name" , Customer.class );
    	
    	Customers.setParameter("name", name);
    	
         return  Customers.list();
    	
    }
    
    //get customer By age
    
    public List <Customer> getCustomerByLessThanAge(int age) {
    	Session session = sessionFactory.openSession();
    Query<Customer> query =	session.createQuery("from Customer c where c.age <:age" , Customer.class);
    	
    query.setParameter("age", age);
     return query.list();
    	
    }
    public List <Customer> getCustomerByGreaterThanAge(int age) {
    	Session session = sessionFactory.openSession();
    Query<Customer> query =	session.createQuery("from Customer c where c.age >:age" , Customer.class);
    	
    query.setParameter("age", age);
     return query.list();
    	
    }
    
    
    
    
    
    
}
