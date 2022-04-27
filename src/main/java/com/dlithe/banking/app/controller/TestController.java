package com.dlithe.banking.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("product")

    public String testMethod(){
        return " this is springboot applications";
    }

}
