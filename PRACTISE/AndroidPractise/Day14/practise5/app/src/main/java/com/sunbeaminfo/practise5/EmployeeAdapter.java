package com.sunbeaminfo.practise5;

import android.content.Context;
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
        View view= LayoutInflater.from(context).inflate(R.layout.list_em,null);
        return new EmployeeViewHolder(view);

    }
    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        holder.TextEmpno.setText("Emp No "+employeeList.get(position).getEmpno());
        holder.TextName.setText("Emp Name "+employeeList.get(position).getName());
        holder.TextMobile.setText("Mobile "+employeeList.get(position).getMobile());

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener{

        TextView TextEmpno,TextName,TextMobile;
        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);
            TextEmpno=itemView.findViewById(R.id.TextEmpno);
            TextName=itemView.findViewById(R.id.TextName);
            TextMobile=itemView.findViewById(R.id.TextMobile);
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

                    }else if(item.getTitle().equals("Delete"))
                    {
                        // Delete
                        AppDatabase.getInstance(context).employeeDao().deleteEmployee(employeeList.get(getAdapterPosition()));

                        // To refresh the list

                        employeeList=AppDatabase.getInstance(context).employeeDao().getAllEmployee();
                        EmployeeAdapter.this.notifyDataSetChanged();




                    }
                    return false;
                }
            });
            return false;
        }
    }
}
