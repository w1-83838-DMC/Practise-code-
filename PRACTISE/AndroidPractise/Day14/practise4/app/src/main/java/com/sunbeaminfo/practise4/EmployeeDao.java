package com.sunbeaminfo.practise4;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EmployeeDao {

    @Insert
    void insertEmployee(Employee employee);

    @Query("SELECT * from employee")
    List<Employee>getEmployee();

    @Delete
    void deleteEmployee(Employee employee);

    @Query("UPDATE employee SET mobile=:mobile WHERE empno=:empno")
    void updateEmployee(double mobile,int empno);

}
