package com.dlithe.banking.app.serviceImpl;


import com.dlithe.banking.app.dto.StudentDetailsResponse;
import com.dlithe.banking.app.dto.StudentReviewsResponse;
import com.dlithe.banking.app.entity.StudentDetails;
import com.dlithe.banking.app.repository.StudentDetailsDAO;
import com.dlithe.banking.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDetailsDAO studentDetailsDAO;

    @Override
    public StudentDetailsResponse getStudentDetails(int StudentId) {

        Optional<StudentDetails> studentDetails = studentDetailsDAO.findById(StudentId);
        StudentDetails student = studentDetails.get();

        StudentDetailsResponse studentDetailsResponse = new StudentDetailsResponse();
        studentDetailsResponse.setName(student.getName());
        studentDetailsResponse.setAge(student.getAge());
        studentDetailsResponse.setId(student.getId());
        studentDetailsResponse.setMobileNumber(student.getMobileNumber());

        return studentDetailsResponse;

    }

    @Override
    public StudentDetailsResponse fetchStudentDetails(int studentId) {

        Optional<StudentDetails> studentDetails = studentDetailsDAO.findById(studentId);
        StudentDetails student = studentDetails.get();

        StudentDetailsResponse studentDetailsResponse = new StudentDetailsResponse();
        studentDetailsResponse.setName(student.getName());
        studentDetailsResponse.setAge(student.getAge());
        studentDetailsResponse.setId(student.getId());
        studentDetailsResponse.setMobileNumber(student.getMobileNumber());

        StudentReviewsResponse studentReviewsResponse = new StudentReviewsResponse();
        studentReviewsResponse.setReview("Priya is good girl and explaning very good manar");
        studentReviewsResponse.setRating("5");
        studentReviewsResponse.setName("PRIYA");
       // studentDetailsResponse.setReviewsResponse(studentReviewsResponse);

        return studentDetailsResponse;
    }

    @Override
    public StudentDetailsResponse getStudentDetailsWithAllReview(int studentId) {
        List<StudentReviewsResponse> reviewsResponses= new ArrayList<>();
        Optional<StudentDetails> studentDetails = studentDetailsDAO.findById(studentId);
        StudentDetails studentFromDb = studentDetails.get();


        StudentDetailsResponse studentDetailsResponse = new StudentDetailsResponse();
        studentDetailsResponse.setId(studentFromDb.getId());
        studentDetailsResponse.setName(studentFromDb.getName());
        studentDetailsResponse.setAge(studentFromDb.getAge());
        studentDetailsResponse.setMobileNumber(studentFromDb.getMobileNumber());

        StudentReviewsResponse studentReviewsResponse = new StudentReviewsResponse();
        studentReviewsResponse.setReview("She is very intelligent girl");
        studentReviewsResponse.setRating("4.3");
        studentReviewsResponse.setName("Siri");

        StudentReviewsResponse studentReviewsResponse1 = new StudentReviewsResponse();
        studentReviewsResponse1.setReview("Sanni is very tallest girl ");
        studentReviewsResponse1.setRating("4");
        studentReviewsResponse1.setName("Sannitha");

        StudentReviewsResponse studentReviewsResponse2 = new StudentReviewsResponse();
        studentReviewsResponse2.setReview("Nava is very silent girl and helping nature");
        studentReviewsResponse2.setRating("4.2");
        studentReviewsResponse2.setName("Navanitha");

       reviewsResponses.add(studentReviewsResponse);
       reviewsResponses.add(studentReviewsResponse1);
        reviewsResponses.add(studentReviewsResponse2);
        studentDetailsResponse.setReviewsResponses(reviewsResponses);

        return studentDetailsResponse;

    }

    @Override
    public StudentDetailsResponse getByStudentName(String studentName) {
        StudentDetailsResponse studentDetailsResponse = new StudentDetailsResponse();
        StudentDetails studentDetails = studentDetailsDAO.findByName(studentName);

        studentDetailsResponse.setName(studentDetails.getName());
        studentDetailsResponse.setAge(studentDetails.getAge());
        studentDetailsResponse.setId(studentDetails.getId());
        studentDetailsResponse.setMobileNumber(studentDetails.getMobileNumber());

        return studentDetailsResponse;


    }
}

