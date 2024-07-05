package com.ajaysurse1487.app3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listCountries;
    List<String>countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCountries=findViewById(R.id.listCountries);
        countries= new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("China");
        countries.add("Japan");

        ArrayAdapter adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,countries);
        listCountries.setAdapter(adapter);
        listCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selected Country-"+countries.get(position), Toast.LENGTH_SHORT).show();

            }
        });

        listCountries.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                PopupMenu popupMenu= new PopupMenu(MainActivity.this,view);
                popupMenu.getMenu().add("Edit");
                popupMenu.getMenu().add("Delete");
                popupMenu.show();
                return false;
            }
        });



    }
}