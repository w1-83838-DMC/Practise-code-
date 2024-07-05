package com.ajaysurse1487.admin.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ajaysurse1487.admin.R;
import com.ajaysurse1487.admin.dbhelper.MobileDbHelper;
import com.ajaysurse1487.admin.entity.EditMobileActivity;
import com.ajaysurse1487.admin.entity.Mobile;

import java.util.List;

public class MobileAdapter extends RecyclerView.Adapter<MobileAdapter.MobileViewHolder>{

    Context context;

    List<Mobile> mobileList;

    public void setMobileList(List<Mobile> mobileList) {
        this.mobileList = mobileList;
    }

    public MobileAdapter(Context context, List<Mobile> mobileList) {
        this.context = context;
        this.mobileList = mobileList;
    }

    @NonNull
    @Override
    public MobileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_mobile,null);
        return  new MobileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MobileViewHolder holder, int position) {
        holder.textName.setText(mobileList.get(position).getName());
        holder.textPrice.setText(""+mobileList.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return mobileList.size();
    }

    class MobileViewHolder extends RecyclerView.ViewHolder{

        TextView textName,textPrice;
        ImageView imageEdit,imageDelete;
        public MobileViewHolder(@NonNull View itemView) {
            super(itemView);

            textName=itemView.findViewById(R.id.textName);
            textPrice=itemView.findViewById(R.id.textPrice);
            imageEdit=itemView.findViewById(R.id.imageEdit);
            imageDelete=itemView.findViewById(R.id.imageDelete);
            imageEdit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(context, EditMobileActivity.class);
                    intent.putExtra("mobile",mobileList.get(getAdapterPosition()));
                    context.startActivity(intent);

                }
            });

            imageDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MobileDbHelper mobileDbHelper= new MobileDbHelper(context);
                    mobileDbHelper.deleteMobile(mobileList.get(getAdapterPosition()));
                    mobileList=mobileDbHelper.getAllMobile();
                    MobileAdapter.this.notifyDataSetChanged();
                }
            });

        }
    }
}
