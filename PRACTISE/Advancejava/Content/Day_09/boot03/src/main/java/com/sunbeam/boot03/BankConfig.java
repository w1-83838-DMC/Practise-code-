package com.sunbeam.boot03;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {
    @Bean
    public Person p2()
    {
        Person p= new PersonImpl();
        p.setName("Harshal");
        p.setAge(22);
        return p;
    }
    @Bean
    public Account a3()
    { // setter getter dependencyInjection
        Account a= new AccountImpl();
        a.setId(101);
        a.setType("Saving");
        a.setBalance(20000);
        a.setAccHolder(p2());
        return a;
    }
    
    




}
