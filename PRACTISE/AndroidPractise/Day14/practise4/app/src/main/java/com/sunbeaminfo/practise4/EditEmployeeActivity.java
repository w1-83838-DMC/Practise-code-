package com.sunbeaminfo.practise4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EditEmployeeActivity extends AppCompatActivity {
    TextView TextEmpno,TextName;

    EditText EditMobile;

    Employee employee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_employee);
        TextEmpno=findViewById(R.id.TextEmpno);
        TextName=findViewById(R.id.TextName);
        EditMobile=findViewById(R.id.EditMobile);

        Intent intent=getIntent();
        employee=(Employee) intent.getSerializableExtra("employee");
        TextName.setText("Employee No"+employee.getName());
        TextEmpno.setText("Name "+employee.getEmpno());
        EditMobile.setText("Mobile "+employee.getMobile());

    }

    public void update(View view)
    {
        double mobile= Double.parseDouble(EditMobile.getText().toString());
        AppDatabase.getInstance(this).employeeDao().updateEmployee(mobile,employee.getEmpno());
        finish();

    }
}