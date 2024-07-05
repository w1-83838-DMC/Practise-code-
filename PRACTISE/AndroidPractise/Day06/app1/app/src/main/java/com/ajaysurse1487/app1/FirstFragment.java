package com.ajaysurse1487.app1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragment extends Fragment {


    private  static final String tag="FirstFragment";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(tag,"onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e(tag,"onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(tag,"onViewCreated");

    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e(tag,"onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(tag,"onStart");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(tag,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(tag,"onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(tag,"onDestroy");
    }
}