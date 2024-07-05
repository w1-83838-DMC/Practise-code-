package com.sunbeaminfo.admin.entity;

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

import com.sunbeaminfo.admin.R;
import com.sunbeaminfo.admin.activity.AddMobileActivity;
import com.sunbeaminfo.admin.adapter.MobileAdapter;
import com.sunbeaminfo.admin.dbhelper.MobiledbHelper;
import com.sunbeaminfo.admin.entity.Mobile;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    List<Mobile> mobleList;

    MobileAdapter mobileAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        mobleList= new ArrayList<>();
        mobileAdapter= new MobileAdapter(this,mobleList);
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
        MobiledbHelper mobiledbHelper= new MobiledbHelper(this);
        mobleList=mobiledbHelper.getAllMobile();
        mobileAdapter.setMobileList(mobleList);
        mobileAdapter.notifyDataSetChanged();
    }

    public void addmobile(View view)
    {
        Intent intent= new Intent(this, AddMobileActivity.class);
        startActivity(intent);

    }
}