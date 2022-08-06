package com.tandem.jobber.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;


@Entity
@Table(name = "Account")
@Inheritance( strategy = InheritanceType.JOINED )
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Account {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAccount;
	
	@Column(name = "username")
	private  String username;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@OneToOne(mappedBy = "account")
	private AccountInfo accountInfo;
	
	@ManyToMany
	@JoinTable ( name = "Account_Roles",
            joinColumns = {@JoinColumn( name = "idAccount" )},
            inverseJoinColumns = {@JoinColumn( name = "idRole" )} )
	private Set<Role> roles = new HashSet<>();
	
	

	//Getters & setters

	public Long getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<Role> getRoles() {
        return roles;
    }

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AccountInfo getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}
	

	
	
}
