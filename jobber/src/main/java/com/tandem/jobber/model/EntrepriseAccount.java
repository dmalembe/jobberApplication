package com.tandem.jobber.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "entrepriseAccount" )
@PrimaryKeyJoinColumn( name = "idAccount" )
public class EntrepriseAccount extends Account {
	
	private String entitled;

	public String getEntitled() {
		return entitled;
	}

	public void setEntitled(String entitled) {
		this.entitled = entitled;
	}
	
	
}
