package com.dlithe.banking.app.repository;


import com.dlithe.banking.app.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersDAO extends JpaRepository <Customers , Integer> {



    @Query(value = "SELECT * from customers WHERE email_id =?1 and password=?2 ", nativeQuery = true)
    Customers login(String emailId , String passWord );
}
