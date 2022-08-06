package com.tandem.jobber.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "applicantAccount" )
@PrimaryKeyJoinColumn( name = "idAccount" )
public class ApplicantAccount extends Account {
	
	private String firstname;
	
	private String lastname;
	
	//Constructor
	public ApplicantAccount(String username,String email,String password,String firstname,String lastname) {
		super();
		this.firstname=firstname;
		this.lastname=lastname ;
	}
	
	//Getters & setters
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
