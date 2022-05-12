package com.dlithe.banking.app.service;


import com.dlithe.banking.app.dto.BaseResponse;
import com.dlithe.banking.app.dto.LoginRequest;
import com.dlithe.banking.app.dto.SendMoneyRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface BankService {


   // ResponseEntity<BaseResponse> loginNewCustomer(LoginRequest loginRequest);


   // ResponseEntity<BaseResponse> getByCustomerId(int customerId);

    ResponseEntity<BaseResponse> sendMoney(SendMoneyRequest sendMoneyRequest);

   // ResponseEntity<BaseResponse> fetchAccounts(int customerId);

    ResponseEntity<BaseResponse> loginCustomer(LoginRequest loginRequest);
}
