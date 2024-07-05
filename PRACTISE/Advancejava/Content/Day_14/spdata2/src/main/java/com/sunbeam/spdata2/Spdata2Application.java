package com.sunbeam.spdata2;

import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sunbeam.spdata2.daos.BlogDao;
import com.sunbeam.spdata2.daos.CategoryDao;
import com.sunbeam.spdata2.entities.Blog;
import com.sunbeam.spdata2.entities.Category;

@SpringBootApplication
public class Spdata2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Spdata2Application.class, args);
	}

	@Autowired
	public BlogDao blogDao;

	@Autowired
	public CategoryDao categoryDao;

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		// Category c= new Category(100, " Lomak Magic  ", "Magical Blogs");
		// System.out.println(" Category "+ c.getId() +","+ c.getTitle() +","+ c.getDescription());


		// Optional<Blog> b=blogDao.findById(2);
		// if(b.isPresent())
		// {
		// 	System.out.println("found"+ b.get());
		// 	System.out.println("Blog Category"+ b.get().getCategory());
		// }else
		// {
		// 	System.out.println("Blog Not found");

		// }
		// One to many Lazzy In
		// Optional<Category> c=categoryDao.findById(5);
		// if(c.isPresent())
		// {
		// 	System.out.print("Found"+ c.get());
		// 	for(Blog b:c.get().getBlogList())
		// 		System.out.println("-"+ b);			
		// }else
		// {
		// 	System.out.println("Category Not Found");
		// }

		// try Without cascade or fetch in Blog class (on Category filed)
		// Optional<Category> oc=categoryDao.findById(14);
		// Blog b= new Blog(0, "JPA Relations", "JPA supports 4 relations 1-1 1-M M-1 M-M", new Date(),oc.get());

		

	}


}
