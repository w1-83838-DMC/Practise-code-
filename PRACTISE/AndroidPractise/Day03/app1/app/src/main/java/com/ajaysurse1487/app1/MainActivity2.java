package com.ajaysurse1487.app1;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private final static String tag="MainActivity2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
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
        Log.e(tag,"onResume");
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
}