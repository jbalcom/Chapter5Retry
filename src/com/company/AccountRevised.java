package com.company;

import java.text.NumberFormat;

public class AccountRevised {
    private final double RATE = 0.035;

    private long acctNumber;
    private double balance;
    private String name;

    public AccountRevised(String owner, long account, double initial){
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    public double deposit(double amount){
        if (amount < 0)
            System.out.println("Cannot deposit a negative amount");
        else
            balance = balance + amount;
        return balance;
    }

    public double withdraw(double amount, double fee){
        if (balance - amount - fee < 0)
            System.out.println("Cannot drop account below $0!");
        else
            balance = balance - amount - fee;
        return balance;
    }

    public double addInterest(){
        balance += (balance * RATE);
        return balance;
    }

    public double getBalance(){
        return balance;
    }

    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return acctNumber + "\t" + name + "\t" + fmt.format(balance);
    }
}
