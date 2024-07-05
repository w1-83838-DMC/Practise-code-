package com.sunbeaminfo.practise1;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDao {

    @Query("SELECT * FROM student")
    List<Student>getAllStudents();

    @Insert
    void insertStudent(Student student);

    @Query("UPDATE student SET marks=:marks WHERE rollNo=:rollno")
    void updateStudent(String marks,int rollno);

    @Delete
    void deleteStudent(Student student);
}

