package com.dlithe.banking.app.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BaseResponse {

    private String message;
    private HttpStatus httpStatus;
    private int httpStatusCode;
    private Object response;

}
