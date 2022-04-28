package com.dlithe.banking.app.repository;

import com.dlithe.banking.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface UserDAO extends JpaRepository<User, Integer> {

}




