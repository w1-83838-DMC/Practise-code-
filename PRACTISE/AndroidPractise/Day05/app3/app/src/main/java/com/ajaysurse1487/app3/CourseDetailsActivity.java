package com.ajaysurse1487.app3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CourseDetailsActivity extends AppCompatActivity {

    TextView textCourseId,textCourseName,textFees,textTrainingCenter,textDesc;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);
        textCourseId=findViewById(R.id.textCourseId);
        textCourseName=findViewById(R.id.textCourseName);
        textFees=findViewById(R.id.textFees);
        textTrainingCenter=findViewById(R.id.textTrainingCenter);
        textDesc=findViewById(R.id.textDesc);
        imageView=findViewById(R.id.imageView);
        Intent intent=getIntent();
        Course course=(Course)intent.getSerializableExtra("Course");
        imageView.setImageResource(course.getImage());
        textCourseId.setText("Course Id "+ course.getId());
        textCourseName.setText("Course Name "+ course.getName());
        textFees.setText("Course Fees "+ course.getFees());
        textTrainingCenter.setText(" Center "+ course.getTraningCenterName());
        textDesc.setText("Desc "+ course.getDescription());
    }
}