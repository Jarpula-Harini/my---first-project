package com.dlithe.banking.app.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StudentDetailsResponse {
    private int id;
    private String name;
    private int age;
    private String mobileNumber;
// To get one review
//    private StudentReviewsResponse reviewsResponse;

    //To get list of reviews
    private List<StudentReviewsResponse> reviewsResponses;

}
