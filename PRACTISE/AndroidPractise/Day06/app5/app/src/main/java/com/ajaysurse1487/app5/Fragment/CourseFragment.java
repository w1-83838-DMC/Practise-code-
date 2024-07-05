package com.ajaysurse1487.app5.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ajaysurse1487.app5.Adapter.CourseListAdapter;
import com.ajaysurse1487.app5.Entities.Course;
import com.ajaysurse1487.app5.R;

import java.util.ArrayList;
import java.util.List;

public class CourseFragment extends Fragment {

    RecyclerView listCourses;

    List<Course> courseList;

    CourseListAdapter courseListAdapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        courseList=new ArrayList<>();
        courseList.add(new Course(1,"PG_DAC",90000,"This is DAC Course",R.drawable.dac));
        courseList.add(new Course(2,"PG-DMC",90000,"This is DMC Course",R.drawable.dmc));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_course, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listCourses=view.findViewById(R.id.listCourses);
        courseListAdapter=new CourseListAdapter(getContext(),courseList);
        listCourses.setAdapter(courseListAdapter);
        listCourses.setLayoutManager(new GridLayoutManager(getContext(),1));





    }
}