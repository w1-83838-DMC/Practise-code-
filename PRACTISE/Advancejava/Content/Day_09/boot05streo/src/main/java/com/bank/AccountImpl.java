package com.bank;

public class AccountImpl implements Account {

    private int id;
    private String type;
    private double balance;
    private Logger logger;
   
    public AccountImpl() {
    }

    public AccountImpl(int id, String type, double balance, Logger logger) {
        this.id = id;
        this.type = type;
        this.balance = balance;
        this.logger = logger;
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
    public Logger getLogger() {
        return logger;
    }

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

   

    @Override
    public String toString() {
        return "AccountImpl [id=" + id + ", type=" + type + ", balance=" + balance + ", logger=" + logger + "]";
    }

    @Override
    public void deposit(double amount)
    {
        this.balance=this.balance+amount;
        if(logger != null)
        {
            logger.log("Deposit Rs " + amount + "/ to account "+ id);
        }
    }

    @Override
    public void withdraw(double amount)
    {
        this.balance=this.balance-amount;
        if(logger !=null)
        {
            logger.log("Withdraw Rs "+ amount + "/to account" + id);
        }
    }


}
