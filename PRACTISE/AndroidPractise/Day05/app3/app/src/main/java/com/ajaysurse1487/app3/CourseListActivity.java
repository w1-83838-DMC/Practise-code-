package com.ajaysurse1487.app3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CourseListActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    List<Course> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
        recyclerView=findViewById(R.id.recyclerView);
        courseList=new ArrayList<>();
        courseList.add(new Course(1,"PG-DAC","PG-DAC is the most popular PG Diploma course of C-DAC. The course is targeted towards Engineering Graduates and MCA/MSc who wish to venture into the domain of advanced computing. The course aims to groom the students to enable them to work on current technology scenarios as well as prepare them to keep pace with the changing face of technology and the requirements of the growing IT industry.",90000,"Sunbeam pune,Sunbeam karad",R.drawable.dac));
        courseList.add(new Course(2,"PG-DMC","The Post-Graduate Diploma in Mobile Computing (PG-DMC) is one of the pioneering programs of ACTS. The main focus of this course is to enable the candidates fulfilling the eligibility criteria, to develop their skill set mainly in areas like Native and Hybrid Mobile Application Development. The course also focuses on Java Programming, as part of the industry requirement.",90000,"Sunbeam pune, sunbeam karad",R.drawable.dmc));
        courseList.add(new Course(3,"PG-DESD","Realizing the growth of embedded systems in day-to-day life and the need for trained manpower in this promising area, C-DAC has launched a Post Graduate Diploma in Embedded Systems Design (PG-DESD) for Engineers in computers, electronics and IT",90000,"Sunbeam Pune",R.drawable.desd));
        courseList.add(new Course(4,"PG-DBDA","The theoretical and practical mix of the Post Graduate Diploma in Big Data Analytics (PG-DBDA) programme has the following focus",11500,"Sunbeam pune",R.drawable.dbda));
        courseList.add(new Course(5,"PG-DITISS","To understand the Concepts of Data Centre Management, applications security implementation and use various techniques for Ethical Hacking and Cyber Forensics",90000,"Sunbeam Pune",R.drawable.ditiss));
        CourseAdapter courseAdapter= new CourseAdapter(this,courseList);
        recyclerView.setAdapter(courseAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }
}