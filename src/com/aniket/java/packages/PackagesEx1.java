package com.aniket.java.packages;

/**
 * default - accessible only with in the package/ inside the package.
 * public - accessible outside the package.
 */

import com.aniket.java.packages.demo.service.AccountService;
import com.aniket.java.packages.demo.service.CardService;
import com.aniket.java.packages.demo.util.DateUtil;

import java.util.Date;

public class PackagesEx1 {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        CardService cardService = new CardService();

        accountService.openAccount();
        cardService.newCard();

        System.out.println(DateUtil.formatDate(new Date()));


    }
}
