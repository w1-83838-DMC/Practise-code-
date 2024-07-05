package com.ajaysurse1487.app5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class EmployeeAdapter extends BaseAdapter{

    Context context;
    List<Employee> employeelist;

    public EmployeeAdapter(Context context, List<Employee> employeelist) {
        this.context = context;
        this.employeelist = employeelist;
    }

    @Override
    public int getCount() {
        return employeelist.size();
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
    public View getView(int position, View view, ViewGroup viewgroup) {
            View v= LayoutInflater.from(context).inflate(R.layout.list_employee,null);
            TextView textId=v.findViewById(R.id.textId);
            TextView textName=v.findViewById(R.id.textName);
            TextView textMobile=v.findViewById(R.id.textMobile);
            textId.setText("Id "+ employeelist.get(position).getId());
            textName.setText("Name : " + employeelist.get(position).getName());
            textMobile.setText("Mobile :"+ employeelist.get(position).getMobile());


        return v;
    }
}
