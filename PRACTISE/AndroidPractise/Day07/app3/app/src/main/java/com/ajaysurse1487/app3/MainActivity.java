package com.ajaysurse1487.app3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContentResolver resolver= getContentResolver();
        Uri uri= ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        String col1= ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME;
        String col2=ContactsContract.CommonDataKinds.Phone.NUMBER;
        Cursor cursor=resolver.query(uri,new String[]{col1,col2},null,null,null);
        while (cursor.moveToNext())
        {
            Log.e("data",cursor.getString(0)+" - "+ cursor.getString(1));
        }



    }
}