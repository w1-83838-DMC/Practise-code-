package com.sunbeaminfo.client;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sunbeaminfo.client.entity.Mobile;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<Mobile> mobileList;

    MobileAdapter mobileAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        mobileList= new ArrayList<>();
        //mobileList.add(new Mobile(1,"m1",1000,"dec1"));
        //mobileList.add(new Mobile(2,"m2",2000,"dec2"));

        MobileAdapter mobileAdapter= new MobileAdapter(this,mobileList);
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
        ContentResolver resolver=getContentResolver();
        Uri uri=Uri.parse("content://com.sunbeaminfo.admin.provider.MobileProvider/mobiles");
        Cursor cursor=resolver.query(uri,null,null,null,null);
        mobileList.clear();
        while (cursor.moveToNext())
        {
            Mobile mobile= new Mobile();
            mobile.setId(cursor.getInt(0));
            mobile.setName(cursor.getString(1));
            mobile.setPrice(cursor.getDouble(2));
            mobile.setDesc(cursor.getString(3));
            mobileList.add(mobile);
        }
        mobileAdapter.notifyDataSetChanged();
    }
}