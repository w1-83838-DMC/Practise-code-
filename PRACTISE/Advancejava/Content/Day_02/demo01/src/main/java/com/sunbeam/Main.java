package com.sunbeam;

import java.util.List;
import java.util.Scanner;

// Hackathon Implementation -- Assignment
public class Main {
    // you may keep whole user object here
    public static User CUR_USER = null;
    public static void userMenu(Scanner sc) {
        int choice;
        do {
            System.out.print("\n0. Exit\n1. Show Categories\n2. Create Blog\nEnter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0: // Log out
                    CUR_USER = null;
                    break;
                case 1: // Show Categories
                    displayCategories(sc);
                    break;
                case 2: // Create Blog
                   // createNewBlog(sc);
                    break;
            }
        }while(choice != 0);
    }

    private static void displayCategories(Scanner sc) {
        try (CategoryDao catDao = new CategoryDao()) {
            List<Category> list = catDao.findAll();
            for(Category c:list)
                System.out.println(c);
        } // catDao.close();
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // private static void createNewBlog(Scanner sc) {
    //     if(sc.hasNextLine())
    //         sc.nextLine(); // read and discard \n
    //     try(BlogDao blogDao = new BlogDao()) {
    //         System.out.print("Enter title: ");
    //         String title = sc.nextLine();
    //         System.out.print("Enter contents: ");
    //         String contents = sc.nextLine();
    //         int userId = CUR_USER.getId();
    //         System.out.print("Enter category id: ");
    //         int categoryId = sc.nextInt();
    //         Blog b = new Blog(0, title, contents, userId, categoryId, null);
    //         int count = blogDao.save(b);
    //         System.out.println("Rows Affected: " + count);
    //     } // userDao.close();
    //     catch(Exception e) {
    //         e.printStackTrace();
    //     }
    // }

    public static void mainMenu(Scanner sc) {
        int choice;
        do {
            System.out.print("\n0. Exit\n1. Sign In\n2. Sign Up\nEnter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: // Sign In
                    CUR_USER = authenticate(sc);
                    if(CUR_USER != null)
                        userMenu(sc);
                    else
                        System.out.println("Invalid Login.");
                    break;
                case 2: // Sign Up
                    registerUser(sc);
                    break;
            }
        }while(choice != 0);
    }

    private static void registerUser(Scanner sc) {
        if(sc.hasNextLine())
            sc.nextLine(); // read and discard \n
        try(UserDao userDao = new UserDao()) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            System.out.print("Enter password: ");
            String passwd = sc.nextLine();
            System.out.print("Enter phone: ");
            String phone = sc.nextLine();
            User u = new User(0, name, email, passwd, phone, null);
            int count = userDao.save(u);
            System.out.println("Rows Affected: " + count);
        } // userDao.close();
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static User authenticate(Scanner sc) {
        if(sc.hasNextLine())
            sc.nextLine(); // read and discard \n
        String email, password;
        System.out.print("Enter email: ");
        email = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();
        try(UserDao userDao = new UserDao()) {
            User user = userDao.findByEmailAndPassword(email, password);
            return user;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainMenu(sc);
        sc.close();
    }
}