package com.dlithe.banking.app.controller;

import com.dlithe.banking.app.dto.BaseResponse;
import com.dlithe.banking.app.dto.LoginRequest;
import com.dlithe.banking.app.dto.SendMoneyRequest;
import com.dlithe.banking.app.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BankController {

    @Autowired
    private BankService bankService;


    @PostMapping("customer-login")
    public ResponseEntity <BaseResponse> loginCustomer(@RequestBody LoginRequest loginRequest)
    {
        if (loginRequest == null )

        {
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("login details can not be null ");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
           return new ResponseEntity<>(baseResponse , HttpStatus.BAD_REQUEST);

        }

        return bankService.loginCustomer(loginRequest);

    }

//    @GetMapping("fetch-list-of-accounts/{customerId}")
//    public ResponseEntity<BaseResponse> fetchAccounts(@PathVariable int customerId)
//    {
//        if ( customerId == 0 || String.valueOf(customerId) == null)
//        {
//            BaseResponse baseResponse = new BaseResponse();
//            baseResponse.setMessage("accounts Id cannot be 0 or null");
//            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
//            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
//            return new ResponseEntity<BaseResponse>(baseResponse , HttpStatus.BAD_REQUEST);
//        }
//
//        return bankService. fetchAccounts(customerId);
//    }

    @PostMapping("send-money")
    public ResponseEntity<BaseResponse> sendMoney(@RequestBody SendMoneyRequest sendMoneyRequest)
    {
        if (sendMoneyRequest == null)
        {
           BaseResponse baseResponse = new BaseResponse();
           baseResponse.setMessage("Send money request is can not be null");
           baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
           baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
           return new ResponseEntity<>(baseResponse , HttpStatus.BAD_REQUEST);
        }
        return bankService.sendMoney(sendMoneyRequest);

    }






}
