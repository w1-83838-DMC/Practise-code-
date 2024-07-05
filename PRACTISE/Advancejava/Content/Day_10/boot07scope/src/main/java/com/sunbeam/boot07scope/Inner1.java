package com.sunbeam.boot07scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class Inner1 {
    public Inner1()
    {
        System.out.println("Inner1 been Created (Singleton)");
    }

}
