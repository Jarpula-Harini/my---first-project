package com.dlithe.banking.app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "transaction_amount")
    private Double transactionAmount;

    @Column(name = "status")
    private String status;

    @Column(name = "transaction_date")
    private String transactionDate;

    @Column(name = "to_name")
    private String toName;

    @Column(name = "from_name")
    private String fromName;

    @Column(name = "account_id")
    private String accountId;

    @Column(name = "account_type")
     private String accountType;

}
