package com.sunbeam.boot03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:beans.xml")
@SpringBootApplication
public class Boot03Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Boot03Application.class, args);
	}

	@Autowired
	private ApplicationContext ctx;
	@Override
	public void run(String... args) throws Exception {
		Person p1=(Person)ctx.getBean("p1");
		System.out.println(p1.toString());
		
		Account a1=(Account)ctx.getBean("a1");
		System.out.println(a1.toString());

		// Account a2=(Account)ctx.getBean("a2");
		// System.out.println(a2.toString());

		// Person p2=(Person)ctx.getBean("p2");
		// System.out.println(p2.toString());

		// Account a3=(Account)ctx.getBean("a3");
		// System.out.println(a3.toString());

		// Account a4=(Account)ctx.getBean("a4");
		// System.out.println(a4.toString());

	}

}
