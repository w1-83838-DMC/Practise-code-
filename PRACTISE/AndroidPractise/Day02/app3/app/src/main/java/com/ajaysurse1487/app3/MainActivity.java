package com.ajaysurse1487.app3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText editEmail,editPassword;

    private static final String tag="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main1);

          editEmail = findViewById(R.id.editEmail);
          editPassword = findViewById(R.id.editPassword);

    }
    public void save(View view)
    {
        String email=editEmail.getText().toString();
        String password=editPassword.getText().toString();
        if(email.equals(""))
            Toast.makeText(this, "Email Can not be Empty ", Toast.LENGTH_SHORT).show();
        else if (password.equals("")) {
            Snackbar.make(view,"Password cannot be empty", BaseTransientBottomBar.LENGTH_SHORT)
                    .setAction("Ok", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(MainActivity.this, " Ok is Clicked ", Toast.LENGTH_SHORT).show();
                        }
                    }).show();
        }
        else
        {
            Log.e(tag,"Email"+ email);
            Log.e(tag,"Password"+password);
        }
    }
}