package com.sunbeam.boot05streo;

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
import com.bank.Logger;
import com.bank.TestSpEL;

@Import(BankConfig.class)
@SpringBootApplication
public class Boot05streoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Boot05streoApplication.class, args);
	}
	@Autowired
	private ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		ConsoleLoggerImpl consoleLogger=ctx.getBean(ConsoleLoggerImpl.class);
		consoleLogger.log("Hello Console");

		FileLoggerImpl fileLogger=ctx.getBean(FileLoggerImpl.class);
		fileLogger.log("Hello File!");

		Logger logger=ctx.getBean(Logger.class);
		logger.log("Hello DMC");

		Account account=ctx.getBean(Account.class);
		System.out.println(account.toString());


		account.setLogger(consoleLogger);
		account.deposit(5000);
		System.out.println("Acc: "+ account.toString());

		account.setLogger(fileLogger);
		account.withdraw(4000);
		System.out.println("Acc: "+ account.toString());


		TestSpEL testspel=ctx.getBean(TestSpEL.class);
		testspel.display();


		

		


		
	}

}
