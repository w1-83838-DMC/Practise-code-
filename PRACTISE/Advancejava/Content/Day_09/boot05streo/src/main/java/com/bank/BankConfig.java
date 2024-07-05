package com.bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.bank")
@Configuration
public class BankConfig
{
    @Bean
    public Account acc()
    {
        Account a= new AccountImpl();
        a.setId(101);
        a.setType("Saving");
        a.setBalance(10000);
        return a;
    }
    
}