package com.ajaysurse1487.app2;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    // Replace with the Firstfragment on the Main Activity
    public void firstFragment(View view)
    {
        // fragment manager is Responsible to load the Fragments on th Activity
        FragmentManager fragmentManager= getSupportFragmentManager();
        // In Fragment transaction we replace we replace the fragment on the frame layout

        FragmentTransaction transaction= fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, FirstFragment.class,null);
        transaction.commit();
    }

    public void secondFragment(View view)
    {
        FragmentManager fragmentManager= getSupportFragmentManager();

        FragmentTransaction transaction=fragmentManager.beginTransaction();

        transaction.replace(R.id.frameLayout, SecondFragment.class,null);
        transaction.commit();
    }

    public void thirdFragment(View view)
    {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, ThirdFragment.class,null)
                .commit();
    }




}