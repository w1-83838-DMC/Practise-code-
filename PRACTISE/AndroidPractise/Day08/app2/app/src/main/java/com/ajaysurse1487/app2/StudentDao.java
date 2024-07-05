package com.ajaysurse1487.app2;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDao {

    @Query("SELECT * FROM student")
    List<Student>getAllStudent();

    @Insert
    public void insertStudent(Student student);

    @Query("UPDATE student SET marks=:marks WHERE rollno=:rollno")
    public void updateStudent(double marks,int rollno);

    @Delete
    public void deleteStudent(Student student);
}
