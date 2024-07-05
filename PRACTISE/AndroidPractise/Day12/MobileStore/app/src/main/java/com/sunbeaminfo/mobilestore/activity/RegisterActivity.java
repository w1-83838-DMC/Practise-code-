package com.sunbeaminfo.mobilestore.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.JsonObject;
import com.sunbeaminfo.mobilestore.R;
import com.sunbeaminfo.mobilestore.entity.User;
import com.sunbeaminfo.mobilestore.utils.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    EditText editName,editEmail,editPassword,editConfirmPassword,editMobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editName=findViewById(R.id.editName);
        editEmail=findViewById(R.id.editEmail);
        editMobile=findViewById(R.id.editMobile);
        editPassword=findViewById(R.id.editPassword);
        editConfirmPassword=findViewById(R.id.editConfirmPassword);
    }
    public void register(View view)
    {
        String Password=editPassword.getText().toString();
        String ConfirmPassword=editConfirmPassword.getText().toString();

        if(Password.equals(ConfirmPassword))
        {
            User user= new User();
            user.setName(editName.getText().toString());
            user.setEmail(editEmail.getText().toString());
            user.setMobile(editMobile.getText().toString());
            user.setPassword(Password);
            RetrofitClient.getInstance().getApi().createUser(user).enqueue(new Callback<JsonObject>() {
                @Override
                public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                    Toast.makeText(RegisterActivity.this, "Registeration Completed", Toast.LENGTH_SHORT).show();
                    finish();
                }

                @Override
                public void onFailure(Call<JsonObject> call, Throwable throwable) {
                    Toast.makeText(RegisterActivity.this, "", Toast.LENGTH_SHORT).show();
                    
                }
            });
        }
        else
        {
            Toast.makeText(this, "Password does Not Match", Toast.LENGTH_SHORT).show();
        }
    }
    public void cancel(View view)
    {
        finish();
    }
}
