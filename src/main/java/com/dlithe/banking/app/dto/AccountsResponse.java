package com.dlithe.banking.app.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AccountsResponse {
    private String firstName;
    private String lastName;

//private List<AccountTypeResponse> accountType;

}
