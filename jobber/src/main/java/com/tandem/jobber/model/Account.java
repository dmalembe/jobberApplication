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

import javax.persistence.OneToOne;
import javax.persistence.Table;

//@Entity
//@Table(name = "Account")
//@Inheritance( strategy = InheritanceType.JOINED )
public class Account {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAccount;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "password")
	private String password;
	
//	@OneToOne(mappedBy = "user")
	private AccountInfo accountInfo;
	
//	@ManyToMany
//	@JoinTable ( name = "Account_Roles",
//            joinColumns =  @JoinColumn( name = "idAccount" ),
//            inverseJoinColumns = @JoinColumn( name = "idRole" ) )
	private Set<Role> roles = new HashSet<>();
	

	public Long getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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
	
	public Set<Role> getRoles() {
        return roles;
    }
	
	
	

}
