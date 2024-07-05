package com.ajaysurse1487.app5;

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

public class EmployeeActivity extends AppCompatActivity {

    List<Employee> employeelist;

    ListView listEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        employeelist= new ArrayList<>();
        employeelist.add(new Employee(1,"Ajay","98765432",87000));
        employeelist.add(new Employee(2,"Jay","7654321",98765));
        employeelist.add(new Employee(3,"harsh","3456789",7654));
        listEmployee=findViewById(R.id.listEmployee);
        EmployeeAdapter employeeAdapter= new EmployeeAdapter(this,employeelist);
        listEmployee.setAdapter(employeeAdapter);
        listEmployee.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(EmployeeActivity.this, EmployeeDetailsActivity.class);
                intent.putExtra("Employee", employeelist.get(position));
                startActivity(intent);
            }
        });





    }
}