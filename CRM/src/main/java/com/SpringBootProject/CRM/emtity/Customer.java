package com.SpringBootProject.CRM.emtity;

import org.springframework.stereotype.Repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "CustomerNEW")
@Data
public class Customer {
@Column (name = "ID") 
@jakarta.persistence.Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id;


@Column (name = "name") 
private String  name ;


@Column(name = "mobile")
private String mobile;

@Column(name = "email_id")
private String emailId;


@Column(name = "age")
private int age;

@Column(name = "aadhaar_number")
private String aadhaarNumber;



public Customer() {
}



public Customer(int id, String name, String mobile, String emailId, int age, String aadhaarNumber) {
	super();
	Id = id;
	this.name = name;
	this.mobile = mobile;
	this.emailId = emailId;
	this.age = age;
	this.aadhaarNumber = aadhaarNumber;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAadhaarNumber() {
	return aadhaarNumber;
}
public void setAadhaarNumber(String aadhaarNumber) {
	this.aadhaarNumber = aadhaarNumber;
}











public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Customer [Id=" + Id + ", name=" + name + ", mobile=" + mobile + "]";
}


	
	
}
