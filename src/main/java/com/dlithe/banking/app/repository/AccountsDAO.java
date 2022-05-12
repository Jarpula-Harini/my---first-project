package com.dlithe.banking.app.repository;

import com.dlithe.banking.app.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountsDAO extends JpaRepository <Accounts , Integer> {



//@Query(value = "select * from accounts where customer_id = ?1 and ",nativeQuery = true)
//    Optional<Accounts> findByCustomerId(int customerId);
@Query(value = "select * from accounts where id=?1 and account_type=?2" , nativeQuery = true)
    Accounts findByAccountIdAndAccountType(int accountId, String accountType);
@Query(value = "select * from accounts where customer_id=?1 ",nativeQuery = true)
    List<Accounts> findAccountsByCustomerId(int customerId);
}
