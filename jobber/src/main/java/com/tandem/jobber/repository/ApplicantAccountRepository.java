package com.tandem.jobber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tandem.jobber.model.ApplicantAccount;

@Repository
public interface ApplicantAccountRepository extends JpaRepository<ApplicantAccount, Long> {

}
