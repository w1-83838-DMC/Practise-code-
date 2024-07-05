package com.ajaysurse1487.app05;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxCPP,checkBoxJAVA;
    ImageView imageCPP,imageJAVA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        checkBoxCPP=findViewById(R.id.checkBoxCPP);
        checkBoxJAVA=findViewById(R.id.checkBoxJAVA);
        imageCPP=findViewById(R.id.imageCPP);
        imageJAVA=findViewById(R.id.imageJAVA);

    }

    public void showImage(View view)
    {
        if(checkBoxCPP.isChecked())
        {
            imageCPP.setImageResource(R.drawable.cpp);
        }else
        {
            imageCPP.setImageResource(R.drawable.ic_launcher_background);
        }
        if(checkBoxJAVA.isChecked())
        {
            imageJAVA.setImageResource(R.drawable.java);
        }else
        {
            imageJAVA.setImageResource(R.drawable.ic_launcher_background);
        }

    }
}