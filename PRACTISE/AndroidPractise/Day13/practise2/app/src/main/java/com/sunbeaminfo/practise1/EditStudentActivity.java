package com.sunbeaminfo.practise1;

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

public class EditStudentActivity extends AppCompatActivity {

    TextView textRollNo,textName;
    EditText editMarks;

    Student student;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student);
        textRollNo=findViewById(R.id.textRollNo);
        textName=findViewById(R.id.textName);
        editMarks=findViewById(R.id.editMarks);

        Intent intent=getIntent();
        student=(Student) intent.getSerializableExtra("student");
        textRollNo.setText("RollNo : "+student.getRollNo());
        textName.setText("Name : "+student.getName());
        editMarks.setText(""+student.getMarks());

    }

    public void update(View view) {
        String marks = editMarks.getText().toString();
        student.setMarks(marks);
        //StudentDbHelper studentDbHelper= new StudentDbHelper(this);
        //studentDbHelper.updateStudent(student);
        AppDatabase.getInstance(this).studentDao().updateStudent(marks,student.getRollNo());
        finish();
    }
}