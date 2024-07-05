package com.sunbeam.boot06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class Boot06Application implements CommandLineRunner{

	@Autowired(required = false)
	public NotificationServiceClient client;
	
	public static void main(String[] args) {
		SpringApplication.run(Boot06Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		client.notifyUser("bendaleakshay23@gmail.com","45 lakh Rs Debited ");;
		

	

	}

}
