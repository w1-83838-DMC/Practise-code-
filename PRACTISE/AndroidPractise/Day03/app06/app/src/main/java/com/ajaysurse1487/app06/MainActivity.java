package com.ajaysurse1487.app06;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editFirstName,editLastName,editEmail,editMobile;
    CheckBox checkBoxMale,checkBoxFemale;

    RadioButton radioVeg,radioNonVeg;

    private static final String tag="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editFirstName=findViewById(R.id.editFirstName);
        editLastName=findViewById(R.id.editLastName);
        editEmail=findViewById(R.id.editEmail);
        editMobile=findViewById(R.id.editMobile);
        checkBoxMale=findViewById(R.id.checkBoxMale);
        checkBoxFemale=findViewById(R.id.checkBoxFemale);
        radioVeg=findViewById(R.id.radioVeg);
        radioNonVeg=findViewById(R.id.radioNonVeg);
    }
    public void save(View view)
    {
        String firstname=editFirstName.getText().toString();
        String lastname=editLastName.getText().toString();
        String email=editEmail.getText().toString();
        String mobile=editMobile.getText().toString();
        String male=checkBoxMale.getText().toString();
        String female=checkBoxFemale.getText().toString();
        String veg=radioVeg.getText().toString();
        String nonveg=radioNonVeg.getText().toString();

        if(firstname.equals(""))
        {
            Toast.makeText(this, "Enter First Name", Toast.LENGTH_SHORT).show();
        }else if(lastname.equals(""))
        {
            Toast.makeText(this, "Enter Last Name", Toast.LENGTH_SHORT).show();
        }else if(email.equals(""))
        {
            Toast.makeText(this, "Enter the Email", Toast.LENGTH_SHORT).show();
        }else if(mobile.equals(""))
        {
            Toast.makeText(this, "Enter the Mobile", Toast.LENGTH_SHORT).show();
        }

        String gender=null;
        if(checkBoxMale.isChecked())
            gender="male";
        if(checkBoxFemale.isChecked())
            gender="Female";
        else
            Toast.makeText(this, "select the Gender", Toast.LENGTH_SHORT).show();

        String food=null;
        if(radioVeg.isChecked())
            food="Veg";
        else if(radioNonVeg.isChecked())
            food="NonVeg";
        else
            Toast.makeText(this, "select the food ", Toast.LENGTH_SHORT).show();

        Log.e(tag,"firstname"+firstname);
        Log.e(tag,"lastname"+lastname);
        Log.e(tag,"email"+email);
        Log.e(tag,"mobile"+mobile);
        Log.e(tag,"gender"+gender);
        Log.e(tag,"food"+food);

        Register register= new Register(firstname,lastname,email,mobile,male,female,veg,nonveg);
        Intent intent= new Intent(this,StudentDetails.class);
        intent.putExtra("K_Register", register);
        startActivities(intent);

//        Intent intent = new Intent(this,StudentDetails.class);
//        intent.putExtra("k_firstname",firstname);
//        intent.putExtra("k_lastname",lastname);
//        intent.putExtra("k_email",email);
//        intent.putExtra("k_mobile",mobile);
//        intent.putExtra("k_gender",gender);
//        intent.putExtra("k_food",food);
//        startActivities(intent);






    }
}