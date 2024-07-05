package com.sunbeaminfo.practise4;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
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

    List<Employee> employeeList;

    EmployeeAdapter employeeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        recyclerView=findViewById(R.id.recyclerView);
        setSupportActionBar(toolbar);
        employeeList= new ArrayList<>();
        employeeAdapter=new EmployeeAdapter(this,employeeList);
        recyclerView.setAdapter(employeeAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }

    @Override
    protected void onStart() {
        super.onStart();
        getData();
    }

    public void getData()
    {
        employeeList=AppDatabase.getInstance(this).employeeDao().getEmployee();
        employeeAdapter.setEmployeeList(employeeList);
        employeeAdapter.notifyDataSetChanged();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.list,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent= new Intent(this, InputActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);

    }
}