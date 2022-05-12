package com.dlithe.banking.app.repository;

import com.dlithe.banking.app.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDAO extends JpaRepository <Transaction , Integer> {

}
