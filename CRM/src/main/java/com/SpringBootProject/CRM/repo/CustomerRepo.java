package com.SpringBootProject.CRM.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBootProject.CRM.emtity.Customer;

@Repository
public class CustomerRepo {

    @Autowired
    private SessionFactory sessionFactory;

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
    
    public  List <Customer> getCustomerList() {
    	Session session = sessionFactory.openSession();
    	
    	 return session.createQuery("from Customer").list();
    	
    	
    	
    }
}
