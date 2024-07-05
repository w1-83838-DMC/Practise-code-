package com.ajaysurse1487.app3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder> {

    Context context;
    List<Course> courseList;

    public CourseAdapter(Context context, List<Course> courseList) {
        this.context = context;
        this.courseList = courseList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //View view = LayoutInflater.from(context).inflate(R.layout.list_course, null); // it inflate xml into java object
       View view= LayoutInflater.from(context).inflate(R.layout.list_course2,null);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //holder.textName.setText(courseList.get(position).getName());
        holder.textName.setText(courseList.get(position).getName());
        holder.textFees.setText(" " + courseList.get(position).getFees());
        holder.imageView.setImageResource(courseList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        TextView textName, textFees;
        ImageView imageView;

        public MyViewHolder(@NonNull View view) {
            super(view);
            textName = view.findViewById(R.id.textName);
            textFees = view.findViewById(R.id.textFees);
            imageView = view.findViewById(R.id.imageView);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, CourseDetailsActivity.class);
            intent.putExtra("Course", courseList.get(getAdapterPosition()));
            context.startActivity(intent);

        }

        @Override
        public boolean onLongClick(View v) {
            PopupMenu popupMenu= new PopupMenu(context,v);
            popupMenu.getMenu().add("Delete");
            popupMenu.show();

            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    courseList.remove(getAdapterPosition());
                    CourseAdapter.this.notifyDataSetChanged();
                    return false;
                }
            });

            return false;
        }
    }
}
