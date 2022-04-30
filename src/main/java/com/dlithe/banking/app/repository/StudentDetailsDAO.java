package com.dlithe.banking.app.repository;

import com.dlithe.banking.app.entity.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailsDAO extends JpaRepository<StudentDetails , Integer> {


   @Query(value = "SELECT * fROM student_details WHERE name=?1", nativeQuery = true)
    StudentDetails findByName(String studentName);

}
