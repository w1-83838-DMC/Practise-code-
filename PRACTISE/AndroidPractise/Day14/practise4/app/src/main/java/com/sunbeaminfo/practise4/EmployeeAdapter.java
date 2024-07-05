package com.sunbeaminfo.practise4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>{

    Context context;

    List<Employee> employeeList;

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public EmployeeAdapter(Context context, List<Employee> employeeList) {
        this.context = context;
        this.employeeList = employeeList;
    }


    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.empl,null);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        holder.textName.setText("Name"+employeeList.get(position).getName());
        holder.textMobile.setText("Mobile"+employeeList.get(position).getMobile());
        holder.textEmpNo.setText("Employee No"+employeeList.get(position).getEmpno());

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener{

        TextView textEmpNo,textName,textMobile;

        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);

            textEmpNo=itemView.findViewById(R.id.textEmpNo);
            textName=itemView.findViewById(R.id.textName);
            textMobile=itemView.findViewById(R.id.textMobile);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public boolean onLongClick(View v) {
            PopupMenu popupMenu= new PopupMenu(context,v);
            popupMenu.getMenu().add("Edit");
            popupMenu.getMenu().add("Delete");
            popupMenu.show();

            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    if(item.getTitle().equals("Edit"))
                    {
                        // Edit
                        Intent intent= new Intent(context, EditEmployeeActivity.class);
                        intent.putExtra("employee",employeeList.get(getAdapterPosition()));
                        context.startActivity(intent);


                    }else if(item.getTitle().equals("Delete"))
                    {
                        // Delete
                        AppDatabase.getInstance(context).employeeDao().deleteEmployee(employeeList.get(getAdapterPosition()));

                        employeeList=AppDatabase.getInstance(context).employeeDao().getEmployee();
                        EmployeeAdapter.this.notifyDataSetChanged();
                    }
                    return false;
                }
            });
            return false;
        }
    }
}
