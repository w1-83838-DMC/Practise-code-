package com.ajaysurse1487.app05;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity1 extends AppCompatActivity {

    Spinner spinnerCountry,spinnerState;

    List<String>countries;

    List<String>state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner1);
        spinnerCountry=findViewById(R.id.spinnerCountry);
        spinnerState=findViewById(R.id.spinnerState);
        countries= new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("China");
        countries.add("JAPAN");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,countries);
        spinnerCountry.setAdapter(adapter);
        spinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                        if(countries.get(position)=="India")
                        {
                            state= new ArrayList<>();
                            state.add("Maharshtra");
                            state.add("Bihar");
                            state.add("chathisgardh");
                            state.add("punjab");
                            ArrayAdapter adapter1= new ArrayAdapter(SpinnerActivity1.this, android.R.layout.simple_list_item_1,state);
                            spinnerState.setAdapter(adapter1);

                        }

                        if(countries.get(position)=="USA")
                        {
                            state= new ArrayList<>();
                            state.add("San fransico");
                            state.add("New York");
                            state.add("Los Angeles");
                            ArrayAdapter adapter1= new ArrayAdapter(SpinnerActivity1.this, android.R.layout.simple_list_item_1,state);
                            spinnerState.setAdapter(adapter1);

                        }

                        if(countries.get(position)=="UK")
                        {
                            state= new ArrayList<>();
                            state.add("England");
                            state.add("United Kingdom");
                            state.add("France");
                            state.add("London");
                            ArrayAdapter adapter1= new ArrayAdapter(SpinnerActivity1.this, android.R.layout.simple_list_item_1,state);
                            spinnerState.setAdapter(adapter1);
                        }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView    ) {

            }
        });

//        spinnerCountry=findViewById(R.id.spinnerCountry);
//        countries.add("India");
//        countries.add("USA");
//        countries.add("UK");
//        countries.add("China");
//        countries.add("Japan");


    }
}