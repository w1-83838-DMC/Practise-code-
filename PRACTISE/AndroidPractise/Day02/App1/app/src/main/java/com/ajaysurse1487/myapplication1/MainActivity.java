package com.ajaysurse1487.myapplication1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnSave;
    EditText editName,editEmail,editPassword,editMobile;

    //private  static final String tag="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main2);
        btnSave=findViewById(R.id.btnSave);
        editName=findViewById(R.id.editName);
        editEmail=findViewById(R.id.editEmail);
        editPassword=findViewById(R.id.editPassword);
        editMobile=findViewById(R.id.editMobile);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editName.getText().toString();
                String email=editEmail.getText().toString();
                String password=editPassword.getText().toString();
                String mobile=editMobile.getText().toString();

                editName.setText("");
                editEmail.setText("");
                editPassword.setText("");
                editMobile.setText("");

                //Log.e(tag,"Name"+name);
                Log.e("MainActivity",name);
                Log.e("MainActivity",email);
                Log.e("MainActivity",password);
                Log.e("MainActivity",mobile);


                //Log.e("MainActivity","Save Button Clicked");
            }
        });
    }
    public void cancel(View view)
    {
        Log.e("MainActivity","Cancel Button Clicked");
    }
}