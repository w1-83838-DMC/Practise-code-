package com.ajaysurse1487.myapplication;

import android.os.Bundle;
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
        Log.e("MainActivity","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity","onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity","onDestroy()");
    }
}