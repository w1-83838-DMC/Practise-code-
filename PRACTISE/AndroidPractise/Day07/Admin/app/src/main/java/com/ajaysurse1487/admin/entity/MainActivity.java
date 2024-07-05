package com.ajaysurse1487.admin.entity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ajaysurse1487.admin.R;
import com.ajaysurse1487.admin.adapter.MobileAdapter;
import com.ajaysurse1487.admin.dbhelper.MobileDbHelper;
import com.ajaysurse1487.admin.entity.Mobile;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<Mobile>mobileList;

    MobileAdapter mobileAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        mobileList=new ArrayList<>();
        //mobileList.add(new Mobile(1,"Samsung s24",10000,"10xdesc"));
        mobileAdapter =new MobileAdapter(this,mobileList);
        recyclerView.setAdapter(mobileAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }

    @Override
    protected void onStart() {
        super.onStart();
        getData();
    }

    public void getData()
    {
        MobileDbHelper mobileDbHelper= new MobileDbHelper(this);
        mobileList=mobileDbHelper.getAllMobile();
        mobileAdapter.setMobileList(mobileList);
        mobileAdapter.notifyDataSetChanged();
    }



    public void addMobile(View view)
    {
        Intent intent = new Intent(this, AddMobileActivity.class);
        startActivity(intent);

    }
}