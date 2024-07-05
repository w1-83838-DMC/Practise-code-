package com.sunbeam.spdata1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sunbeam.spdata1.daos.CategoryDao;
import com.sunbeam.spdata1.entities.Category;

@SpringBootApplication
public class Spdata1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Spdata1Application.class, args);
	}

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public void run(String... args) throws Exception {
		Category c= new Category(1, "Spring Data", "Spring Data blogs");
		// c=categoryDao.save(c);
		// System.out.println("Category Saved: "+ c);

		// update 
		// c=new Category(14, "Spring Boot ", "Spring Boot Blogs");
		// c= categoryDao.save(c);
		// System.out.println("Category Updatad"+ c);

		// delete 
		// categoryDao.deleteById(24);
		// System.out.println("Category Deleted");

		// List<Category>list=categoryDao.findAll();
		// for(Category ct: list)
		// {
		// 	System.out.print(ct);
		// }
		// System.out.println();

		int id= 5;

		Optional<Category>optCat=categoryDao.findById(id);
		if(optCat.isPresent())
		{
			System.out.println("Category Found "+optCat.get());
		}else
		{
			System.out.println("Category Not Found");
		}



		


		
	}

}
