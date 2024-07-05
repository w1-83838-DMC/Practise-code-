package com.sunbeam.boot6;

import java.lang.System.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.bank.Account;
import com.bank.BankConfig;
import com.bank.ConsoleLoggerImpl;
import com.bank.FileLoggerImpl;

@Import(BankConfig.class)
@SpringBootApplication
public class Boot6Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Boot6Application.class, args);
	}

	@Autowired
	public ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		ConsoleLoggerImpl consoleLogger =ctx.getBean(ConsoleLoggerImpl.class);
		consoleLogger.log("Hello Sunbeam !");

		FileLoggerImpl fileLoger =ctx.getBean(FileLoggerImpl.class);
		fileLoger.log("Hello Ajay Surse");

		Logger logger=ctx.getBean(Logger.class);
		logger.log("Hello")	;

		Account act=ctx.getBean(Account.class);
		System.out.println("acc"+act.toString());


		
	}

}
