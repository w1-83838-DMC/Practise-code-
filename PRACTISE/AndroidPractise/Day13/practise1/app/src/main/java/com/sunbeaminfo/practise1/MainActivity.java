package com.sunbeaminfo.practise1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    RecyclerView recyclerView;

    StudentAdapter studentAdapter;

    List<Student>studentList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        recyclerView=findViewById(R.id.recyclerView);
        setSupportActionBar(toolbar);
        studentList= new ArrayList<>();
        studentAdapter= new StudentAdapter(this,studentList);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }

    @Override
    protected void onStart() {
        super.onStart();
        getData();
    }

    public void getData()
    {
        StudentDbHelper studentDbHelper= new StudentDbHelper(this);
        studentList=studentDbHelper.getAllStudents();
        studentAdapter.setStudentList(studentList);
        studentAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent= new Intent(this, InputStudentActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);

    }
}