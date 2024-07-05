package com.sunbeam.boot03;

public class AccountImpl implements Account {
    private int id;
    private String type;
    private double balance;
    private Person accHolder;
    public AccountImpl() {
    }
    public AccountImpl(int id, String type, double balance, Person accHolder) {
        this.id = id;
        this.type = type;
        this.balance = balance;
        this.accHolder = accHolder;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public Person getAccHolder() {
        return accHolder;
    }
    @Override
    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }
    @Override
    public String toString() {
        return "AccountImpl [id=" + id + ", type=" + type + ", balance=" + balance + ", accHolder=" + accHolder + "]";
    }

    @Override
    public void deposit(double amount)
    {
        this.balance=this.balance+amount;
    }
    @Override
    public void withdraw(double amount)
    {
        this.balance=this.balance-amount;
    }

   

    


}
