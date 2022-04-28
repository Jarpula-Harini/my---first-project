package com.dlithe.banking.app.serviceImpl;

import com.dlithe.banking.app.dto.PatientDetailsRequest;
import com.dlithe.banking.app.dto.RegisterDetialsRequest;
import com.dlithe.banking.app.dto.UserDetails;
import com.dlithe.banking.app.entity.User;
import com.dlithe.banking.app.repository.UserDAO;
import com.dlithe.banking.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public String fetchProductDetails(String productName) {
        if (productName != null) {
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

/*    @Override
    public String registerAgent(RegisterDetialsRequest registerDetailsRequest) {
        User user= new User();

        user.setName(registerDetailsRequest.getName());
        user.setAge(registerDetailsRequest.getAge());

        userDAO.save(user);
        return "added successfully";
    }*/


    }

    @Override
    public String registerAgent(RegisterDetialsRequest registerDetailsRequest) {


        User user = new User();

        user.setName(registerDetailsRequest.getName());
        user.setAge(registerDetailsRequest.getAge());

        userDAO.save(user);
        return "added successfully";
    }

    @Override
    public UserDetails getUserDetails(int userId) {
        Optional<User> users = userDAO.findById(userId);
        User user = users.get();
        UserDetails userDetails = new UserDetails();
        userDetails.setName(user.getName());
        userDetails.setAge(user.getAge());

        return userDetails;

    }
}
