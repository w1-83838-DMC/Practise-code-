package com.ajaysurse1487.app1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class StudentDbHelper extends SQLiteOpenHelper {

    public StudentDbHelper(@Nullable Context context) {
        super(context,"dmc_db",null,1);
    }

    public List<Student>getAllStudents()
    {
        SQLiteDatabase db=getReadableDatabase();
        Cursor cursor=db.query("student",null,null,null,null,null,null);
        List<Student> studentList= new ArrayList<>();
        while (cursor.moveToNext())
        {
            Student student= new Student();
            student.setRollno(cursor.getInt(0));
            student.setName(cursor.getString(1));
            student.setMarks(cursor.getDouble(2));
            studentList.add(student);
        }
        return studentList;
    }

    public void insertStudent(Student student)
    {
        // get the Object of SQLITEDATABASE
       SQLiteDatabase db=getWritableDatabase();

        ContentValues values= new ContentValues();
        values.put("rollno",student.getRollno());
        values.put("name",student.getName());
        values.put("marks",student.getMarks());

        db.insert("student",null,values);
    }
    public void deleteStudent(int rollno)
    {
        SQLiteDatabase db=getWritableDatabase();
        db.delete("student","rollno=?",new String[]{""+rollno});

    }
    public void updateStudent(Student student)
    {
        SQLiteDatabase db=getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put("marks",student.getMarks());
        db.update("student",values,"rollno=?",new String[]{" "+student.getRollno()});

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="CREATE TABLE student (rollno INTEGER,name TEXT,marks DECIMAL(5,2))";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
