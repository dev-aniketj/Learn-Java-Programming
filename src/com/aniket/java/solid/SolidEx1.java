package com.aniket.java.solid;

/**
 * S - Single Responsibility Principle
 */

class AccountService {
    AccountRepository repository = new AccountRepository();
    NotificationService notificationService = new NotificationService();

    public void openAccount() {
        // 1
        System.out.println("fill account internal details");

        notificationService.sendNotification();
        repository.saveDB();
    }
}

class AccountRepository {
    public void saveDB() {
        // 2
        System.out.println("store account object in database");
    }
}

class NotificationService {
    public void sendNotification() {
        // 3
        System.out.println("sent out welcome message");
    }
}

public class SolidEx1 {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.openAccount();
    }
}
