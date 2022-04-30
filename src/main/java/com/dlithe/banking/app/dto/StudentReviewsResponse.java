package com.dlithe.banking.app.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class StudentReviewsResponse {

    private String name;
    private String review;
    private String rating;


}
