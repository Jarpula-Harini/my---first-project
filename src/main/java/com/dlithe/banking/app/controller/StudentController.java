package com.dlithe.banking.app.controller;

import com.dlithe.banking.app.dto.StudentDetailsResponse;
import com.dlithe.banking.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("get-student/{studentId}")
    public StudentDetailsResponse getStudentDetails(@PathVariable int studentId){
        return studentService.getStudentDetails(studentId);
    }

//to get one review
    @GetMapping("get-student-details/{studentId}")
    public StudentDetailsResponse getStudentDetailsReview(@PathVariable int studentId) {
        return studentService.fetchStudentDetails(studentId);

    }
//        //To get all list
//        @GetMapping("fetch-student-with-details/{studentId}")
//                public StudentDetailsResponse getStudentDetailsWithAllReview(@PathVariable int studentId){
//        return studentService.getStudentDetailsWithAllReview(studentId);
//    }

    @GetMapping("fetch-student-details/{studentName}")
   public StudentDetailsResponse getStudentDetailsBasedOnStudentName(@PathVariable String studentName){
        return studentService.getByStudentName(studentName);
    }

}


