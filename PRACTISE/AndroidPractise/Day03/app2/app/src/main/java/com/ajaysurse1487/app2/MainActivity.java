package com.ajaysurse1487.app2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editName=findViewById(R.id.editName);
    }

    public void submit(View view)
    {
        Intent intent= new Intent(this, DetailsActivity.class);
        String name=editName.getText().toString();
        intent.putExtra("k_name",name);
        startActivity(intent);
    }

}