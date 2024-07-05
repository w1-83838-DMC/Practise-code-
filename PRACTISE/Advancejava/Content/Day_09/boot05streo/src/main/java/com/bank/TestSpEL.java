package com.bank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestSpEL {
    @Value("#{acc.id}")
    private int accId;
    @Value("#{acc.getBalance()}")
    private double accBalance;
    @Value("#{acc}")
    private Account a;

    public void display()
    {
        System.out.println("accId = "+ accId);
        System.out.println("accBalance"+accBalance);
        System.out.println("a = "+a);
    }

}
