package com.sunbeaminfo.practise5;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InputEmployee extends AppCompatActivity {

    EditText editEmpno,editName,editMobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_employee);
        editEmpno=findViewById(R.id.editEmpno);
        editName=findViewById(R.id.editName);
        editMobile=findViewById(R.id.editMobile);

    }

    public void save(View view)
    {
        Employee employee= new Employee();
        employee.setEmpno(Integer.parseInt(editEmpno.getText().toString()));
        employee.setName(editName.getText().toString());
        employee.setMobile(editMobile.getText().toString());


        AppDatabase.getInstance(this).employeeDao().insertEmployee(employee);
        finish();
    }
}