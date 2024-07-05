package com.ajaysurse1487.app4;

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
    RadioButton radioMale,radioFemale,radioVeg,radioNonVeg;

    CheckBox checkboxMale,checkboxFemale;


    private static final String tag="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editFirstName=findViewById(R.id.editFirstName);
        editLastName=findViewById(R.id.editLastName);
        editEmail=findViewById(R.id.editEmail);
        editMobile=findViewById(R.id.editMobile);
        radioMale=findViewById(R.id.radioMale);
        radioFemale=findViewById(R.id.radioFemale);
        radioVeg=findViewById(R.id.radioVeg);
        radioNonVeg=findViewById(R.id.radioNonVeg);
        checkboxMale=findViewById(R.id.checkboxMale);
        checkboxFemale=findViewById(R.id.checkboxFemale);

    }

    public void save(View view)
    {
        String firstName=editFirstName.getText().toString();
        String LastName=editLastName.getText().toString();
        String email=editEmail.getText().toString();
        String mobile=editMobile.getText().toString();
        //String Male=radioMale.getText().toString();
        //String Female=radioFemale.getText().toString();
        //String veg=radioVeg.getText().toString();
        //String Nonveg=radioNonVeg.getText().toString();


        if(firstName.equals(""))
        {
            Toast.makeText(this, "Enter FirstName", Toast.LENGTH_SHORT).show();
        }else if(LastName.equals(""))
        {
            Toast.makeText(this, "Enter LastName", Toast.LENGTH_SHORT).show();
        }else if (email.equals("")){
            Toast.makeText(this, "Enter the Email ", Toast.LENGTH_SHORT).show();
        }else if(mobile.equals("")) {
            Toast.makeText(this, "Enter The Mobile ", Toast.LENGTH_SHORT).show();
        }
        String gender=null;
        if(radioMale.isChecked())
        {
            gender="Male";
        }else if(radioFemale.isChecked())
        {
            gender="Female";
        }
        else{
            Toast.makeText(this, "Select the  Gender ", Toast.LENGTH_SHORT).show();
        }
        String food = null;
        if(radioVeg.isChecked())
        {
            food="Veg";
        }else if(radioNonVeg.isChecked())
        {
            food="Non Veg";
        }else
        {
            Toast.makeText(this, "Select the Food ", Toast.LENGTH_SHORT).show();
        }

        List<String>gender1=new ArrayList<>();
        if(checkboxMale.isChecked())
            gender1.add("Male");
        if(checkboxFemale.isChecked())
            gender1.add("Female");



            Log.e(tag,"firstName "+firstName);
            Log.e(tag,"LastName "+LastName);
            Log.e(tag, "Email " +email);
            Log.e(tag,"mobile "+mobile);
            Log.e(tag,"Gender "+gender);
            Log.e(tag,"Gender1"+gender1);
            Log.e(tag,"food "+food);
    }

}