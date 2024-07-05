package com.ajaysurse1487.app4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StudentDetailsActivity extends AppCompatActivity {

    TextView textRollNo,textName,textMarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        textRollNo= findViewById(R.id.textRollNo);
        textName= findViewById(R.id.textName);
        textMarks= findViewById(R.id.textMarks);

        Intent intent=getIntent();
        Student student=(Student) intent.getSerializableExtra("student");

        textRollNo.setText("RollNo"+student.getRollno());
        textName.setText("Name"+student.getName());
        textName.setText("Marks"+student.getMarks());


    }
}