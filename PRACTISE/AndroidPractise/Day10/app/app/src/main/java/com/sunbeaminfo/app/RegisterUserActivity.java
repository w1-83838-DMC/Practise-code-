package com.sunbeaminfo.app;

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

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegisterUserActivity extends AppCompatActivity {
    EditText editName,editEmail,editPassword,editMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        editName=findViewById(R.id.editName);
        editEmail=findViewById(R.id.editEmail);
        editPassword=findViewById(R.id.editPassword);
        editMobile=findViewById(R.id.editMobile);
    }

    public void register(View view)
    {
        User user= new User();
        user.setName(editName.getText().toString());
        user.setEmail(editEmail.getText().toString());
        user.setPassword(editPassword.getText().toString());
        user.setMobile(editMobile.getText().toString());

        new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api.class)
                .registerUser(user)
                .enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                        if(response.body().get("status").getAsString().equals("success")) {
                            Toast.makeText(RegisterUserActivity.this, "Registeration Succesfull", Toast.LENGTH_SHORT).show();
                            finish();
                        }else
                        {
                            Toast.makeText(RegisterUserActivity.this, "Registeration Failed", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable throwable) {
                        Toast.makeText(RegisterUserActivity.this, "Something went wrong ", Toast.LENGTH_SHORT).show();

                    }
                });

    }
    public void cancel(View view)
    {
        finish();
    }


}