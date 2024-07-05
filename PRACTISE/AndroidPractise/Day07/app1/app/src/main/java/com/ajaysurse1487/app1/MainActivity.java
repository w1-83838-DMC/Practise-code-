package com.ajaysurse1487.app1;

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
    RecyclerView recyclerview;

    List<Student> studentList;

    StudentAdapter studentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerview=findViewById(R.id.recyclerview);
        studentList=new ArrayList<>();
        studentAdapter=new StudentAdapter(this,studentList);
        recyclerview.setAdapter(studentAdapter);
        recyclerview.setLayoutManager(new GridLayoutManager(this,1));

    }

    @Override
    protected void onStart() {
        super.onStart();
        getData();
    }

    public void getData()
    {
        StudentDbHelper dbHelper=new StudentDbHelper(this);
        studentList=dbHelper.getAllStudents();
        studentAdapter.setStudentList(studentList);
        studentAdapter.notifyDataSetChanged();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent= new Intent(this, InputStudentActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}