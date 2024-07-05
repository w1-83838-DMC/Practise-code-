package com.sunbeam.boot07scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Scope("prototype")
@Component
public class Outer1 {

    public Outer1()
    {
        System.out.println("Outer1 been Created (Singleton)");
    }


}
