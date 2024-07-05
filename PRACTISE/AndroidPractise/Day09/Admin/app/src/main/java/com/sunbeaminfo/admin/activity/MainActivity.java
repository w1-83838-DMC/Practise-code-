package com.sunbeaminfo.admin.activity;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
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
       // MobiledbHelper mobiledbHelper= new MobiledbHelper(this);
        // mobleList=mobiledbHelper.getAllMobile();
        //mobileAdapter.setMobileList(mobleList);
        //mobileAdapter.notifyDataSetChanged();

        ContentResolver resolver=getContentResolver();
        Uri uri=Uri.parse("context://com.sunbeaminfo.admin.provider.MobileProvider/mobiles");
        Cursor cursor = resolver.query(uri,null,null,null,null);
        while(cursor.moveToNext())
        {
            Mobile mobile= new Mobile();
            mobile.setId(cursor.getInt(0));
            mobile.setName(cursor.getString(1));
            mobile.setPrice(cursor.getDouble(2));
            mobile.setDesc(cursor.getString(3));
            mobleList.add(mobile);
        }
        mobileAdapter.notifyDataSetChanged();

    }

    public void addmobile(View view)
    {
        Intent intent= new Intent(this, AddMobileActivity.class);
        startActivity(intent);

    }
}