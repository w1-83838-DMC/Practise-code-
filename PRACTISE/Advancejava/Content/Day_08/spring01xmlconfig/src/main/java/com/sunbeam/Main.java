package com.sunbeam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Box b1=(Box) ctx.getBean("b1");
        int res1=b1.calcVolume();
        System.out.println("Result "+ res1);
        Box b2=(Box)ctx.getBean("b2");
        int res2=b2.calcVolume();
        System.out.println("Result "+ res2);
        ctx.close();
    
    }
}