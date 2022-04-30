package com.dlithe.banking.app.service;

import com.dlithe.banking.app.dto.StudentDetailsResponse;
import com.dlithe.banking.app.entity.StudentDetails;
import org.springframework.stereotype.Component;

@Component
public interface StudentService {

    StudentDetailsResponse getStudentDetails(int studentId);


    StudentDetailsResponse fetchStudentDetails(int studentId);
//start
    StudentDetailsResponse getStudentDetailsWithAllReview(int studentId);

    StudentDetailsResponse getByStudentName(String studentName);
}
