package com.ajaysurse1487.app5.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ajaysurse1487.app5.Entities.Course;
import com.ajaysurse1487.app5.R;

import java.util.List;

public class CourseListAdapter extends RecyclerView.Adapter<CourseListAdapter.CourseViewHolder>{

    Context context;
    List<Course>courseList;

    public CourseListAdapter(Context context, List<Course> courseList) {
        this.context = context;
        this.courseList = courseList;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_course,null);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    class CourseViewHolder extends RecyclerView.ViewHolder{

        TextView textName,textFees;
        ImageView imageCourse;
        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            imageCourse=itemView.findViewById(R.id.imageCourse);
            textName=itemView.findViewById(R.id.textName);
            textFees=itemView.findViewById(R.id.textFess);

        }
    }
}
