package com.aniket.java.exceptions;

class DataException extends Exception {
    public DataException(String reason) {
        super(reason);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String reason) {
        super(reason);
    }
}

class Account {
    private int ac_no;
    private double balance;

    public Account(int ac_no, double balance) {
        this.ac_no = ac_no;
        this.balance = balance;
    }

    public void withdraw(double amount) throws DataException, InsufficientFundsException {
        if (amount < 0) {
            throw new DataException("amount can't be negative");
        }
        double newBalance = balance - amount;
        if (newBalance < 0) {
            throw new InsufficientFundsException("balance is less than entered amount");
        }
        balance = newBalance;
    }

}

enum Status {
    SUCCESS,
    INSUFFICIENT_FUNDS,
    DATA_ERROR
}

public class ExceptionHandlingEx2 {
    public static void main(String[] args) {
        Account acc1 = new Account(1, 1000);
        try {
            acc1.withdraw(2000);
            System.out.println("withdraw successful");
        } catch (DataException | InsufficientFundsException e) {
            e.printStackTrace();
        }

    }
}
