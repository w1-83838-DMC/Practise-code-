package com.ajaysurse1487.app1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("first");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Add");
        menu.add("profile");
        menu.add("setting");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getTitle().equals("Add"))
            //Toast.makeText(this, "Add seleted", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,SecondActivity.class));
        else if(item.getTitle().equals("profile"))
            //Toast.makeText(this, "Profile selected ", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,SecondActivity.class));
        else
            //Toast.makeText(this, "setting selected", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,SecondActivity.class));
        return  super.onOptionsItemSelected(item);
    }

    public void secondActivity(View view)
    {
        Intent intent= new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

}