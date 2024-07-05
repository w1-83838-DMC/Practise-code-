package com.ajaysurse1487.app3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class StudentActivity extends AppCompatActivity {

    ListView listStudents;

    List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        studentList= new ArrayList<>();
        studentList.add(new Student(1,"stu1","12345",60));
        studentList.add(new Student(2,"stu2","4567",70));
        studentList.add(new Student(3,"stu3","7890",80));
        studentList.add(new Student(4,"stu4","9876",90));
        studentList.add(new Student(5,"stu5","6543",96));
        listStudents=findViewById(R.id.listStudents);
//        ArrayAdapter adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,studentList);
//        listStudents.setAdapter(adapter);
        MyAdapter myAdapter= new MyAdapter(this,studentList);
        listStudents.setAdapter(myAdapter);
        listStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(StudentActivity.this, StudentDetailsActivity.class);
                intent.putExtra("student",studentList.get(position));
                startActivity(intent);
            }
        });




    }
}