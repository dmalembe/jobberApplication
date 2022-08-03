package com.tandem.jobber.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.tandem.jobber.enumeration.ERole;


//@Entity
//@Table(name = "role")
public class Role {
	
	private Long idRole;
	
	private ERole name;
	
	//Constructors
	public Role() {}

	public Role(ERole name) {
		this.name = name;
	}
	
	
//    @ManyToMany
//    @JoinTable( name = "T_Users_Roles_Associations",
//                joinColumns = @JoinColumn( name = "idRole" ),
//                inverseJoinColumns = @JoinColumn( name = "idUser" ) )
//    private Set<User> users = new HashSet<>();
	
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
