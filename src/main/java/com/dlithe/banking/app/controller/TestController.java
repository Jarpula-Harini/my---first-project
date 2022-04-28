package com.dlithe.banking.app.controller;

import com.dlithe.banking.app.dto.PatientDetailsRequest;
import com.dlithe.banking.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
   @GetMapping("fetch-product-details/{productName}")
    public String myFirstMethod(@PathVariable  String productName){
      switch (productName){
         case  "bataShoes":
           return bataShoeDetails();
           case "titanWatch":
                return titanWatchDetails();
           default:
             return "No product found";
    }

   }

   public String bataShoeDetails() {
        return " Bata shoes is best in the market with price varying from 500-5000 INR";

    }
    public String titanWatchDetails(){
        return "Limited edition titan watch with only 3 pieces in stock all over the world";

   }
   @Autowired
   private TestService testService;

   @PostMapping("register-patient")
    public String registerNewPatient(@RequestBody PatientDetailsRequest patientDetailsRequest){
        return testService.registerPatient(patientDetailsRequest);
   }

}
