package com.sunbeam.boot8jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sunbeam.boot8jdbc.daos.BlogDao;
import com.sunbeam.boot8jdbc.daos.CategoryDao;
import com.sunbeam.boot8jdbc.daos.UserDao;
import com.sunbeam.boot8jdbc.entities.Blog;

import ch.qos.logback.classic.net.SyslogAppender;

@SpringBootApplication
public class Boot8jdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Boot8jdbcApplication.class, args);
	}

	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private BlogDao blogdao;

	@Autowired
	private UserDao userdao;

	@Override
	public void run(String... args) throws Exception {
		// save 
		// Category c= new Category(0, "novels", "NovelsRelatedblogs");
		// int count=categoryDao.save(c);
		// System.out.println("Rows Affected "+ count);

		// update 
		// Category c= new Category(11,"NOVELS","NOVELSWORKS");
		// int count=categoryDao.update(c);
		// System.out.println("Rows Affected "+ count);

		//delete by Id 

		// Category c= new Category();
		// int count = categoryDao.deleteById(10);
		// System.out.println("Rows Afected "+ count);

		// find by Id
		// Category c = categoryDao.findById(4);
		// System.out.print(c.toString());


		// find all 

		// Category c= new Category();
		// List<Category>list=categoryDao.findAll();
		// for(Category c1: list)
		// {
		// 	System.out.println(c1);
		// }


		// insert Blogs

		// Blog b= new Blog(0, "History", "History is an arebic descipline", 2, 3, null);
		// int count=blogdao.save(b);
		// System.out.println("Count Affected"+ count);


		//Update blog

		// Blog b= new Blog(11, "java OPERRATING SYSTEMS LANGAUGEDs ", "C LANGUAGE CPP PROGRAMMING JAVA PROGRAMMING APP", 6, 1, null);
		// int count=blogdao.update(b);
		// System.out.println("Rows Affected"+ count);

		//delete blog ById

		// Blog b= new Blog();
		// int count=blogdao.deleteById(3);
		// System.out.println("Rows Afected"+ count);


		// find By Id in Blogs
		//Blog b= new Blog();
		// Blog b1=blogdao.findById(2);
		// System.out.println(b1.toString());


		// find All 

		List<Blog> list=blogdao.findAll();
		for(Blog a:list)
		{
			System.out.println(a);
		}





		// save users
		// User u= new User(0, "Ajay", "jay@", "jay", "84322556",null);
		// int count=userdao.save(u);
		// System.out.println("ROWS AFFECTED"+ count);


		// edit users

		// User u1= new User(10, "AJAY", "AJAYSURSE1487@GMAIL.COM", "AJAY", "8765442578", null);
		// int count=userdao.update(u1);
		// System.out.println("Rows Affected"+ count);


		// delete users

		// User u1= new User();
		// int count=userdao.deleteById(10);
		// System.out.println("Rows Afected"+ count);


		// findById

			// User u2=userdao.findById(10);
			// System.out.println(u2);

		// findAll

			// List<User>list=userdao.findAll();
			// for(User a:list)
			// {
			// 	System.out.println(a);
			// }

	











		

		



		
	}

}
