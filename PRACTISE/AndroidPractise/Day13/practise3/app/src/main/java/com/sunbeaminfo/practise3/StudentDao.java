package com.sunbeaminfo.practise3;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface StudentDao {



    @Query("SELECT * FROM student")
    List<Student> getAllStudent();


    @Insert
    void InsertStudent(Student student);


    @Query("UPDATE student SET marks=:marks WHERE rollno=:rollno")
    void updateStudent(String marks, int rollno);



    @Delete
    void deleteStudent(Student student);


}

