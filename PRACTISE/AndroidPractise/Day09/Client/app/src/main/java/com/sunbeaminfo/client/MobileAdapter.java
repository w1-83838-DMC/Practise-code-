package com.sunbeaminfo.client;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunbeaminfo.client.entity.Mobile;

import java.util.List;
import java.util.zip.Inflater;

public class MobileAdapter extends RecyclerView.Adapter<MobileAdapter.MobileViewHolder>{

    Context context;
    List<Mobile> mobileList;

    public MobileAdapter(Context context, List<Mobile> mobileList) {
        this.context = context;
        this.mobileList = mobileList;
    }

    @NonNull
    @Override
    public MobileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.list_mobile,null);
        return new MobileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MobileViewHolder holder, int position) {
        holder.textName.setText("Name - " +mobileList.get(position).getName());
        holder.textPrice.setText("Rs - "+ mobileList.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return mobileList.size();
    }

    class MobileViewHolder extends RecyclerView.ViewHolder{

        TextView textName,textPrice;

        public MobileViewHolder(@NonNull View itemView) {
            super(itemView);
            textName=itemView.findViewById(R.id.textName);
            textPrice=itemView.findViewById(R.id.textPrice);
        }
    }
}
