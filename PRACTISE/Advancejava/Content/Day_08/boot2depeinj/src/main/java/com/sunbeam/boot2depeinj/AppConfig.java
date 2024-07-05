package com.sunbeam.boot2depeinj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // using setter getter
    @Bean
    public Box b1()
    {
        Box b= new BoxImpl();
        b.setLength(1);
        b.setBreadth(2);
        b.setHeight(3);
        return b;
    }

    //using Constructor 
    @Bean
    public Box b2()
    {
        Box b=new BoxImpl(10, 20, 30);
        return b;
    }

}
