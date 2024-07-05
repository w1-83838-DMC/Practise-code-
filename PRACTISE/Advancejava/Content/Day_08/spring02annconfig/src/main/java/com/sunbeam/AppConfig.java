package com.sunbeam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Box b1()
    {
        Box b= new BoxImpl();
        b.setLength(5);
        b.setBreadth(3);
        b.setHeight(2);
        return b;
    }

    @Bean
    public Box b2()
    {
       Box b= new BoxImpl(10, 3, 7);
       return b;
    }

}
