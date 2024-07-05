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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        studentList=new ArrayList<>();
        studentList.add(new Student(1,"Stu1",50));
        studentList.add(new Student(2,"Stu2",60));
        studentList.add(new Student(3,"Stu3",70));
        studentList.add(new Student(4,"Stu4",80));
        studentList.add(new Student(5,"Stu5",60));
        studentList.add(new Student(6,"Stu6",70));

        StudentAdapter adapter= new StudentAdapter(this,studentList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }
}