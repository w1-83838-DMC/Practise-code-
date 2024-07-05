package com.ajaysurse1487.app2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder>{

    Context context;
    List<Student> studentList;

    public StudentAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_student,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textRollNo.setText("Roll no -"+ studentList.get(position).getRollno());
        holder.textName.setText("Name -"+ studentList.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textRollNo,textName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textRollNo=itemView.findViewById(R.id.textRollNo);
            textName=itemView.findViewById(R.id.textName);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(context, StudentDetailsActivity.class);
                    intent.putExtra("Student",studentList.get(getAdapterPosition()));
                    context.startActivity(intent);

                }
            });

        }
    }
}
