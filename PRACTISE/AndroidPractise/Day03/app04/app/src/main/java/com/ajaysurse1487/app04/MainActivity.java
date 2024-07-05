package com.ajaysurse1487.app04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textRollNo,textName,textMarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textRollNo=findViewById(R.id.textRollNo);
        textName=findViewById(R.id.textName);
        textMarks=findViewById(R.id.textMarks);

    }

    ActivityResultLauncher activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            //Toast.makeText(MainActivity.this, "onActivityResult()", Toast.LENGTH_SHORT).show();
            Intent intent=result.getData();
            Student student=(Student)intent.getSerializableExtra("student");
            textRollNo.setText("Roll No" + student.getRollno());
            textName.setText("Name " + student.getName());
            textMarks.setText("Marks "+ student.getMarks());
        }
    });

    public void getData(View view)
    {
        Intent intent= new Intent(this, InputStudent.class);
        activityResultLauncher.launch(intent);
    }


}