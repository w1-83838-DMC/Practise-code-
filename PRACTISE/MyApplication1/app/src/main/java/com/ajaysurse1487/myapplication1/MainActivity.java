package com.ajaysurse1487.myapplication1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //setContentView(R.layout.activity_main2);
        //setContentView(R.layout.activity_main);
        //textName=findViewById(R.id.txtName);
        //textName=findViewById(R.id.textname);
        //textName.setText("Hello Sunbeam DMC ");


    }
}