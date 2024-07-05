package com.sunbeam.beans;

import java.util.List;

import com.sunbeam.daos.CategoryDao;
import com.sunbeam.entities.Category;
public class CategoryListBean {
  
    private List<Category>categoryList;
    public List<Category> getCategoryList() {
        return categoryList;
    }
    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
    public void fetchCategory()
    {
        try(CategoryDao categoryDao = new CategoryDao())
        {
            if(categoryDao != null)
            {
                categoryList=categoryDao.findAll();
                System.out.println(categoryList);
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
