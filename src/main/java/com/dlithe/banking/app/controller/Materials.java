package com.dlithe.banking.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Materials {
    @GetMapping("fetch-materials-details/{dressName}")
    public String myFirstMethod(@PathVariable String dressName){
        switch (dressName){
            case "plaza":
                return plazaDetails();
            case "kurtis":
                return kurtisDetails();
            default:
                return "kurtis are not in stock";
        }
    }
    public String plazaDetails(){
        return "Plaza offer in D-Mart buy-1 and get-1 free";
    }
        public String kurtisDetails(){
            return " Kurtis are available";
        }
    }

