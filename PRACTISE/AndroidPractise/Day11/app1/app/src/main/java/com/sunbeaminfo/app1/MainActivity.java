package com.sunbeaminfo.app1;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
    }

    public void fade(View view)
    {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.fade);
        imageView.startAnimation(animation);
    }
    public void rotate(View view)
    {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.rotate);
        imageView.startAnimation(animation);
    }

    public void translate(View view)
    {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.move);
        imageView.startAnimation(animation);
    }
    public  void scale(View view)
    {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.zoom);
        imageView.startAnimation(animation);
    }
}