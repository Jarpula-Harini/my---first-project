package com.dlithe.banking.app.service;

import com.dlithe.banking.app.dto.PatientDetailsRequest;
import com.dlithe.banking.app.dto.RegisterDetailsRequest;
import com.dlithe.banking.app.dto.UserDetails;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
    String fetchProductDetails(String productName);

    String registerPatient(PatientDetailsRequest patientDetailsRequest);


    String registerAgent(RegisterDetailsRequest registerDetailsRequest);

    UserDetails getUserDetails(int userId);
}

