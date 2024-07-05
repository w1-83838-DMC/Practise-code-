package com.sunbeaminfo.mobilestore;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.gson.JsonObject;
import com.sunbeaminfo.mobilestore.entity.User;
import com.sunbeaminfo.mobilestore.utils.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    EditText editName,editEmail,editPassword,editMobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editName=findViewById(R.id.editName);
        editEmail=findViewById(R.id.editEmail);
        editPassword=findViewById(R.id.editPassword);
        editMobile=findViewById(R.id.editEmail);

    }

    public void save(View view)
    {
        User user= new User();
        user.setName(editName.getText().toString());
        user.setEmail(editEmail.getText().toString());
        user.setPassword(editPassword.getText().toString());
        user.setMobile(editMobile.getText().toString());
        RetrofitClient.getInstance().getApi().createUser(user).enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if(response.body().get("status").getAsString().equals("success"))
                {
                    Toast.makeText(RegisterActivity.this, "Registeration Succesfull", Toast.LENGTH_SHORT).show();
                    finish();
                }else
                {
                    Toast.makeText(RegisterActivity.this, "Registeration Failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable throwable) {
                Toast.makeText(RegisterActivity.this, "Something went wrong ", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
