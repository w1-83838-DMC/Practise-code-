package com.bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.bank")
@Configuration
public class BankConfig {

    @Bean
    public Account acc()
    {
        Account acc= new AccountImpl();
        acc.setId(101);
        acc.setType("Current");
        acc.setBalance(14000);
        return acc;
    }






}
