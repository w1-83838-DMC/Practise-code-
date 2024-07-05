package com.sunbeaminfo.practise5;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EmployeeDao
{

    @Query("SELECT * FROM  employee")
    List<Employee> getAllEmployee();
    @Insert
    void insertEmployee(Employee employee);

    @Delete
    void deleteEmployee(Employee employee);



}
