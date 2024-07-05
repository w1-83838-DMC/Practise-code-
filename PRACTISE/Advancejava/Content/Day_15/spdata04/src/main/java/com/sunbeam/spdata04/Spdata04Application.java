package com.sunbeam.spdata04;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sunbeam.spdata04.daos.StudentDao;
import com.sunbeam.spdata04.entities.Student;

@SpringBootApplication
public class Spdata04Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Spdata04Application.class, args);
	}

	@Autowired
	private StudentDao studentDao;
	@Override
	public void run(String... args) throws Exception {

		Student s= new Student(1, 3, "shri", 98.3);
		studentDao.save(s);
		System.out.println("Student saved");

		List<Student> list = studentDao.findAll();
		for(Student s1: list)
		{
			System.err.println(s1);
		}
		
		 
	}

}
