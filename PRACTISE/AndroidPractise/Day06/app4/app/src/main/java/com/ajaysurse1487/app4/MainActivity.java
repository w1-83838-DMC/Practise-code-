package com.ajaysurse1487.app4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabLayout);
        // to display all the fragments on the swipe Action

        MyFragmentAdapter fragmentAdapter= new MyFragmentAdapter(this);
        viewPager.setAdapter(fragmentAdapter);

        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int i) {
                switch (i)
                {
                    case 0:
                        //tab.setText("First");
                        tab.setIcon(R.drawable.baseline_group_24);
                        break;
                    case 1:
                        //tab.setText("Second");
                        tab.setIcon(R.drawable.baseline_electric_car_24);
                        break;
                    case 2:
                        //tab.setText("Third");
                        tab.setIcon(R.drawable.baseline_library_books_24);
                        break;
                }
            }
        }).attach();

    }
}