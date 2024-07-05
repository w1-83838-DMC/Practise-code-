package com.ajaysurse1487.app2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailsActivity extends AppCompatActivity {

    TextView textName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);
        Intent intent=getIntent();
        String name=intent.getStringExtra("k_name");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        textName=findViewById(R.id.textName);
        textName.setText("Hello" + name);


    }
}