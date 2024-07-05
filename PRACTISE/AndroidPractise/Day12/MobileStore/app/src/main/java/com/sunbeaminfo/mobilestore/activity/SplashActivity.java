package com.sunbeaminfo.mobilestore.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.sunbeaminfo.mobilestore.R;
import com.sunbeaminfo.mobilestore.utils.Constants;

public class SplashActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView=findViewById(R.id.imageView);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.fade);
        imageView.startAnimation(animation);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    //startActivity(new Intent(SplashActivity.this, LoginActivity.class));

                    if(getSharedPreferences(Constants.PREFERENCE_FILE_NAME,MODE_PRIVATE).getBoolean(Constants.LOGIN_STATUS,false))
                        startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    else
                        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}