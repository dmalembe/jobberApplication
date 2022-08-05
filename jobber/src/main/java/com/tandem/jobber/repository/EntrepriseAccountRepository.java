package com.tandem.jobber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tandem.jobber.model.EntrepriseAccount;

@Repository
public interface EntrepriseAccountRepository extends JpaRepository<EntrepriseAccount, Long> {

}
