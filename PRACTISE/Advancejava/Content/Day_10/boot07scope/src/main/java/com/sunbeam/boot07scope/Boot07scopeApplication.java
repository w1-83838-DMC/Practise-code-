package com.sunbeam.boot07scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Boot07scopeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Boot07scopeApplication.class, args);
	}

	@Autowired
	public ApplicationContext ctx;
	@Override
	public void run(String... args) throws Exception {

		Box b1=(Box)ctx.getBean("b1");
		System.out.println(b1.toString());
		Box b2=(Box)ctx.getBean("b1");
		System.out.println(b2.toString());
		System.out.println(" b1==b2 "+(b1==b2));
		Box b3=(Box)ctx.getBean("b2");
		System.out.println(b3.toString());
		Box b4=(Box)ctx.getBean("b2");
		System.out.println(b4.toString());
		System.out.println("b3==b4 "+(b3==b4));


		Outer1 o1x=ctx.getBean(Outer1.class);
		Outer1 o2x=ctx.getBean(Outer1.class);
		Outer1 o3x=ctx.getBean(Outer1.class);

		Outer1 o4x=ctx.getBean(Outer1.class);

		System.out.println(o4x.toString());


	}

}
