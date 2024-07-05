package com.sunbeaminfo.practise3;

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

public class EditDetailsActivity extends AppCompatActivity {

    TextView textRollNo,textName;
    EditText editMarks;

    Student student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_details);

        textRollNo=findViewById(R.id.textRollNo);
        textName=findViewById(R.id.textName);
        editMarks=findViewById(R.id.editMarks);

        Intent intent=getIntent();
        student=(Student)intent.getSerializableExtra("student");
        textRollNo.setText("Roll No"+student.getRollno());
        textName.setText("Name"+student.getName());
        editMarks.setText(""+student.getMarks());

    }

    public void update(View view)
    {
        String marks=editMarks.getText().toString();
        AppDatabase.getInstance(this).studentDao().updateStudent(marks,student.getRollno());
        finish();

    }
}