package com.dlithe.banking.app.serviceImpl;

import com.dlithe.banking.app.dto.PatientDetailsRequest;
import com.dlithe.banking.app.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String fetchProductDetails(String productName) {
        if(productName != null) {
            switch (productName) {

                case "iPhoneMobile":
                    return "iphone is more secure";
                case "dressMaterial":
                    return "kurtis are trending now";
                default:
                    return "No product found";
            }
        } else {
            return "product name cannot ne null";
        }
    }

    @Override
    public String registerPatient(PatientDetailsRequest patientDetailsRequest) {
        System.out.println(patientDetailsRequest);
        return null;
    }


}
