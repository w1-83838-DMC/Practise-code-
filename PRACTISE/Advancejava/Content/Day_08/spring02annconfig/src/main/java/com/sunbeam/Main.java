package com.sunbeam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
        Box b1=(Box)ctx.getBean("b1");
        int res=b1.calVolume();
        System.out.println("Result"+ res);

        Box b2=(Box)ctx.getBean("b2");
        int res1=b2.calVolume();
        System.out.println("Result"+ res1);


    }
}