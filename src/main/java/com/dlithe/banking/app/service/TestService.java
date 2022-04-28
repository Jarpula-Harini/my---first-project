package com.dlithe.banking.app.service;

import com.dlithe.banking.app.dto.PatientDetailsRequest;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
    String fetchProductDetails(String productName);

    String registerPatient(PatientDetailsRequest patientDetailsRequest);
}
