package com.sunbeam.boot2depeinj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Boot2depeinjApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Boot2depeinjApplication.class, args);
	}

	@Autowired
	private ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		Box b=(Box)ctx.getBean("b1");
		int res=b.calcVolume();
		System.out.println("Result"+ res);

		Box b1=(Box) ctx.getBean("b2");	
		int res1=b1.calcVolume();
		System.out.println("Result1 "+ res1);

	}

}
