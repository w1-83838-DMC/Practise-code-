package com.sunbeam.boot04;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {
    @Bean
    public Person p2()
    {
        Person p= new PersonImpl();
        p.setName("Harshal");
        p.setAge(24);
        return p;
    }
    @Bean
    public Account a3()
    {
        Account a=new AccountImpl();
        a.setId(101);
        a.setType("saving");
        a.setBalance(50000);
        a.setAccHolder(p2());
        return a;
    }
    @Bean
    public Account a4()
    {
        Account a= new AccountImpl(103, "Current", 13000, p2());
        return a;
    }

    @Bean
    public Account a5(@Qualifier("p2")Person p)
    {
        Account a= new AccountImpl(107,"saving",56000,p);
        return a;

    }




}
