package com.dlithe.banking.app.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "accounts")
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "balance")
    private double balance;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "created_date")
    private String createdDate;

    @Column(name = "customer_id")
    private int customerId;
}
