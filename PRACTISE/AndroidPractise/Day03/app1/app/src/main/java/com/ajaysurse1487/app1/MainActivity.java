package com.ajaysurse1487.app1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private final static String tag="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.e(tag,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(tag,"onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(tag,"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(tag,"onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e(tag,"onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(tag,"onDestroy");
    }

    public void call(View view)
    {
        Intent intent= new Intent();  // Implicit Intent
        intent.setAction(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel: 9403572214"));
        startActivity(intent);
    }

    public void browser(View view)
    {
        Intent intent= new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://sunbeaminfo.com/placements"));
        startActivity(intent);
    }

    public void secondActivity(View view)
    {
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}