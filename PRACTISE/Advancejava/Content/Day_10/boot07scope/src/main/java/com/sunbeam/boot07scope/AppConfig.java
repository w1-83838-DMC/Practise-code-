package com.sunbeam.boot07scope;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean 
    @Scope("prototype")
    public Box b1()
    {
        Box b = new BoxImpl();
        b.setLength(12);
        b.setBreadth(3);
        b.setHeight(5);
        return b;
    }

    @Scope("prototype")
    @Bean
    public Box b2()
    {
        Box b= new BoxImpl(12, 32, 4);
        return b;
    }
}
