package com.ajaysurse1487.app4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<String>countries;

    CountryAdapter countryAdapter;

    EditText editCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        editCountry=findViewById(R.id.editCountry);

        countries=new ArrayList<>();
        countries.add("INDIA");
        countries.add("USA");

        countryAdapter= new CountryAdapter(this,countries);
        recyclerView.setAdapter(countryAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }

    public void addCountry(View view)
    {
        String country=editCountry.getText().toString();
        countries.add(country);
        editCountry.setText(" ");
        countryAdapter.notifyDataSetChanged();

    }
}