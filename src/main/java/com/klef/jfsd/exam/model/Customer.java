package com.klef.jfsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer  
{
	  @Id
	  @Column(name = "eid",unique=true)
	  private int id;
	  @Column(name = "ename",nullable = false,length = 50)
	  private String name;
	  @Column(name = "eemail",nullable = false,length = 50)
	  private String email;
	  @Column(name = "edateofbirth",nullable = false,length = 50)
	  private String dateofbirth;
	  @Column(name = "eaddress",nullable = false,length = 50)
	  private String address;
	  @Column(name = "ephonenumber",nullable = false,length = 50)
	  private double phonenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(double phonenumber) {
		this.phonenumber = phonenumber;
	}

}
