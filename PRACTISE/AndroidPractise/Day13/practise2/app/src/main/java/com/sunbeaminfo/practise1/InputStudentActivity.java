package com.sunbeaminfo.practise1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InputStudentActivity extends AppCompatActivity {

    EditText editRollNo,editName,editMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_student);
        editRollNo=findViewById(R.id.editRollNo);
        editName=findViewById(R.id.editName);
        editMarks=findViewById(R.id.editMarks);
    }
    public void save(View view)
    {
        Student student = new Student();
        student.setRollNo(Integer.parseInt(editRollNo.getText().toString()));
        student.setName(editName.getText().toString());
        student.setMarks(editMarks.getText().toString());

        //StudentDbHelper studentDbHelper = new StudentDbHelper(this);
        //studentDbHelper.insertStudent(student);
        AppDatabase.getInstance(this).studentDao().insertStudent(student);
        finish();
    }
}