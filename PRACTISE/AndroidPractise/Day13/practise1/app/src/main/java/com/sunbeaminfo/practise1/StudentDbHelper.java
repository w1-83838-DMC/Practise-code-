package com.sunbeaminfo.practise1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.List;

public class StudentDbHelper extends SQLiteOpenHelper {

    public StudentDbHelper(@Nullable Context context) {
        super(context,"dmc_db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql= "CREATE TABLE student(rollno INTEGER,name TEXT,marks DECIMAL(5,2))";
        db.execSQL(sql);

    }
    public List<Student>getAllStudents()
    {
        SQLiteDatabase db=getReadableDatabase();
        Cursor cusor=db.query("student",null,null,null,null,null,null);
        List<Student> studentList= new ArrayList<>();
        while(cusor.moveToNext())
        {
            Student student= new Student();
            student.setRollNo(cusor.getInt(0));
            student.setName(cusor.getString(1));
            student.setMarks(cusor.getString(2));
            studentList.add(student);
        }
        return studentList;
    }

    public void insertStudent(Student student)
    {
        // get the Object of SQLiteDatabase
        SQLiteDatabase db=getWritableDatabase();
        // Object that will be pass the student values to the student table
        ContentValues values= new ContentValues();
        values.put("rollno",student.getRollNo());
        values.put("name",student.getName());
        values.put("marks",student.getMarks());

        // insert student into student table
        db.insert("student",null,values);
    }
    public void deleteStudent(int rollno)
    {
        SQLiteDatabase db= getWritableDatabase();
        db.delete("student","rollno=?",new String[]{""+rollno});
    }
    public void updateStudent(Student student)
    {
        SQLiteDatabase db= getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put("marks",student.getMarks());
        db.update("student",values,"rollno=?",new String[]{""+student.getRollNo()});

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
