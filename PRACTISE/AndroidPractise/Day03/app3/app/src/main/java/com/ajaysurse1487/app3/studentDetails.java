package com.ajaysurse1487.app3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class studentDetails extends AppCompatActivity {

    TextView textRollno,textName,textMarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        textRollno = findViewById(R.id.textRollNo);
        textName = findViewById(R.id.textName);
        textMarks = findViewById(R.id.textMarks);

        Intent intent = getIntent();
//        int rollno=intent.getIntExtra("k_rollno",0);
//        String name=intent.getStringExtra("k_name");
//        double marks=intent.getDoubleExtra("k_marks",0);
//
//        textRollno.setText("RollNo" + rollno);
//        textName.setText("Name" + name);
//        textMarks.setText("Marks"+ marks);

        Student student=(Student)intent.getSerializableExtra("k_students");
        textRollno.setText("RollNo " + student.getRollno());
        textName.setText("Name "+ student.getName());
        textMarks.setText("Marks "+ student.getMarks());


    }
}