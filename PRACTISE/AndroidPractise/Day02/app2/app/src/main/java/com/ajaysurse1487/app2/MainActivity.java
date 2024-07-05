package com.ajaysurse1487.app2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editEmail, editPassword;
    CheckBox checkboxC, checkboxCPP, checkboxJAVA;

    RadioButton radioMale, radioFemale;

    TextView textEmail,textPassword,textLanguages,textGender;

    private static final String tag="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editEmail=findViewById(R.id.editEmail);
        editPassword=findViewById(R.id.editPassword);
        checkboxC=findViewById(R.id.checkboxC);
        checkboxCPP=findViewById(R.id.checkboxCPP);
        checkboxJAVA=findViewById(R.id.checkboxJAVA);
        radioMale=findViewById(R.id.radioMale);
        radioFemale=findViewById(R.id.radioFemale);
        textEmail=findViewById(R.id.textEmail);
        textPassword=findViewById(R.id.textPassword);
        textLanguages=findViewById(R.id.textLanguages);
        textGender=findViewById(R.id.textGender);

    }

    public void save(View v)
    {
        String email=editEmail.getText().toString();
        String password=editPassword.getText().toString();

        List<String> favLanguages =new ArrayList<>();
        if(checkboxC.isChecked())
            favLanguages.add("C");
        if(checkboxCPP.isChecked())
            favLanguages.add("CPP");
        if(checkboxJAVA.isChecked())
            favLanguages.add("JAVA");

        String gender;
        if(radioMale.isChecked())
            gender="Male";
        else if(radioFemale.isChecked())
            gender="Female";
        else
            gender="Other";



        textEmail.setText("Email " + email);
        textPassword.setText("Password "+password);
        textLanguages.setText("Fav Languages"+ favLanguages);
        textLanguages.setText("Gender" + gender);


//        Log.e(tag,"Email : "+email);
//        Log.e(tag,"Password : "+password);
//          Log.e(tag,"fav languages : "+favLanguages);
//          Log.e(tag,"gender : "+gender);



    }

}