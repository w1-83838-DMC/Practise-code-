package com.ajaysurse1487.app3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editRollNo,editName,editMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editRollNo=findViewById(R.id.editRollNo);
        editName=findViewById(R.id.editName);
        editMarks=findViewById(R.id.editMarks);
    }

    public void submit(View view)
    {
        int rollno=Integer.parseInt(editRollNo.getText().toString());
        String name=editName.getText().toString();
        double marks=Double.parseDouble(editMarks.getText().toString());

        Student student= new Student(rollno,name,marks);
        Intent intent= new Intent(this, studentDetails.class);
//        intent.putExtra("k_rollno",rollno);
//        intent.putExtra("k_name",name);
//        intent.putExtra("k_marks",marks);
        intent.putExtra("k_students",student);
        startActivity(intent);

    }
}