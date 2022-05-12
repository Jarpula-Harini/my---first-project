package com.dlithe.banking.app.serviceImpl;

import com.dlithe.banking.app.dto.*;
import com.dlithe.banking.app.entity.Accounts;
import com.dlithe.banking.app.entity.Customers;
import com.dlithe.banking.app.entity.Transaction;
import com.dlithe.banking.app.repository.AccountsDAO;
import com.dlithe.banking.app.repository.CustomersDAO;
import com.dlithe.banking.app.repository.TransactionDAO;
import com.dlithe.banking.app.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private CustomersDAO customersDAO;
    @Autowired
    private AccountsDAO accountsDAO;

    @Autowired
    private TransactionDAO transactionDAO;

    @Override
    public ResponseEntity<BaseResponse> loginCustomer(LoginRequest loginRequest) {
        Optional<Customers> customers = Optional.ofNullable(customersDAO.login(loginRequest.getEmailId(), loginRequest.getPassword()));
        BaseResponse baseResponse = new BaseResponse();

        if (!customers.isPresent()) {

            baseResponse.setMessage("Customer is not found ");
            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
            baseResponse.setHttpStatusCode(HttpStatus.NOT_FOUND.value());
            return new ResponseEntity<>(baseResponse, HttpStatus.NOT_FOUND);
        }

        baseResponse.setMessage("Logged in  successfully");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        baseResponse.setResponse(customers);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);

    }



    @Override
    public ResponseEntity<BaseResponse> sendMoney(SendMoneyRequest sendMoneyRequest) {
        double updateBalance = 0.0;

        BaseResponse baseResponse = new BaseResponse();
        Accounts accounts = accountsDAO.findByAccountIdAndAccountType(sendMoneyRequest.getAccountId(),sendMoneyRequest.getAccountType());

           if(accounts.getBalance() < sendMoneyRequest.getTransactionAmount()){
               baseResponse.setMessage("Insufficient balance");
               baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
               baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());

               return new ResponseEntity<>(baseResponse , HttpStatus.BAD_REQUEST);
           }


        Transaction transaction = new Transaction();

           transaction.setTransactionId(sendMoneyRequest.getTransactionId());
        transaction.setTransactionAmount(sendMoneyRequest.getTransactionAmount());
        transaction.setTransactionDate(sendMoneyRequest.getTransactionDate());
        transaction.setStatus(sendMoneyRequest.getStatus());
        transaction.setToName(sendMoneyRequest.getToName());
        transaction.setFromName(sendMoneyRequest.getFromName());
        transactionDAO.save(transaction);

        updateBalance= accounts.getBalance()-sendMoneyRequest.getTransactionAmount();
        accounts.setBalance(updateBalance);
        accountsDAO.save(accounts);


        baseResponse.setMessage("Transaction done successfully");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        return new ResponseEntity<>(baseResponse , HttpStatus.OK);
    }


}





