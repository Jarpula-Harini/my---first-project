package com.dlithe.banking.app.controller;


import com.dlithe.banking.app.dto.RegisterDetailsRequest;
import com.dlithe.banking.app.dto.UserDetails;
import com.dlithe.banking.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping("register-user")
    public String registerNewAgent(@RequestBody RegisterDetailsRequest registerDetailsRequest){
        return testService.registerAgent(registerDetailsRequest);
    }



    @GetMapping("get-user-details/{userId}")
    public UserDetails fetchUserDetails(@PathVariable int userId){
        return testService.getUserDetails(userId);
    }
}
