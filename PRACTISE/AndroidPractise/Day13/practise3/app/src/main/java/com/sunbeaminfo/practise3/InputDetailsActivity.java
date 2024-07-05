package com.sunbeaminfo.practise3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InputDetailsActivity extends AppCompatActivity {

    EditText editRollNo,editName,editMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_details);
        editRollNo=findViewById(R.id.editRollNo);
        editName=findViewById(R.id.editName);
        editMarks=findViewById(R.id.editMarks);

    }

    public void save(View view)
    {
        Student student= new Student();
        student.setRollno(Integer.parseInt(editRollNo.getText().toString()));
        student.setName(editName.getText().toString());
        student.setMarks(Double.parseDouble(editMarks.getText().toString()));

        AppDatabase.getInstance(this).studentDao().InsertStudent(student);
        finish();

    }
}