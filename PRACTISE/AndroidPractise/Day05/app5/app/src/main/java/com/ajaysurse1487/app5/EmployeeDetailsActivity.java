package com.ajaysurse1487.app5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EmployeeDetailsActivity extends AppCompatActivity {


    TextView textId,textName,textMobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_details);
        textId=findViewById(R.id.textId);
        textName=findViewById(R.id.textName);
        textMobile=findViewById(R.id.textMobile);
        Intent intent=getIntent();
        Employee employee=(Employee) intent.getSerializableExtra("Employee");
        //Toast.makeText(this, employee.toString(), Toast.LENGTH_SHORT).show();
        textId.setText("Id "+ employee.getId());
        textName.setText("Name "+employee.getName());
        textMobile.setText("Mobile "+employee.getMobile());


    }
}