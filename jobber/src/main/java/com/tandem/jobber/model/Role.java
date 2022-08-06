package com.tandem.jobber.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.tandem.jobber.enumeration.ERole;


@Entity
@Table(name = "roles")
public class Role {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRole")
	private Long idRole;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole name;
	
    @ManyToMany
    @JoinTable( name = "Account_Roles",
                joinColumns = @JoinColumn( name = "idRole" ),
                inverseJoinColumns = @JoinColumn( name = "idAccount" ) )
    private Set<Account> accounts = new HashSet<>();
	
	//Constructors
	public Role() {}

	public Role(ERole name) {
		this.name = name;
	}
	
	//Getters & setters 
	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}

}
