package com.sunbeaminfo.admin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunbeaminfo.admin.entity.Mobile;

import java.util.List;

public class MobileAdapter extends RecyclerView.Adapter<MobileAdapter.MobileViewHolder>{

    Context context;

    List<Mobile>mobileList;


    public MobileAdapter(Context context, List<Mobile> mobileList) {
        this.context = context;
        this.mobileList = mobileList;
    }

    @NonNull
    @Override
    public MobileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate()
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MobileViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    class MobileViewHolder extends RecyclerView.ViewHolder{

        public MobileViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
