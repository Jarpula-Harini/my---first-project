package com.dlithe.banking.app.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class SendMoneyRequest {


    private String transactionId;
    private Double transactionAmount;
    private String  status;
    private String transactionDate;
    private String toName;
    private String fromName;
    private int accountId;
    private String accountType;

}
