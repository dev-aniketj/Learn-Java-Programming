package com.aniket.java.packages.demo.service;

public class AccountService {
    AccountInternalService internalService = new AccountInternalService();

    public void openAccount() {
        System.out.println("opening an account - " + internalService.generateAccountID());
    }
}
