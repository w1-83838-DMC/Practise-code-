package com.ajaysurse1487.app2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<Student> studentList;

    StudentAdapter studentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        studentList= new ArrayList<>();
        studentList.add(new Student(1,"Ajay",50));
        studentList.add(new Student(2,"jay",60));
        studentList.add(new Student(3,"harsh",70));
        studentList.add(new Student(4,"yash",80));
        studentAdapter= new StudentAdapter(this,studentList);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        studentAdapter.notifyDataSetChanged();

    }
}