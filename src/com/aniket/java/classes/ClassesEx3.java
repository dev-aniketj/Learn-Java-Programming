package com.aniket.java.classes;

class Account {
    //data members
    private double balance;

    //methods
    void withdraw(double amount) {
        if ((balance - amount > 0)) {
            balance -= amount;          //balance = balance - amount;
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;          //balance = balance + amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

public class ClassesEx3 {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.deposit(1000);
        acc1.withdraw(357.885);
        acc1.withdraw(202.1);
        acc1.withdraw(22.75);
        acc1.deposit(400);
        //acc1.balance = 50000;      //avoid this, using private double balance;
        System.out.println("Total Balance in Account 1 : " + acc1.getBalance());
    }
}
