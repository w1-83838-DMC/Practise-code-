package com.ajaysurse1487.app5.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ajaysurse1487.app5.Fragment.CountryFragment;
import com.ajaysurse1487.app5.Fragment.CourseFragment;
import com.ajaysurse1487.app5.Fragment.StudentFragment;

public class MainFragmentAdapter extends FragmentStateAdapter {


    public MainFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new CountryFragment();
            case 1:
                return new CourseFragment();
            case 2:
                return new StudentFragment();
        }

        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
