package com.sunbeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        

        // try(CategoryDao catDao = new CategoryDao())
        // {
        //         List<Category> list=catDao.findAll();
        //         for(Category c: list)
        //         {
        //             System.out.println(c);
        //         }
                
        // }catch(Exception e)
        // {
        //     e.printStackTrace();
        // }

        // try(CategoryDao catDao=new CategoryDao())
        // {
        //     System.out.println("Enter the Title : ");
        //     String title=sc.nextLine();
        //     System.out.println("Enter the Description : ");
        //     String desc=sc.nextLine();
        //     Category c= new Category(0, title, desc);
        //     int count=catDao.save(c);
        //     System.out.println("Affected Rows "+ count);
        // }catch(Exception e)
        // {
        //     e.printStackTrace();
        // }

        // get category by id 
        
        
        // try(CategoryDao catDao= new CategoryDao())
        // {
        //     System.out.println("Enter the Category id : ");
        //     int CatId=sc.nextInt();
        //     Category c = catDao.findById(CatId);
        //     if(c==null)
        //     {
        //         System.out.println("Category Not Found ");
        //     }else
        //     {
        //         System.out.println("Found"+c);
        //     }
        // }
        // catch(Exception e)
        // {
        //     e.printStackTrace();
        // }


        //find By Email

        // try(UserDao userDao = new UserDao())
        // {
        //     System.out.println("Enter the Email : ");
        //     String email=sc.nextLine();
        //     User u=userDao.findByEmail(email);
        //     if(u==null)
        //     {
        //         System.out.println("User not found");
        //     }else
        //     {
        //         System.out.println("Found"+u);
        //     }

        // }catch(Exception e)
        // {
        //     e.printStackTrace();
        // }

        // find by Email and password 

        // try(UserDao userDao= new UserDao())
        // {
        //     System.out.println("Enter the Email id:  ");
        //     String email=sc.nextLine();
        //     System.out.println("Enter the Password ");
        //     String password=sc.nextLine();

        //     User u=userDao.findByEmailAndPassword(email, password);
        //     if(u==null)
        //     {
        //         System.out.println("User Not Found ");
        //     }else
        //     {
        //         System.out.println("User Found "+ u);
        //     }
            
        // }catch(Exception e)
        // {
        //     e.printStackTrace();
        // }

        // create userLogin 

        // try(UserDao userDao = new UserDao())
        // {
        //     System.out.println("Enter the Name ");
        //     String name=sc.nextLine();
        //     System.out.println("Enter the Email ");
        //     String email=sc.nextLine();
        //     System.out.println("Enter the Password ");
        //     String password= sc.nextLine();
        //     System.out.println("Enter the Phone ");
        //     String phone=sc.nextLine();

        //     User u = new User(0,name,email,password,phone,null);
        //     int count = userDao.save(u);

        //     System.out.println("Rows Afected : "+ count);
            
        // }catch(Exception e)
        // {
        //     e.printStackTrace();
        // }

        // Blog 

        // display all blogs

        // try(BlogDao blogdao= new BlogDao())
        // {
        //     List<Blog>list=blogdao.findAll();
        //     for(Blog b: list)
        //     {
        //         System.out.println(b);
        //     } // blog.close(); 
        // }catch(Exception e)
        // {
        //     e.printStackTrace();
        // }

        // insert blog

        // try(BlogDao blogdao= new BlogDao())
        // {
        //     System.out.println("Enter the Title : ");
        //     String title=sc.nextLine();
        //     System.out.println("Enter the Contents : ");
        //     String contents=sc.nextLine();
        //     System.out.println("Enter the User id");
        //     int userId= sc.nextInt();
        //     System.out.println("Enter the Category id ");
        //     int categoryId=sc.nextInt();
        //     Blog b = new Blog(0,title,contents,userId,categoryId,null);
        //     int count =blogdao.save(b);
        //     System.out.println("Row Affected "+ count);
    
        // }catch(Exception e)
        // {
        //     e.printStackTrace();
        // }

        // delete blog by Id 

        // try(BlogDao blogDao = new BlogDao())
        // {
        //     System.out.println("Enter the id : ");
        //     int id=sc.nextInt();
        

        //     int count=blogDao.delete(id);
        //     System.out.println("Rows Afected"+ count);


        // }catch(Exception e)
        // {
        //     e.printStackTrace();
        // }

        // Edit the blogs

        try(BlogDao blogdao= new BlogDao())
        {
            System.out.println("Enter the id ");
            int id=sc.nextInt();
            System.out.println("Enter the Contents ");
            String contents=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the Title ");
            String title=sc.nextLine();
            Blog b=new Blog(id,title,contents);
            int count=blogdao.update(b);
            System.out.println("Rows Afected"+count);

        }catch(Exception e)
        {
            e.printStackTrace();
        }

        
    }
}