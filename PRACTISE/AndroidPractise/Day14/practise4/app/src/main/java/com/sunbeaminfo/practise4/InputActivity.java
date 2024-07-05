package com.sunbeaminfo.practise4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InputActivity extends AppCompatActivity {

    EditText editName,editEmpNo,editMobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        editName=findViewById(R.id.editName);
        editEmpNo=findViewById(R.id.editEmpNo);
        editMobile=findViewById(R.id.editMobile);
    }
    public void save(View view)
    {
        Employee employee= new Employee();
        employee.setName(editName.getText().toString());
        employee.setEmpno(Integer.parseInt(editEmpNo.getText().toString()));
        employee.setMobile(Double.parseDouble(editMobile.getText().toString()));

        AppDatabase.getInstance(this).employeeDao().insertEmployee(employee);
        finish();




    }
}