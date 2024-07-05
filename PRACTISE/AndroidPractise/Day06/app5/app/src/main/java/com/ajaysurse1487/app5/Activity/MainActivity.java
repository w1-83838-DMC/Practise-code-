package com.ajaysurse1487.app5.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.ajaysurse1487.app5.Adapter.MainFragmentAdapter;
import com.ajaysurse1487.app5.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {


    ViewPager2 viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabLayout);

        MainFragmentAdapter mainFragmentAdapter= new MainFragmentAdapter(this);
        viewPager.setAdapter(mainFragmentAdapter);

        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int i) {
                switch (i)
                {
                    case 0:
                        tab.setIcon(R.drawable.baseline_fmd_good_24);
                        break;

                    case 1:
                        tab.setIcon(R.drawable.baseline_menu_book_24);
                        break;

                    case 2:
                        tab.setIcon(R.drawable.baseline_account_box_24);
                        break;
                }

            }
        }).attach();


    }
}