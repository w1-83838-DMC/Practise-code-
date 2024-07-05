package com.ajaysurse1487.app3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter{

    List<Student> studentList;
    Context context;

    public MyAdapter(Context context,List<Student> studentList) {
        this.studentList = studentList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v= LayoutInflater.from(context).inflate(R.layout.list_student,null);
        TextView textRollNo= v.findViewById(R.id.textRollNo);
        TextView textName=v.findViewById(R.id.textName);
        textRollNo.setText("RollNo-" +studentList.get(position).getRollno());
        textName.setText("Name"+ studentList.get(position).getName());
        return  v;


    }
}
